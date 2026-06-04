# 📜 Quest Submission Guidelines & Template

When submitting your Pull Request for a quest, ensure you adhere to these guidelines. A focused PR makes community review smoother and increases your chances of getting merged.

---

## 🎯 Scope of a Pull Request

Each PR must contain:
1. **Exactly one entity class** implementation (e.g., `Lumberyard.java`).
2. **Exactly one test class** verifying its correctness (e.g., `LumberyardTest.java`).
3. **An update to `contributors.json`** to log your name for the entity.

> [!WARNING]
> Combining multiple class implementations or modifying unrelated configuration/core files will result in automatic PR rejection.

---

## 📋 Pre-Submission Checklist

- [ ] **Interface & Contracts**: Your class implements the `KingdomEntity` interface and extends the appropriate quest contract from the `kingdom/contracts/` package.
- [ ] **Naming Conventions**: Follow the project naming conventions:
  - Class file: `PascalCase` matching contract (e.g., `Market.java`).
  - Test file: `PascalCase` + `Test` suffix (e.g., `MarketTest.java`).
  - Methods and fields: `camelCase` (e.g., `getWoodStockpile()`, `woodStockpile`).
- [ ] **Extra Methods**: If you added extra properties or methods, verify they are fully documented and have corresponding tests.
- [ ] **Tests Written**: Unit tests verify:
  - Constructor defaults (including safe UUID generation).
  - Business logic/contract methods.
  - Serialization/deserialization with Jackson.
  - Any extra custom methods you added.
- [ ] **Tests Pass**: Run tests locally inside the `kingdom` folder using `mvn clean test` (see [BUILD.md](../docs/BUILD.md) for details).
- [ ] **Application Boots**: Verify the system boots successfully with:
  ```bash
  mvn exec:java -Dexec.mainClass="kingdom.Main"
  ```
- [ ] **UML Diagram**: Include a Mermaid UML diagram in the PR description showing the class hierarchy and fields/methods.
- [ ] **contributors.json**: Update the registry following the authorship rules (see below).

---

## 👥 Rules for contributors.json

- **New Classes**: Add a new key-value pair to the JSON mapping:
  ```json
  "YourClassName": "YourGitHubUsername"
  ```
- **Extending/Modifying Existing Classes**: Do not overwrite the original author's name. Append your name using a comma:
  ```json
  "ExistingClassName": "OriginalAuthor, YourGitHubUsername"
  ```
