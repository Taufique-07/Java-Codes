# Bisection Method in Java

This is a simple Java program that implements the **Bisection Method** to find a root of a continuous function within a given interval `[a, b]`.

The program uses the [**exp4j**](https://www.objecthunter.net/exp4j/) library to parse and evaluate mathematical expressions entered by the user.

---

## 📌 Features

- Accepts any valid function of `x` (e.g. `x^3 - 2*x - 5`, `sin(x)`, `e^x - 3`)
- Checks if `f(a)` and `f(b)` have opposite signs
- Iteratively applies the Bisection Method to find an approximate root
- Displays the root and total number of iterations

---

## 🚀 How to Run

### 1. **Set Up Project**
- Make sure you have Java installed.
- Download the [exp4j JAR file](https://www.objecthunter.net/exp4j/).
- Include it in your classpath.

### 2. **Compile**
```bash
javac -cp .:exp4j-0.4.8.jar BisectionMethod.java

