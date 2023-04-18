# Instructions
Have you ever played the card game called “patience” (also known as “solitaire”)?  In this homework you will use the same idea of that famous card game to help you sort a list of numbers in ascending order.  The pile of cards will be replaced by the input array with the numbers to be sorted.  Below is an example that shows how the “patience sort” algorithm works.  Basically it uses stacks of numbers in descending order.  In case there isn’t a stack available, the algorithm creates a new stack.   

|Stack|Input Array|
|-----|-----|
||[13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3]|
|13|[12, 84, 79, 10, 77, 56, 1, 34, 27, 3] |
|13<BR>12|[84, 79, 10, 77, 56, 1, 34, 27, 3] |
|13 84<BR>12|[79, 10, 77, 56, 1, 34, 27, 3] |
|13 84<BR>12 79|[10, 77, 56, 1, 34, 27, 3] |
|13 84<BR>12 79<BR>10|[77, 56, 1, 34, 27, 3] |
|13 84<BR>12 79<BR>10 77|[56, 1, 34, 27, 3] |
|13 84<BR>12 79<BR>10 77<BR>&nbsp;&nbsp;&nbsp;&nbsp; 56|[1, 34, 27, 3] |
|13 84<BR>12 79<BR>10 77<BR>&nbsp;&nbsp;1  56|[34, 27, 3] |
|13 84<BR>12 79<BR>10 77<BR>&nbsp;&nbsp;1  56<BR>&nbsp;&nbsp;&nbsp;&nbsp; 34|[27, 3] |
|13 84<BR>12 79<BR>10 77<BR>&nbsp;&nbsp;1  56<BR>&nbsp;&nbsp;&nbsp;&nbsp; 34<BR>&nbsp;&nbsp;&nbsp;&nbsp; 27|[3] |
|13 84<BR>12 79<BR>10 77<BR>&nbsp;&nbsp;1  56<BR>&nbsp;&nbsp;&nbsp;&nbsp; 34<BR>&nbsp;&nbsp;&nbsp;&nbsp; 27<BR>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3|[]|

Once the algorithm finishes reading the input array, it just needs to merge the stacks in order to generate the final output.  That part of the code is given to you. 

Get the code template from our GitHub repository and finish the TO-DO's.  

# Submission 

You only need to submit the **PatienceSort.java** source code this time.  
