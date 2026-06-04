# ⚔️ Week 01 Quest: The Foundation

The kingdom requires its foundational structures to support the growing population.

## Available Entities to Build
- **Lumberyard**: A facility to harvest wood from the surrounding forests (already implemented as a baseline example in `kingdom/entities/Lumberyard.java`).
- **Barracks**: A military building to train troops.
- **Blacksmith**: A workshop to forge tools and weapons.
- **Market**: A center for commerce and trade.

---

## Instructions

1. **Pick an Entity**: Pick one of the entities above (e.g., Barracks, Blacksmith, or Market).
2. **Review the Contracts**: Look at their corresponding abstract classes in `kingdom/src/main/java/kingdom/contracts/`.
3. **Build the Class**: Implement the class under `kingdom/src/main/java/kingdom/entities/` following [CODE_STANDARDS.md](../../docs/CODE_STANDARDS.md) naming conventions. 
   - *Note*: You can implement extra methods beyond the contract's methods to enrich your entity.
4. **Write Tests**: Create unit tests in `kingdom/src/test/java/kingdom/entities/` verifying all contract methods and any extra methods you added.
5. **Run Locally**: Ensure all tests compile and pass. Refer to [BUILD.md](../../docs/BUILD.md) for build and test commands (e.g., `mvn clean test`).
6. **Log Credit**: Update `contributors.json` in the root:
   - For new classes: `"ClassName": "YourGitHubUsername"`
   - If extending someone else's class: `"ClassName": "OriginalAuthor, YourGitHubUsername"`
7. **Submit PR**: Open a Pull Request following the guidelines in [template.md](../template.md) and use the PR template.
