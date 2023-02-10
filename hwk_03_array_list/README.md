# Instructions

Using the **ArrayList** implementation discussed in class, finish the 3 TO-DOs. 

## TODO #1

Method **contains** should return true if the given value is in the array list (false otherwise). Since the elements of the array are object, make sure that you compare them using the **equals** method (don't use the equality operator). Referece variables should be compared by structure using **equals**.  

## TODO #2

Method **reverse** should do what its name suggests: reverse the order of the elements in the array list. For example, if the array list contains "1 4 10 5 8" then after a call to reverse the array should have the same elements but in the order "8 5 10 4 1". You solution should NOT create a new static array (instead it should swap elements from outside to inside). For example: 1<->8 and 4<->5.  

## TODO #3

Method **clear** should recreate the array list (with its initial capacity), essentially wiping out all of its elements. 

# Submission

Just submit the **ArrayList.java**.  

There is no need to submit **ArrayListTest.java**. 

# Rubric 

Pass all the tests and you are guarantee a 5 on this assignment. Each test that you fail you loose 1 point.