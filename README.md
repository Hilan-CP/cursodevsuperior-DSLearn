# Projeto DSLearn
Este é um projeto da DevSuperior para explorar modelo de domínio com relacionamento complexos.

## Descrição
O sistema consiste em uma plataforma de ensino que mantém informações de cursos, suas turmas e alunos, bem como um fórum para perguntas e respostas sobre os conteúdos do curso. Os atores do sistema podem ser alunos e professores. Há também usuários administradores, que são os únicos autorizados a cadastrar cursos e turmas.

Um curso é composto de vários “recursos”, que são grupos de conteúdos. Estes recursos podem ser trilhas de aprendizado, bônus, links externos, e o próprio fórum de perguntas e respostas do curso. Cada recurso pode conter seções, e estas seções por sua vez é que vão conter as aulas, que podem ser conteúdos em vídeo e/ou texto, ou tarefas para serem entregues pelos alunos.

Uma tarefa pode ter um peso, uma data de entrega, um número de questões e a quantidade mínima de acertos necessários para ser aceita. Quando um aluno entrega a tarefa, esta fica aguardando pelo feedback do professor, e ela pode ser aceita ou rejeitada.

Cada nova turma do curso corresponde a uma oferta ou edição deste curso, que possui uma data de início e fim. Diferentes ofertas do mesmo curso podem ter pequenas variações no conteúdo, conforme a necessidade de customização para cada turma.

Os usuários (alunos e professores) devem receber notificações.

Com relação ao fórum de perguntas e respostas, este consiste em uma coleção de tópicos (com um título e a descrição da pergunta), e cada tópico pode ter várias respostas. Os requisitos gerais do fórum são:
- Listar tópicos, com as seguintes opções de filtro:
  - Por recurso/seção/aula
  - Por texto (título e/ou corpo do tópico)
  - Perguntas feitas apenas pelo usuário logado
- Criar tópico: título, corpo
- Responder tópico
- Marcar/desmarcar upvote em pergunta (não pode ser o autor)
- Marcar/desmarcar upvote em resposta (não pode ser o autor)
- Marcar/desmarcar melhor resposta (somente autor do tópico e instrutor)

## Diagrama de classes
![modelo-conceitual-com-forum](https://github.com/user-attachments/assets/edcf1568-c051-4bba-a722-a6fb8ba5ff72)
