# Introduction 

In this activity you are asked to design simple classes based on a given specification.  Start by creating a new project.  Then, create classes to model each of the functionalities described next. Write a driver classes to illustrate that  your designs work.  

# Account 

A bank account is defined by a number (integer), the name of the owner, and a balance. Users should have the ability to create an account by specifying its number and owner. Balance is always initialized to zero. The class should provide methods to allow deposit (amount informed as parameter), withdraw (amount informed as parameter; balance cannot become negative). You should also implement the “toString” method.  

# Sandwich 

A sandwich is defined by a name, number of calories (integer is fine), and price. Users should be able to create a sandwich given its name, number of calories, and price. If informed number of calories or price is negative, make sure those values are initialized to zero. Define “toString” and a method called “isHealthy” that returns true if the number of calories is less than 250, false otherwise.  

# Die

A die is defined by a number of sides (at least 2) and a value that keeps the die’s current value (always set to 1 upon initialization). Users should be able to create a die given its number of sides. If the informed value (as in number of sides) is < 2, set it to 2. Users should also be able to create a die without informing its number of sides (in that case, set the number of sides to 6). Remember, the current value of a die should always be set to 1 upon creation. Create a method called “getValue” that returns the die's current value. Also, define a method called “roll” to randomly pick another value for the die, based of course on the number of sides.  