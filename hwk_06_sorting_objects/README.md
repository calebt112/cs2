# Instructions 

Although the sorting algorithms discussed in class all used collection of numbers, any type of objects can also be sorted.  For that to be possible, there should be a way to determine how 2 given objects should be compared.  Java has an interface called **Comparable** that defines the following method: 

```
public int compareTo(Object other);
```

**compareTo** should be overriden by the user-defined class in the following way: 

```
a.compareTo(b) returns < 0 if a < b
a.compareto(b) returns 0 if a = b
a.compareTo(b) return > 0 if a > b
```

In this assignment you are asked to override **compareTo** in **InstagramUser**.  Then adapt quick sort so it would work with an array of objects. Follow the TO-DOs in the given source code and submit **InstagramUser** class when you are done. 

