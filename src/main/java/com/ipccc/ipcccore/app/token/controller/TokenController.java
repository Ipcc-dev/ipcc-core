package com.ipccc.ipcccore.app.token.controller;

import com.ipccc.ipcccore.app.token.IUsuarioService;
import com.ipccc.ipcccore.app.token.dto.Token;
import com.ipccc.ipcccore.app.token.dto.TokenRequest;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class TokenController {

  @Autowired
  private IUsuarioService userDetailsService;

  @PostMapping("/token")
  public Token login(@RequestBody TokenRequest tokenRequest) {

    String token = getJWTToken(tokenRequest.getUser(), tokenRequest.getPassword());
    Token user = new Token();
    user.setUser(tokenRequest.getUser());
    user.setToken(token);
    return user;

  }
  @PostMapping("/token/anonimo")
  public Token loginAnonimo(@RequestBody TokenRequest tokenRequest) {

    String token = getJWTToken(tokenRequest.getUser(), tokenRequest.getPassword());
    Token user = new Token();
    user.setUser(tokenRequest.getUser());
    user.setToken(token);
    return user;

  }

  private String getJWTToken(String username, String pwd) {
    Collection<? extends GrantedAuthority> grantedAuthorities;
    String secretKey = "mySecretKey";
    if(pwd==null || pwd.isEmpty()){
      grantedAuthorities = AuthorityUtils
          .commaSeparatedStringToAuthorityList("ROLE_USER");
    }else {
      UserDetails user = userDetailsService.loadUserByUsername(username, pwd);
      grantedAuthorities = user.getAuthorities();
    }
    String token = Jwts
        .builder()
        .setId("ipccJWT")
        .setSubject(username)
        .claim("authorities",
            grantedAuthorities.stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList()))
        .setIssuedAt(new Date(System.currentTimeMillis()))
        .setExpiration(new Date(System.currentTimeMillis() + 600000))
        .signWith(SignatureAlgorithm.HS512,
            secretKey.getBytes()).compact();

    return token;
  }
}
