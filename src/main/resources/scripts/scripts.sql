INSERT INTO public.tseg_usuarios (cdidusuario, password, dsnombre)
VALUES (0, '$2a$10$X8PoCgh7SaxKZAzWVi/TcuOoyeCm5uIGgUyPOdlYMmuC7SpQeDUv2', 'UserAdminPepe');
INSERT INTO public.tseg_roles (cdidrol, dsnombre)
VALUES (0, 'ADMIN');
INSERT INTO public.tseg_usuarios_roles (cdidusuario, cdidrol)
VALUES (0, 0);
