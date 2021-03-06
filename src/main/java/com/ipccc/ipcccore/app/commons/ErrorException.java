package com.ipccc.ipcccore.app.commons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorException extends RuntimeException {

  public static final String DEFAULT_ERROR_CODE = "ERR";
  private static final long serialVersionUID = 1L;
  private String code;

  public ErrorException() {
    this(DEFAULT_ERROR_CODE);
  }

  public ErrorException(String message) {
    this(message, DEFAULT_ERROR_CODE);
  }

  public ErrorException(String message, String code) {
    super(message);
    this.code = code;
  }

  public ErrorException(String message, Throwable cause) {
    this(message, cause, DEFAULT_ERROR_CODE);
  }

  public ErrorException(String message, Throwable cause, String code) {
    super(message, cause);
    this.code = code;
  }
}