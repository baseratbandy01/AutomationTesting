# Simple Calculator App

A simple command-line calculator application written in Java that performs basic arithmetic operations.

## Features

- **Addition** (+): Add two numbers
- **Subtraction** (-): Subtract two numbers
- **Multiplication** (*): Multiply two numbers
- **Division** (/): Divide two numbers with zero-division error handling

## Error Handling

- Division by zero protection
- Invalid operation detection
- Invalid input validation

## How to Run

### Compilation

```bash
cd eclipse-workspace/JavaLearning/src
javac SimpleCalculator.java
```

### Execution

```bash
java SimpleCalculator
```

## Usage Example

```
====================================
   Welcome to Simple Calculator
====================================

Enter first number: 10
Enter operation (+, -, *, /): +
Enter second number: 5

Result: 10.0 + 5.0 = 15.0

Do you want to perform another calculation? (yes/no): yes

Enter first number: 20
Enter operation (+, -, *, /): -
Enter second number: 8

Result: 20.0 - 8.0 = 12.0

Do you want to perform another calculation? (yes/no): no

Thank you for using Simple Calculator!
```

## Supported Operations

| Operation | Symbol | Example |
|-----------|--------|---------|
| Addition | + | 10 + 5 = 15 |
| Subtraction | - | 20 - 8 = 12 |
| Multiplication | * | 6 * 7 = 42 |
| Division | / | 15 / 3 = 5 |

## Error Messages

- **Invalid Operation**: "Invalid operation! Please use +, -, *, or /"
- **Division by Zero**: "Cannot divide by zero!"
- **Invalid Input**: "Please enter valid numbers!"
