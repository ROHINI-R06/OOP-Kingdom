# 🛠️ Building and Testing the Kingdom

The OOP Kingdom codebase uses Maven as its build tool. Below are the commands to compile the code, run tests, and boot the application locally.

> [!NOTE]
> All commands listed below must be executed from the `kingdom` subdirectory (the directory containing `pom.xml`), not the root directory of the repository.

## Commands

### 1. Compile the Code
To clean previous build outputs and compile the codebase:
```bash
cd kingdom
mvn clean compile
```

### 2. Run the Unit and Integration Tests
To run all unit and integration tests:
```bash
cd kingdom
mvn clean test
```

### 3. Run the Application (Boot Test)
To execute the main entry point as a sanity check to verify that the application boots successfully:
```bash
cd kingdom
mvn exec:java -Dexec.mainClass="kingdom.Main"
```

## Troubleshooting
- **Java Version**: The project requires **Java 17**. Ensure your local `JAVA_HOME` points to a JDK 17 installation.
- **Maven**: Ensure you have Maven installed and available on your system path.
