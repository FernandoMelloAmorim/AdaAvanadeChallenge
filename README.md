# Spring Warriors - API Rest Java Spring Boot

Bem-vindo a Spring Warriors, um projeto utilizando as tecnologias Spring Boot e PostgreSQL que permite criar personagens como heróis e monstros, além duelar em batalhas épicas em turnos! Este projeto é inspirado em jogos de RPG como Advanced Dungeons & Dragons (AD&D) e oferece funcionalidades para criar, gerenciar e duelar com personagens. Inicialmente idealizado como projeto de conclusão do Bootcamp Java Academy da Ada Tech junto a empresa Avanade.

## Funcionalidades Principais

- Crie e gerencie heróis e monstros com atributos únicos.
- Realize batalhas em turnos entre heróis e monstros.
- Gere valores aleatório com dados com diferentes números de faces para calcular o resultado das batalhas.
- Armazene o histórico das batalhas em um banco de dados PostgreSQL.
- Utilize endpoints REST para realizar operações CRUD com os personagens.
- Divirta-se duelando e testando as habilidades dos personagens!

##  Tecnologias utilizadas
- Java 17
- Spring Boot 3
- JPA / Hibernate
- Postegres 15
- Gradle

## Como Iniciar o Projeto

- Clone este repositório para a sua máquina local:

  ```bash
  git clone https://github.com/seu-usuario/rpg-em-turnos.git
  ```

- Acesse o diretório do projeto::

  ```bash
  cd AdaAvanadeChallenge
  ```
- Configure o arquivo application.properties com as informações do seu banco de dados PostgreSQL.

- Execute o projeto usando Gradle:

  ```bash
  ./gradlew bootRun
  ```
- Acesse o aplicativo em http://localhost:8080 no seu navegador.

## Endpoints Disponíveis

- GET /heroes: Retorna a lista de todos os herói.
- GET /heroes/{id}: Retorna os detalhes de um herói específico.
- POST /heroes: Cria um novo herói.
- PUT /heroes/{id}: Atualiza os dados de um herói existente.
- DELETE /heroes/{id}: Exclui um herói.
- GET /monsters: Retorna a lista de todos os monstro.
- GET /monsters/{id}: Retorna os detalhes de um monstro específico.
- POST /monsters: Cria um novo monstro.
- PUT /monsters/{id}: Atualiza os dados de um monstro existente.
- DELETE /monsters/{id}: Exclui um monstro.
- POST /battle: Inicia uma batalha entre o jogador e um monstro inimigo.
- GET /battleRecord: Retorna os detalhes de todas as batalhas.
- GET /battleRecord/{id}: Retorna os detalhes de uma batalha específica.

## Contribuindo

Se deseja contribuir com melhorias ou novas funcionalidades, fique à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto é licenciado sob a licença MIT. Consulte o arquivo LICENSE para obter mais detalhes.

Divirta-se criando e duelando com seus heróis e monstros no Spring Warriors! 🎮✨

## Autor

Fernando Mello de Amorim https://www.linkedin.com/in/fernando-mello-de-amorim/
