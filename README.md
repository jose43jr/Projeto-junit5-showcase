# JUnit 5 Showcase (projeto didático)

Projeto simples para aprender e **apresentar** no GitHub os principais recursos do **JUnit 5**:

- Assertions (`assertEquals`, `assertNull`, `assertNotNull`, `assertThrows`)
- Ciclo de vida (`@BeforeAll`, `@AfterAll`, `@BeforeEach`, `@AfterEach`)
- Exceções e testes condicionais/assumptions
- Nomes especiais e ordenação de testes (`@DisplayName`, `@Order`, `@TestMethodOrder`)
- `@Disabled` para desabilitar um teste
- Testes parametrizados (`@ParameterizedTest`, `@ValueSource`, `@CsvSource`)
- Relatório de cobertura com **JaCoCo**

## Como rodar

Pré-requisitos: **JDK 17+** e **Maven 3.9+** instalados.

```bash
mvn test
mvn verify
# Windows:
start target/site/jacoco/index.html
# Linux:
xdg-open target/site/jacoco/index.html
# macOS:
open target/site/jacoco/index.html
```

## Estrutura
```
src/
  main/java/br/com/example/...
  test/java/br/com/example/...
```

## Dicas para IDE
- **VS Code**: instale "Extension Pack for Java".
- **IntelliJ IDEA / Eclipse**: clique no ▶️ ao lado dos testes.
