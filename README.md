# kickstart
contains results and cheat sheet for the google quick start exam 

## convert int to String in Java 

```
  String str = String.valueOf(numb);
```

## convert char to int in Java : 
```
  int a=Character.getNumericValue(c);  
```

## Subsequence definition: 
A subsequence is a sequence that is derived from another sequence by deleting some of its element while keeping their order
==> Two-pointer approach to have the minimum time/space complexity 


## Challenge Nine 
In this exercise the logical solution was easy and had a time/space complexity of O(L). But a converting was made (from int to string) which made the complexity grow to O(L^2)
