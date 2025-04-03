# 🧠 Codewars Daily Challenge

> Desafios resolvidos diariamente usando Java ou outras linguagens mais adequadas para cada problema.

Este repositório reúne soluções para desafios do [Codewars](https://www.codewars.com/), uma plataforma para aprimorar habilidades de programação através de problemas com diferentes níveis de dificuldade.  
A proposta é **resolver 1+ desafio por dia**, aplicando boas práticas de código, testes automatizados e versionamento.

---

## 📅 Progresso

Cada diretório representa um desafio resolvido, organizado de acordo com a convenção de pacotes Java (`src/main/java`) e seus respectivos testes (`src/test/java`).

---

## 🛠 Tecnologias Utilizadas

- Java 17+
- JUnit 4 e 5
- Maven
- JaCoCo (cobertura de testes)
- GitHub Actions (CI/CD)
- Visual Studio Code

---

## 📊 Cobertura de Testes

O projeto utiliza o [JaCoCo](https://www.jacoco.org/jacoco/) para gerar relatórios de cobertura de testes.  
Após rodar:

```bash
mvn clean verify
```

O relatório estará disponível localmente em:

```
target/site/jacoco/index.html
```

No GitHub Actions, o relatório é gerado automaticamente a cada push na branch `main` e pode ser baixado como artefato.

---

## 📂 Estrutura do Projeto

```
.
├── .github/
│   └── workflows/
│       └── maven.yml           # Workflow CI com testes e cobertura
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── CountingDuplicates/
│   │       ├── ...
│   └── test/
│       └── java/
│           ├── CountingDuplicates/
│           ├── ...
├── pom.xml                     # Configuração Maven (JUnit, JaCoCo, etc.)
├── abrir-relatorio-jacoco.bat  # Script para abrir o relatório no navegador (Windows)
└── README.md
```

---

## ▶️ Como Executar Localmente

1. Execute os testes e gere a cobertura:

```bash
mvn clean verify
```

2. No Windows, use o script para abrir o relatório direto no navegador:

```bash
abrir-relatorio-jacoco.bat
```

---

## 🤝 Contribuições

Este projeto é pessoal, mas sugestões de melhorias ou abordagens alternativas são bem-vindas!  
Sinta-se à vontade para abrir uma *issue* ou *pull request*.

---

## 👨‍💻 Sobre o Autor

**Lucas Ramon**  
🎓 Estudante de Engenharia de Software na PUCRS  
💡 Apaixonado por desafios de programação e boas práticas

- 🌐 [LinkedIn](https://www.linkedin.com/in/lucasramon/)
- 💻 [GitHub](https://github.com/Schnorren)
- ✍️ [Medium](https://medium.com/@lucas.ramon)
```
