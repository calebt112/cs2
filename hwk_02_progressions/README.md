# Instructions

Consider the abstract class **Progression** that sets an initial value and defines a way to compute its next value. Based on that class, define 3 specializations: **ArithmeticProgression**, **GeometricProgression**, and **FibonacciProgression**. 

# Arithmetic Progression

An arithmetic progression computes the next value by adding **difference** to the current value. For example, to create the arithmetic progression 0, 2, 4, 6, ... the initial value is 0 and the difference is 2. **ArithmeticProgression** defines 2 constructors: one that takes both the initial value and the difference, and another one that only takes the difference (in that case, the initial value should be automatically set to 0). 

# Geometric Progression

A geometric progression computes the next value by multiplying **ratio** to the current value. For example, to create the geometric progression 1, 2, 4, 8, ... the initial value is 1 and the ratio is 2. **GeometricProgression** defines 2 constructors: one that takes both the initial value and the ratio, and another one that only takes the ratio (in that case, the initial value should be automatically set to 1). 

# Fibonacci Progression

A fibonacci progression computes the next value by adding both previous numbers. For example, to create the fibonacci progression 1, 2, 4, 8, ... the previous value is initially set to 0 and the value to 1. This should be done automatically by the fibonacci's default constructor (parameterless constructor). 

# Submission

Just submit a single file this time: **Progression.java** which should contain: 

* the preamble comment with your name using the provided format
* classes **Progression**, **ArithmeticProgression**, **GeometricProgression**, and **FibonacciProgression**. 

There is no need to submit **ProgressionTest.java**. 

# Rubric 

Pass all the tests and you are guarantee a 5 on this assignment. Each test that you fail you loose 1 point.