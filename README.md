# kickstart
contains results and cheat sheet for the google quick start exam 

## Greedy method 


## Subsequence definition: 
A subsequence is a sequence that is derived from another sequence by deleting some of its element while keeping their order
==> Two-pointer approach to have the minimum time/space complexity 


## Challenge Nine 
In this exercise the logical solution was easy and had a time/space complexity of O(L). But a converting was made (from int to string) which made the complexity grow to O(L^2)
**also a digit is a multiple of nine if and only if the sum of its digits are a multiple of nine**

## Convert a character to a an integer in golang: 

```
result, err :=strconv.Atoi(string(char))
```
## To get the number of digits in a number :
the number off digits of a number N is ⌈log10(N+1)⌉
