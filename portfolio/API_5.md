# API 5º Semestre (Banco de Dados) - 01/2026

[![GitHub Repositório do Projeto](https://img.shields.io/badge/GitHub-Repositório%20Projeto-181717?style=for-the-badge&logo=github)](https://github.com/SQLutions-FATEC/API-5-Semestre)

**Parceiro Acadêmico:** [SIATT - Sistemas Integrados de Alto Teor Tecnológico](https://www.siatt.com.br/)

![FATEC São José dos Campos](https://github.com/BryanRibeiro/Portfolio-Projetos/blob/main/images/fatecsjc_400x192.png)

## Resumo do Projeto 📋

O desafio veio da SIATT (Sistemas Integrados de Alto Teor Tecnológico), empresa brasileira de defesa e aeroespacial fundada em 2015, com sede no Parque Tecnológico de São José dos Campos (SP) e integrada ao grupo internacional EDGE. A empresa desenvolve armamentos inteligentes, como mísseis e foguetes guiados, integra sistemas de armas em plataformas navais, aéreas e terrestres e produz eletrônica embarcada, radares e sensores. Com vários programas e projetos conduzidos ao mesmo tempo — entre eles o MANSUP e o MAX 1.2 AC —, os dados ficavam dispersos em diferentes sistemas e planilhas, o que dificultava a visão consolidada de custos, horas, materiais e compras. A equipe SQLutions propôs o **Synthesi**, um ambiente analítico que centraliza, transforma e organiza esses dados com estratégias de Data Warehouse.

A solução importa arquivos CSV, passa os registros por um processo de ETL e os organiza em um modelo dimensional com dimensões de tempo, programa, projeto, tarefa, solicitação, material e fornecedor, além das tabelas fato de tarefa, empenho e compra. Sobre essa base, a aplicação web oferece um seletor de programas e projetos, visão geral do projeto (gastos totais e horas trabalhadas), acompanhamento de solicitações e pedidos, controle de estoque, evolução dos gastos e análise de fornecedores.

## Tecnologias Adotadas 💻

- [Python](https://www.python.org/): Linguagem do back-end e das rotinas de ETL.
- [Django](https://www.djangoproject.com/): Framework web do back-end e da API REST.
- [MySQL](https://www.mysql.com/): Banco de dados relacional exigido pelo parceiro.
- [React](https://react.dev/): Biblioteca para construção das interfaces.
- [TypeScript](https://www.typescriptlang.org/): Tipagem do front-end.
- [Tailwind CSS](https://tailwindcss.com/): Estilização das telas.
- [Material UI](https://mui.com/): Componentes de interface e tabelas de dados.
- [Recharts](https://recharts.org/): Gráficos dos dashboards.
- [Docker](https://www.docker.com/): Conteinerização dos serviços e do banco de testes.
- [Nginx](https://nginx.org/) e [Gunicorn](https://gunicorn.org/): Servidor de arquivos e de aplicação.
- [AWS ECS](https://aws.amazon.com/ecs/): Implantação em nuvem.
- [GitHub Actions](https://github.com/features/actions): Esteiras de integração contínua.
- [SonarCloud](https://www.sonarsource.com/products/sonarcloud/): Análise estática de qualidade e segurança.
- [Pytest](https://docs.pytest.org/) e [Vitest](https://vitest.dev/): Testes automatizados de back-end e front-end.
- [Prometheus](https://prometheus.io/) e [Grafana](https://grafana.com/): Monitoramento da aplicação.
- [Locust](https://locust.io/): Testes de carga e de estresse.
- [Jira](https://www.atlassian.com/software/jira), [Slack](https://slack.com/) e [Figma](https://www.figma.com/): Gestão ágil, comunicação e prototipação.

## Contribuições Individuais 🎯

### Atuação como Scrum Master e DevOps

Atuei como Scrum Master da equipe, mantendo o backlog e o quadro de tarefas no Jira, apoiando a definição dos critérios de pronto e de preparado (DoR/DoD), organizando o planejamento e o acompanhamento das sprints e garantindo a rastreabilidade entre requisito, tarefa, branch e pull request.

Na dimensão de DevOps, implementei as esteiras de integração contínua dos repositórios de back-end e de front-end com GitHub Actions. As esteiras foram divididas em dois estágios: o primeiro faz a verificação rápida do código, com análise estática e testes unitários; o segundo levanta um ambiente com Docker Compose, cria um banco MySQL temporário, aguarda o healthcheck, aplica as migrações e executa os testes de integração, além de gerar o relatório de cobertura.

Também configurei as ferramentas de padronização e qualidade do código, como flake8, black, ESLint e Prettier, e integrei o SonarCloud à esteira para acompanhar bugs, vulnerabilidades e débito técnico em cada pull request. Por fim, ajustei o processo de implantação para validar e aplicar as migrações do banco antes da publicação, evitando que mudanças inconsistentes chegassem ao ambiente de produção.

## Funcionamento 💡

Demonstrações das entregas de cada sprint:

- [Sprint 1 - Gastos totais do projeto e acompanhamento de pedidos](https://youtu.be/ofFB88_Qugc)
- [Sprint 2 - Painel centralizado de programas e projetos](https://youtu.be/ey82uwWGWds)
- [Sprint 3 - Fornecedores, importação de CSV e acesso por usuário](https://youtu.be/ai7bGPwm_IE)

## Aprendizados Efetivos 📖

O projeto uniu a prática de banco de dados orientada a análise com as rotinas de engenharia de software. Aprendi a estruturar um Data Warehouse com tabelas fato e dimensões, a acompanhar processos de ETL a partir de arquivos CSV e a consumir esse modelo por meio de uma API REST em Django.

Minha principal evolução técnica veio da integração contínua: aprendi a construir esteiras automatizadas de lint, testes unitários e testes de integração com banco em contêiner, além de configurar análise estática contínua e relatórios de cobertura. Na função de Scrum Master, aprimorei a condução das cerimônias, a priorização do backlog com o cliente e a comunicação com o time.

### Hard Skills

| Tecnologia/Metodologia | Nota | Classificação |
| --- | --- | --- |
| Metodologia Ágil Scrum | ★★★★★ | Sei fazer com autonomia |
| Python | ★★★★☆ | Sei fazer com ajuda |
| Django | ★★★★☆ | Sei fazer com ajuda |
| MySQL | ★★★★★ | Sei fazer com autonomia |
| Docker | ★★★★★ | Sei fazer com autonomia |
| GitHub Actions | ★★★★☆ | Sei fazer com ajuda |
| SonarCloud | ★★★★☆ | Sei fazer com ajuda |
| React | ★★★☆☆ | Entendi |
| TypeScript | ★★★★☆ | Sei fazer com ajuda |
| Jira | ★★★★☆ | Sei fazer com ajuda |
| Git | ★★★★★ | Sei fazer com autonomia |

### Soft Skills

| Habilidade | Descrição |
| --- | --- |
| Liderança e comunicação | Conduzi as cerimônias do Scrum e mantive o time alinhado sobre prioridades e impedimentos. |
| Organização e gestão | Mantive o backlog, os critérios de DoR/DoD e a rastreabilidade das entregas no Jira. |
| Qualidade e atenção aos detalhes | Padronizei lint e formatação e implantei o monitoramento contínuo de débito técnico. |
| Trabalho em equipe | Aproximei desenvolvimento e infraestrutura para apoiar o time nas esteiras de integração. |
| Proatividade | Estudei GitHub Actions, SonarCloud e testes automatizados para implementar as esteiras do projeto. |
