# Wallet OOP Project

A small Java project built to practice **Object-Oriented Programming (OOP)** concepts, unit testing, and Gradle project structure.

## About the Project

This project models a simple digital wallet that can:

- Store wallet information
- Add money to the wallet
- Deduct money from the wallet
- Record transactions
- Distinguish between credit and debit transactions
- Analyse transactions
- Calculate total credited and debited amounts
- Calculate expenditure over a specific time period

The project is mainly focused on learning how to design classes and their responsibilities rather than building a complete real-world payment application.

## Project Structure

```text
wallet-oop-java/
├── app/
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── project/
│       │           └── var/
│       │               ├── Wallet.java
│       │               ├── Transaction.java
│       │               └── WalletAnalyser.java
│       │
│       └── test/
│           └── java/
│               └── project/
│                   └── var/
│                       └── AppTest.java
│
├── gradle/
├── gradlew
├── gradlew.bat
├── build.gradle
├── settings.gradle
└── README.md
