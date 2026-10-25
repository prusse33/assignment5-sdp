
# Assignment 5 — Strategy Pattern

Software Design Patterns

Ismail Bolat

## Project Description

This project demonstrates the Strategy design pattern in Java.

The application represents a navigator that supports three route strategies:
- FastestRoute
- ShortestRoute
- ScenicRoute

The strategy can be changed at runtime without modifying the Navigator class.

## Clean Code Principles

1. **Single Responsibility Principle** — each strategy class has one responsibility: providing one route algorithm.

2. **Meaningful Names** — class and method names clearly describe their purpose.

3. **Polymorphism** — all strategies implement the same RouteStrategy interface.

4. **Open/Closed Principle** — a new strategy can be added by implementing RouteStrategy without changing existing strategy classes or Navigator.

5. **Encapsulation** — route algorithm implementations are separated into their own classes.

## How to Run

Open Main.java in IntelliJ IDEA and run the main method.

The program demonstrates all three route strategies.
