INSERT INTO users (username, password, enabled)
values ('user', 'default_pass', true);

INSERT INTO users (username, password, enabled)
values ('admin', 'default_pass_admin', true);

INSERT INTO authorities (username, authority)
values ('user', 'ROLE_USER');

INSERT INTO authorities (username, authority)
values ('admin', 'ROLE_ADMIN');