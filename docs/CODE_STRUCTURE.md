# 📁 Code Structure

  Understanding the layout of the OOP Kingdom is essential for any aspiring builder.

  ## Repository Layout

  ```
  oop-kingdom/
  ├── kingdom/                  # The Java codebase
  │   └── src/
  │       ├── main/java/kingdom/
  │       │   ├── core/         # Base interfaces & enums (e.g. KingdomEntity)
  │       │   ├── contracts/    # Quest interface contracts
  │       │   ├── entities/     # All kingdom classes live here
  │       │   ├── Kingdom.java
  │       │   └── Main.java
  │       └── test/             # Integration and unit tests
  ├── quests/                   # Weekly quest drops
  │   ├── template.md           # Quest guidelines and checklists
  │   └── week-01/quest.md
  ├── chronicles/               # The kingdom's story
  │   ├── chapter-00.md
  │   └── chapter-01.md
  ├── state/                    # Kingdom's persistent state (auto-generated)
  │   └── kingdom.json
  ├── docs/                     # Kingdom rules and documentation
  │   ├── CODE_STANDARDS.md     # Code guidelines, naming rules & tests
  │   ├── CODE_STRUCTURE.md     # This document (layout overview)
  │   ├── REVIEW_RUBRIC.md      # Scoring rubric for PRs
  │   ├── RANKS.md              # Contributor ranks and requirements
  │   └── BUILD.md              # Maven compile/test command instructions
  ├── contributors.json         # Registry of who built what
  └── README.md
  ```

  ## Core Components
  - **`core/`**: Contains the foundational building blocks of the kingdom that all entities rely on.
  - **`contracts/`**: Specific interfaces and abstract classes that are defined in weekly quests.
  - **`entities/`**: Where your submitted buildings and characters will be placed once merged.
  
