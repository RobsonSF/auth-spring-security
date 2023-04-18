
--- INSERT ROLES
INSERT INTO TB_ROLE (ID, NAME) VALUES('81e47e1c-a566-11ec-b909-0242ac120002', 'USER');
INSERT INTO TB_ROLE (ID, NAME) VALUES('b60974bc-7fe1-44c9-a874-cd989b961ec9', 'ADMIN');

INSERT INTO TB_USER (ID, NAME, USERNAME, PASSWORD) VALUES('b60974bc-7fe1-44c9-a874-cd969b961ec9', 'Maria', 'marialaura', '$2a$10$vkN8aFtroSs9eMkC7cEJROSMWtqdyyP4Xs2ggNOUUBb1Snf0zgGyy');
INSERT INTO TB_USER (ID, NAME, USERNAME, PASSWORD) VALUES('34d71e45-54fc-45ce-a783-be39f8bf7982', 'Luana', 'luanastele', '$2a$10$vkN8aFtroSs9eMkC7cEJROSMWtqdyyP4Xs2ggNOUUBb1Snf0zgGyy');

INSERT INTO TB_USER_ROLES (USER_ID, ROLES_ID) VALUES('b60974bc-7fe1-44c9-a874-cd969b961ec9', '81e47e1c-a566-11ec-b909-0242ac120002');
INSERT INTO TB_USER_ROLES (USER_ID, ROLES_ID) VALUES('34d71e45-54fc-45ce-a783-be39f8bf7982', 'b60974bc-7fe1-44c9-a874-cd989b961ec9');


--- INSERT PRODUCTS
INSERT INTO TB_PRODUCT (ID, NAME, DESCRIPTION) VALUES ('d2cae6f5-736f-4ae1-addc-99e26a5426e3','Camiseta', 'Camiseta branca masculina');
INSERT INTO TB_PRODUCT (ID, NAME, DESCRIPTION) VALUES ('3d5b5c38-9995-4d55-8167-92b0d6a37eca','Calça', 'Calça skinny feminina');
INSERT INTO TB_PRODUCT (ID, NAME, DESCRIPTION) VALUES ('34d71e45-54fc-45ce-a783-be39f8bf7982', 'Vestido', 'Vestido longo rosa');
