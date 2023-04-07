# Introduction 

**Radix sort** is an algorithm that works by sorting non-negative integers based on their digit relative to a given position based on the decimal system (unit, tenth, hundredth, etc.). To illustrate, consider the following set of numbers: 

```
[170, 45, 75, 90, 2, 802, 2, 66]
```

Sorting the numbers relative to the unit digits yields: 

```
[{170, 90}, {2, 802, 2}, {45, 75}, {66}]
```

If we repeat the procedure, but now relative to the tenth digits we get: 

```
[{2, 802, 2}, {45}, {66}, {170, 75}, {90}]
```

Repeating the process one more time relative to the hundredth digits results in all numbers sorted. 

```
[{2, 2, 45, 66, 75, 90}, {170}, {802}]
```

Sorting relative to a position of the decimal system can be done using an algorithm called **counting sort**, which is explained in detail next. 

# Counting Sort 

Remember, **counting sort** works in relation to a positon on the decimal system. From now on, we will call that position **index** and we will use the following convention: 0 (unit), 1 (tenth), 2 (hundredth), etc. The **counting sort** algorithm can be broken into the following steps, which are based on the unit digit (**index=0**). 

## Step 1: Count the Digits 

**Counting sort** starts by creating an array of counters for each of the digits (0-9). This array will count the number of times a digit (relative to the **index** position) appeared in the to-be-sorted array. 

```
count = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
digit =  0  1  2  3  4  5  6  7  8  9
```

As an exercise, update **count** for the following array using **index=0**. 

```
[170, 45, 75, 90, 2, 802, 2, 66]
```

You should get: 

```
count = [2, 0, 3, 0, 0, 2, 1, 0, 0, 0]
digit =  0  1  2  3  4  5  6  7  8  9
```

## Step 2: Accumulate the Counts

The counts that we computed in the previous step is going to be used to determine how many spots need to be left for each digit when sorting the number in the array. But before we do that, we need to accumulate the counts so we would know how many spots to skip when placing the numbers in their correct location. After accumulating the counts, the (count) array should look like the following: 

```
count = [2, 0, 5, 0, 0, 7, 8, 0, 0, 0]
digit =  0  1  2  3  4  5  6  7  8  9
```

## Step 3: Sorting 

Sorting can be done by reading the elements of the data array from right-to-left and using **count** to find its location. This procedure will need an auxiliary array since it cannot be done in-place. Let's call this auxiliary array **aux**. 

### Pass 1

```
[170, 45, 75, 90, 2, 802, 2, *66*]
count[6] is 8 => so 66 should be placed at position 7 (we subtract 1 because our arrays start at zero)
aux = [ , , , , , , ,66]
```

We then update the count since we placed one number in **aux**. 

```
count = [2, 0, 5, 0, 0, 7, 7, 0, 0, 0]
digit =  0  1  2  3  4  5  6  7  8  9
```

### Pass 2

```
[170, 45, 75, 90, 2, 802, *2*, 66]
count[2] is 5 => so 2 should be placed at position 4 (we subtract 1 because our arrays start at zero)
aux = [ , , , ,2, , ,66]
```

We then update the count since we placed one more number in **aux**. 

```
count = [2, 0, 4, 0, 0, 7, 7, 0, 0, 0]
digit =  0  1  2  3  4  5  6  7  8  9
```

### Pass 3

```
[170, 45, 75, 90, 2, *802*, 2, 66]
count[2] is 4 => so 802 should be placed at position 3 (we subtract 1 because our arrays start at zero)
aux = [ , , ,802,2, , ,66]
```

We then update the count since we placed one more number in **aux**. 

```
count = [2, 0, 3, 0, 0, 7, 7, 0, 0, 0]
digit =  0  1  2  3  4  5  6  7  8  9
```

### Pass 4

```
[170, 45, 75, 90, *2*, 802, 2, 66]
count[2] is 3 => so 2 should be placed at position 2 (we subtract 1 because our arrays start at zero)
aux = [ , ,2,802,2, , ,66]
```

We then update the count since we placed one more number in **aux**. 

```
count = [2, 0, 2, 0, 0, 7, 7, 0, 0, 0]
digit =  0  1  2  3  4  5  6  7  8  9
```

### Pass 5

```
[170, 45, 75, *90*, 2, 802, 2, 66]
count[0] is 2 => so 90 should be placed at position 1 (we subtract 1 because our arrays start at zero)
aux = [ ,90,2,802,2, , ,66]
```

We then update the count since we placed one more number in **aux**. 

```
count = [1, 0, 2, 0, 0, 7, 7, 0, 0, 0]
digit =  0  1  2  3  4  5  6  7  8  9
```

### Pass 6

```
[170, 45, *75*, 90, 2, 802, 2, 66]
count[5] is 7 => so 75 should be placed at position 6 (we subtract 1 because our arrays start at zero)
aux = [ ,90,2,802,2, ,75,66]
```

We then update the count since we placed one more number in **aux**. 

```
count = [1, 0, 2, 0, 0, 6, 7, 0, 0, 0]
digit =  0  1  2  3  4  5  6  7  8  9
```

### Pass 7

```
[170, *45*, 75, 90, 2, 802, 2, 66]
count[5] is 6 => so 45 should be placed at position 5 (we subtract 1 because our arrays start at zero)
aux = [ ,90,2,802,2,45,75,66]
```

We then update the count since we placed one more number in **aux**. 

```
count = [1, 0, 2, 0, 0, 5, 7, 0, 0, 0]
digit =  0  1  2  3  4  5  6  7  8  9
```

### Pass 8

```
[*170*, 45, 75, 90, 2, 802, 2, 66]
count[0] is 1 => so 170 should be placed at position 0 (we subtract 1 because our arrays start at zero)
aux = [170,90,2,802,2,45,75,66]
```

Now that we explained how counting sort works, it is your turn to implement the algorithm, making sure you pass all tests before proceeding to the next section. 

# Radix Sort 

As described above, you can run counting sort on each of the index positions from the least to most significant digits to sort an entire array.  Finish the implementation and make sure all tests are cleared. 

# Submission

Upload **RadixSort.java** on Canvas. 

# Rubric

+2 Task class

+2 CircularLinkedList class

+1 TaskScheduler class