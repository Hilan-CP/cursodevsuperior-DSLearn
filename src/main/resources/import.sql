INSERT INTO tb_role(authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role(authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role(authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user(name, email, password) VALUES ('Bob','bob@email.com','123456');
INSERT INTO tb_user(name, email, password) VALUES ('John','john@email.com','123456');
INSERT INTO tb_user(name, email, password) VALUES ('Mary','mary@email.com','123456');

INSERT INTO tb_user_role(user_id, role_id) VALUES (1,1);
INSERT INTO tb_user_role(user_id, role_id) VALUES (2,1);
INSERT INTO tb_user_role(user_id, role_id) VALUES (2,2);
INSERT INTO tb_user_role(user_id, role_id) VALUES (3,2);
INSERT INTO tb_user_role(user_id, role_id) VALUES (3,3);