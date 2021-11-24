-- INSERT INTO users (username, password, enabled, first_name, first_last_name, email) VALUES ('andres','$2a$10$ykhXmCAam5FUEF9GN.4Z8OwwWJidvMii6VFYe77cmS2X6oF6p4W86',true, 'Andres', 'Guzman','profesor@bolsadeideas.com');
-- INSERT INTO users (username, password, enabled, first_name, first_last_name, email) VALUES ('admin','$2a$10$qGyDfZLBB.SgLv7GCP3uZe3oM38fVtr58T1iZ1LNOvO61loNUAAaK',true, 'John', 'Doe','jhon.doe@bolsadeideas.com');

INSERT INTO roles (nombre) VALUES ('ROLE_JURIDICO') ;
INSERT INTO roles (nombre) VALUES ('ROLE_ADMINISTRADOR') ;
INSERT INTO roles (nombre) VALUES ('ROLE_TECNICO') ;
INSERT INTO roles (nombre) VALUES ('ROLE_ASISTENCIAL') ;
-- select * from users;
-- select * from roles;
-- select * from users_roles;
--
-- INSERT INTO users_roles (user_id, role_id) VALUES (8, 8);
-- INSERT INTO users_roles (user_id, role_id) VALUES (18, 18);
-- INSERT INTO users_roles (user_id, role_id) VALUES (8, 18);




