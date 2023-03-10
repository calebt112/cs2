# Instructions

A priority queue is like a traditional queue but with an additional feature: the elements carry a priority and higher priority elements should be put in front of lower priority ones.  The example below illustrates how a priority queue works using Disney duck characters.

| Action | State of Priority Queue |
| ------ | ----------------------- |
| None | (front) (rear) |
| Daisy arrives with “default” priority | (front) {Daisy,0} (rear) | 
| Donald follows Daisy also with “default” priority | (front) {Daisy,0} {Donald,0} (rear) |
| Scrooge shows up with priority = 3 | (front) {Scrooge,3} {Daisy,0} {Donald,0} (rear) |
| Huey shows up with priority = 2 | (front) {Scrooge,3} {Huey,2} {Daisy,0} {Donald,0} (rear) |
| Scrooge is served | (front) {Huey,2} {Daisy,0} {Donald,0} (rear) 
| Dewey arrives with priority = 2 | (front) {Huey,2} {Dewey,2} {Daisy,0} {Donald,0} (rear) |
| Louie arrives with priority = 2 | (front) {Huey,2} {Dewey,2} {Louie,2} {Daisy,0} {Donald,0} (rear) | 
| Three ducks are served! | (front) {Daisy,0} {Donald,0} (rear) |
| Professor Von Drake arrives with priority = 1 | (front) {Von Drake,1} {Daisy,0} {Donald,0} (rear) |
| Two ducks are served | (front) {Donald,0} (rear) |
| Donald is NEVER served, of course! | (front) {Donald,0} (rear) |  

Your goal on this homework is to finish the implementation of the push method in the PriorityQueue class implementing the TO-DO’s and passing all the tests.  

# Submission 

You only need to submit the PriorityQueue.java source code this time.   

