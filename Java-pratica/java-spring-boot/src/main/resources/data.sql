INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '$2a$10$5oIJsMvxjsCtu1r50gDS/.a5s5zeb16IcsI0.SdbLeLmc9FFgwiJu');

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida', 'Erro ao cria projeto', '2021-11-05 10:00:00', 'NAO_RESPONDIDO', 1,1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 2 ', 'Projeto não compila', '2021-11-05 10:00:00', 'NAO_RESPONDIDO', 1,1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 3', 'Tag HTML', '2021-11-05 10:00:00', 'NAO_RESPONDIDO', 1,2);
