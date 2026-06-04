# 🛠️ Code Standards

To maintain order in the OOP Kingdom, all builders must adhere to strict Java and Object-Oriented Programming (OOP) standards. Pull Requests that violate these standards will be rejected.

---

## 1. Object-Oriented Principles

### Encapsulation
- **Keep Fields Private**: All class fields must be `private` or `protected`. Direct access to fields from outside the class is strictly forbidden.
- **Use Getters and Setters**: Expose state only through well-defined methods. If a field doesn't need a setter, do not write one.

### Single Responsibility Principle (SRP)
- Every class should have one, and only one, reason to change.
- A `Blacksmith` should forge tools; it shouldn't be responsible for collecting taxes or selling bread. If you find your class doing too much, break it down.

### Inheritance & Polymorphism
- Favor composition over inheritance where it makes sense, but use inheritance properly when extending abstract contracts.
- Override methods correctly and always use the `@Override` annotation.

### Extra Methods
- You are encouraged and allowed to add extra properties, getters/setters, or business logic methods beyond the abstract contract to make your class richer and more functional.

---

## 2. Naming Conventions

Follow these strict naming rules:
- **Classes**: `PascalCase` matching the contract name (e.g., `Market.java`, `Blacksmith.java`).
- **Test Classes**: `PascalCase` with `Test` suffix (e.g., `MarketTest.java`, `BlacksmithTest.java`).
- **Methods**: `camelCase` (e.g., `harvestWood()`, `getWoodStockpile()`).
- **Variables / Fields**: `camelCase` (e.g., `woodStockpile`, `foundingDate`).
- **Constants**: `UPPER_SNAKE_CASE` (e.g., `MAX_CAPACITY`).

---

## 3. Testing Standards

- **Compiling & Running**: Refer to [BUILD.md](BUILD.md) for compiling and test running commands (e.g., `mvn clean test`).
- **Required Test Scope**: Every submitted entity class must have a corresponding test class containing:
  - **Constructor Tests**: Verify that the default constructor sets safe, non-null default values.
  - **Business Logic Tests**: Verify that methods perform their operations and modify state correctly.
  - **Serialization Tests**: Test that the class can be serialized and deserialized using Jackson `ObjectMapper` without losing state.
- **Testing Extra Methods**: Any extra custom methods implemented beyond the contract **must** have thorough unit tests verifying their correctness. Un-tested custom code will lead to PR rejection.

---

## 4. Documentation

- Use JavaDoc for all public classes and methods.
- Explain *why* a method exists or *why* you made a specific design choice, not just *what* the code does.

---

## 5. The Golden Rule

**If it breaks the kingdom, it doesn't get merged.** 
Your code must pass CI. If your PR breaks another contributor's previously merged building, you must resolve the conflict or your PR will be closed.
