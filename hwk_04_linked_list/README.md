# Instructions

In this assignment you are asked to implement a linked list reverse method with a caveat: the reverse must be done "in-place". In other words, your solution must NOT be based on copying the elements to another collection to later recreate the list. The "in-place" reversal of a linked list is possible.  The algorithm is explained using an example. 

## Step 1: Initial Setup

The suggested solution uses three **Node** references: **previous**, **current**, and **next**. Check the cases when nothing needs to be done: the list is empty of it has only one element (you can check if the list has only one element without calling **size**). Initialize **previous** and **current** the way it is explained in the picture below. 

![pic1.png](pics/pic1.png)

## Step 2: Loop to Change References

Figure out when your changing references loop should end. At each iteration, you should save current's next using another **Node** reference variable, let's say **next**. 

![pic2.png](pics/pic2.png)

Then, your next step should make **current**'s next point to **previous**. 

![pic3.png](pics/pic3.png)

Then, assign **current** to **previous** and **next** to current, setting the stage for next loop iteration.

![pic4.png](pics/pic4.png)

Let's run one more iteration. First set **current**'s next to reference variable **next**. 

![pic5.png](pics/pic5.png)

Then, your next step should make **current**'s next point to **previous**. 

![pic6.png](pics/pic6.png)

Then, assign **current** to **previous** and **next** to current, setting the stage for next loop iteration.

![pic7.png](pics/pic7.png)

Let's now run what should be the last iteration. First set **current**'s next to reference variable **next**. 

![pic8.png](pics/pic8.png)

Then, your next step should make **current**'s next point to **previous**. 

![pic9.png](pics/pic9.png)

Then, assign **current** to **previous** and **next** to current, setting the stage for next loop iteration, which won't happen because **current** is null. 

![pic10.png](pics/pic10.png)

## Step 3: Update the "head" Node

After your loop is done, you still need to update the **head** node using **previous**. The final configuration is illustrated below. Well, not quite final yet... Note the never ending loop between **spots** and **sparky**. 

![pic11.png](pics/pic11.png)

Removing that reference is left for you to figure out. 

# Submission

Zip **LinkedList.java** and **LinkedListDriver.java** into **hwk_04.zip** and upload the file to Canvas. 

```
hwk_04.zip
|__LinkedList.java
|__LinkedListDriver.java
```

# Grading

```
+3 for the algorithm that reverses the linked list (TODO #1)
+2 for the use of reverse in LinkedListDriver (TODO #2)
-1 if you were not able to remove the reference loop described above
```