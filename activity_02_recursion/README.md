# Overview

In this activity you will practice turning loops into recursive calls. For that to work, you will need to define functions and work on the base case of your recursion. For example, consider the following loop that performs a simple 1-n summation. 

```
int sum = 0;
int n = 10;
for (int i = 1; i <= n; i++)
    sum += i;
```

The above loop could be replaced by the recursive function **sum** described below. 

```
int sum(int n) {
    if (n == 1)
        return 1;
    else
        return n + sum(n-1);
}
```

# Example 2

The following loop produces the sequence 2 4 8 16 32 64 128 256 512 1024 

```
int an = 2;
int r = 2;
int n = 10;
for (int i = 1; i <= n; i++) {
    System.out.print(an + " ");
    an *= r;
}
```

Write a recursive function called **seq** that outputs the same sequence. 

# Example 3

The Fibonacci sequence is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... Each number is the sum of the two previous numbers in the sequence. The loop below computes the an number of the sequence. 

```
int n = 10;
int a = 1;
int b = 1;
for (int i = 3; i <= n; i++) {
    int an = a + b;
    a = b;
    b = an;
}
```

Write a recursive function called **fibo** that computes the fibonacci term n (an).