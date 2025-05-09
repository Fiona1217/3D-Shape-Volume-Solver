# 3D Shape Volume Solver 🏗️
A Java program that calculates the total volume of a three-tiered cylinder structure, where each upper tier has 20% smaller radius than the one below it.

## Code Highlights 💻
- Uses OOP principles with encapsulation
- Implements proper getters/setters
- Contains calculation logic in separate method
- Uses `Math.PI` for precision
- Includes input validation

## Features ✨
- Calculates composite volume of three stacked cylinders
- Each upper tier automatically reduces radius by 20%
- Clean object-oriented design
- User-friendly console interface
- Precise decimal output (3 decimal places)

## How It Works ⚙️
The program calculates:
1. Bottom cylinder volume (full radius)
2. Middle cylinder volume (80% of bottom radius)
3. Top cylinder volume (80% of middle radius)
4. Sums all three volumes for total

## Example Usage 📝
```
Enter the radius of the bottom cylinder: 5
getRadius() is: 5.0
Enter the height of the bottom cylinder: 10
getHeight() is: 10.0
total: 1727.876 cm3
```

## How to Run 🚀
1. Clone this repository
2. Compile: `javac Driver.java CylinderPyramid.java`
3. Run: `java Driver`

## Why This Project? 🌟
Created as a school project to demonstrate:
- Java programming fundamentals
- Object-oriented design
- Mathematical calculations
- Clean code practices
