# ⚔️ OOP Kingdom

> _A collaborative open-source kingdom built entirely through object-oriented code._

---

## 📖 The Story

For centuries, the **POP Kingdom** stood unchallenged. Its laws were absolute — every citizen followed a single path, a long unbroken sequence of instructions handed down from the Royal Procedure. You did not think. You did not own. You simply executed, in order, as commanded.

But there were those who questioned.

_"Why must the blacksmith know the baker's recipe to do his work?"_

They were called troublemakers. And so they were banished.

Thirty seven souls crossed the eastern border with nothing but their skills, their names, and one shared belief — that every entity deserves its own purpose, its own data, its own way of interacting with the world.

They called it the **OOP Kingdom**.

**And they needed builders.**

---

## 🏰 What is OOP Kingdom?

OOP Kingdom is a collaborative open-source project where contributors collectively build a virtual kingdom — entirely through Java code.

**This project is fully Java-based!** Whether you are a beginner looking to learn Java and Object-Oriented Programming (OOP) principles, or an experienced developer wanting to contribute to a fun, growing ecosystem, anyone who wants to learn Java or already knows Java can contribute!

Every week, a new chapter of the kingdom's story is released describing what the kingdom needs next — a marketplace, a blacksmith, a postal system. Contributors design and implement these as real object-oriented code and raise a PR. The best implementation gets merged and becomes the kingdom's official canon.

**This is the closest thing to contributing to a real company codebase — without needing to be hired first.**

---

## ⚙️ How It Works

```
📜 Weekly Quest Drop  →  🛠️ You Code  →  📬 Raise a PR  →  👑 Best PR Merged  →  🏙️ Kingdom Grows
```

1. Every week, a `quest.md` is released with new buildings the kingdom needs
2. You write your code and raise a PR for the entity you want to build
3. The community reviews all PRs using the [Review Rubric](docs/REVIEW_RUBRIC.md)
4. The best implementation gets merged and you are permanently credited as a **Kingdom Official**

---

## 🗺️ Kingdom Structure

```
Kingdom
└── CityHall
      ├── Farm
      ├── Hospital        (coming soon)
      ├── Blacksmith      (coming soon)
      └── ...             (you build this)
```

Every entity implements `KingdomEntity` — the core contract every building in the kingdom must follow.

---

## 📜 The Rules

- **Language**: Java only. No exceptions.
- **PR Scope**: Each PR must focus on **exactly one class** and **its test class**, along with updating `contributors.json`. Do not bundle multiple classes in a single PR.
- **No Issue Claiming**: There is no issue claiming or pre-booking. Multiple builders can submit implementations for the same quest entity; the best design wins the merge.
- **PR limit**: Maximum 2 PRs per contributor per week.
- **UML required**: Every PR must include a UML diagram of your class.
- **Core files are off-limits**: `KingdomEntity.java`, `Kingdom.java`, `CityHall.java` are maintainer-only.
- **The kingdom must always compile**: Your PR must pass CI. If it breaks existing code, it gets rejected. See [Building and Testing](docs/BUILD.md) for commands.

---

## 🏆 What Do Contributors Get?

- A **permanent credit** on the kingdom website as a Kingdom Official
- A **real open-source contribution** on their GitHub profile
- **System design + OOP practice** on a living, growing codebase — not an isolated exercise
- Code that gets **peer reviewed** on actual design decisions, not just correctness
- The ability to point at a node on the kingdom graph and say _"I built that"_

---

## 🚀 How to Contribute

### 1. Read the current quest

Check [`quests/week-01/quest.md`](quests/week-01/quest.md) for this week's available classes.

### 2. Implement your class

- Must implement `KingdomEntity` interface (extending its abstract contract).
- Must follow [Code Standards](docs/CODE_STANDARDS.md) and strict naming conventions (e.g. `Market.java` and `MarketTest.java`).
- **Extra Methods**: You can implement extra properties, getters/setters, or business logic methods beyond the quest contract.
- Must include a UML diagram in your PR.

### 3. Write and Run Tests

- You **must** write unit tests for your implementation, verifying all features and Jackson serialization.
- **Test Extra Methods**: You must also write unit tests for any extra methods you added.
- Refer to [BUILD.md](docs/BUILD.md) for compiling and test running commands.

### 4. Raise a PR

Use the [PR Template](.github/PULL_REQUEST_TEMPLATE.md). Include:

- Your UML diagram.
- A brief explanation of your design decisions.
- Passing CI checks.
- **An update to `contributors.json`**: Add your name for the classes you have worked on. If you are extending or modifying a class originally done by others, **do not overwrite their name** — append your name separated by a comma (e.g., `"Lumberyard": "OriginalAuthor, YourGitHubUsername"`).

### 5. Community Review

Other contributors review your PR against the [Review Rubric](docs/REVIEW_RUBRIC.md). Best design wins the merge.

---

## 📁 Repository Structure

```
oop-kingdom/
├── kingdom/                  # The Java codebase
│   └── src/
│       ├── main/java/kingdom/
│       │   ├── core/         # Base interfaces & enums
│       │   ├── contracts/    # Quest interface contracts
│       │   ├── entities/     # All kingdom classes live here
│       │   ├── Kingdom.java
│       │   └── Main.java
│       └── test/             # Integration tests
├── quests/                   # Weekly quest drops
│   └── week-01/quest.md
├── chronicles/               # The kingdom's story
│   └── chapter-00.md
├── state/                    # Kingdom's persistent state
│   ├── kingdom.json
│   └── entities.json
├── docs/                     # Documentation and guides
│   ├── CONTRIBUTING.md
│   ├── CODE_STANDARDS.md
│   ├── CODE_STRUCTURE.md
│   ├── REVIEW_RUBRIC.md
│   ├── RANKS.md
│   └── BUILD.md
├── contributors.json
└── README.md
```

---

## ⚖️ PR Review Rubric

| Criteria                                            | Points    |
| --------------------------------------------------- | --------- |
| Passes CI                                           | Mandatory |
| Follows quest requirements                          | 10        |
| OOP quality (SRP, encapsulation, inheritance)       | 20        |
| Extensibility (future contributors can build on it) | 10        |
| UML accuracy                                        | 10        |
| Naming & readability                                | 10        |

**Total: 60 points.** Highest score wins the merge.

---

## 👑 Contributor Ranks

| Rank | Title         | Requirement     |
| ---- | ------------- | --------------- |
| 🌱   | Settler       | First merged PR |
| ⚒️   | Craftsman     | 3 merged PRs    |
| 🏛️   | Architect     | 7 merged PRs    |
| 👑   | Royal Council | 15 merged PRs   |

---

## 📚 Read More

- [Chronicles of OOP Kingdom](chronicles/chapter-00.md) — The full story
- [Contributing Guide](.github/CONTRIBUTING.md) — Detailed contribution rules
- [Building & Testing Guide](docs/BUILD.md) — How to run the code locally
- [Code Standards](docs/CODE_STANDARDS.md) — Java OOP rules we enforce
- [Code Structure](docs/CODE_STRUCTURE.md) — Repository structure and layout
- [Review Rubric](docs/REVIEW_RUBRIC.md) — How PRs are judged
- [Contributor Ranks](docs/RANKS.md) — Contributor ranks and rewards

---

## 🌐 Website

The kingdom's live state, story, and contributor hall of fame lives at:
**[oop-kingdom.github.io](https://oop-kingdom.github.io)** _(coming soon)_

---

_Every entity deserves its own purpose. Every contributor deserves their credit. Build well._

⚔️ **The kingdom awaits.**
