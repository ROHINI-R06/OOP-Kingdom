# 🏰 Contributing to OOP Kingdom

Welcome, Builder! Thank you for your interest in contributing to the OOP Kingdom project. This document outlines our guidelines to ensure all contributions are consistent and of high quality.

---

## 🚀 Quick Start Checklist

1. **Read the Lore**: Learn about the kingdom's history in [Chapter 00](../chronicles/chapter-00.md) and [Chapter 01](../chronicles/chapter-01.md).
2. **Find a Quest**: Check [quests/week-01/quest.md](../quests/week-01/quest.md) (or the latest week) for available entities.
3. **Write the Code**: Implement your entity class, write tests, compile, and run tests locally.
4. **Update contributors.json**: Add your username or append it using the comma-separated rule.
5. **Create UML**: Draw a Mermaid UML diagram.
6. **Submit PR**: Open a PR using our [Pull Request Template](PULL_REQUEST_TEMPLATE.md).

---

## 🎯 Contribution Guidelines

### 1. Scope of a Pull Request
- **One Class per PR**: Each PR must focus on the implementation of **exactly one entity class** and **its corresponding test class**, plus the update to `contributors.json`. Do not combine multiple classes or unrelated changes in a single PR.
- **No Claiming Issues**: We do not use "issue claiming" or pre-booking. Multiple builders can submit implementations for the same quest entity. The best-designed, highest-scoring implementation based on the [Review Rubric](../docs/REVIEW_RUBRIC.md) gets merged!

### 2. Implementation Rules
- **Contracts**: Your class must implement the `KingdomEntity` interface and extend the appropriate quest contract (e.g., `public class Lumberyard extends AbstractLumberyard`).
- **Extra Methods**: You are allowed and encouraged to implement extra properties, getters/setters, or business logic methods beyond the abstract contract to make your class richer and more functional.
- **Serialization**: Make sure all fields are annotated with Jackson `@JsonProperty` annotations for state saving.
- **Default Constructor**: Must initialize safe defaults (such as UUID-based identities and current dates).
- **Registration**: Include a static block to register your class with the `KingdomRegistry`:
  ```java
  static {
      KingdomRegistry.register(YourClass.class);
  }
  ```

### 3. Naming Conventions
Follow these strict naming rules:
- **Classes**: `PascalCase` matching the contract name (e.g., `Market.java`, `Blacksmith.java`).
- **Test Classes**: `PascalCase` with `Test` suffix (e.g., `MarketTest.java`, `BlacksmithTest.java`).
- **Methods**: `camelCase` (e.g., `harvestWood()`, `getWoodStockpile()`).
- **Variables / Fields**: `camelCase` (e.g., `woodStockpile`, `foundingDate`).
- **Constants**: `UPPER_SNAKE_CASE` (e.g., `MAX_CAPACITY`).

### 4. Writing and Running Tests
- **Comprehensive Coverage**: Write unit tests verifying your class's default constructor, core contract methods, and Jackson serialization/deserialization.
- **Testing Extra Methods**: If you implemented any extra methods, you **must** write unit tests for them to ensure full coverage and correctness.
- **Execution**: Run all tests locally prior to submission. Refer to [BUILD.md](../docs/BUILD.md) for detailed commands.
  ```bash
  cd kingdom
  mvn clean test
  ```

### 5. Updating contributors.json
You must update `contributors.json` in the root of the repository to receive official credit:
- **New Classes**: Add your class and username: `"YourClassName": "YourGitHubUsername"`.
- **Extending/Modifying Existing Classes**: Only list your name for classes you have actively worked on. If you are extending or modifying a class originally created by another contributor, **do not overwrite their name**. Append your username separated by a comma:
  ```json
  "Lumberyard": "OriginalAuthor, YourGitHubUsername"
  ```

---

## 🛠️ Compiling and Testing Commands

All build and test commands must be run from the `kingdom` subdirectory.
- **Compile**: `mvn clean compile`
- **Run Tests**: `mvn clean test`
- **Boot Sanity Check**: `mvn exec:java -Dexec.mainClass="kingdom.Main"`

For troubleshooting or detailed instructions, see the dedicated [BUILD.md](../docs/BUILD.md) guide.

---

## ❌ Do NOT

- ❌ Modify core files (`KingdomEntity.java`, `Kingdom.java`, `CityHall.java`, etc.).
- ❌ Submit PRs containing multiple class implementations.
- ❌ Skip writing unit tests or leave extra methods untested.
- ❌ Overwrite other contributors' names in `contributors.json` when extending their work.
- ❌ Copy code directly from other contributors (plagiarism results in rejection).

---

## 🏆 Review & Ranks

All submissions are scored out of 60 points based on the [Review Rubric](../docs/REVIEW_RUBRIC.md). As you get PRs merged, you will progress through ranks detailed in [RANKS.md](../docs/RANKS.md) (Settler → Craftsman → Architect → Royal Council).

If you have any questions, feel free to open a discussion or post questions in the relevant quest issue. Happy building!
