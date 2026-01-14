# Best Time to Buy and Sell Stock

## Heuristics
1. Regarding my first solution: the explicit check 
```java
if (prices.length <= 1) return 0
```
is unneccesary. This validation is done implicitly, since the `while` loop is never entered, due to the 
value of `r` after initalization.
2. ```java
   maxProfit = Math.max(maxProfit, profit);
   ```
   is a more efficient way to update `maxProfit` than the approach in my first solution. 
---

## Optimal Complexity

**Time:** O(n) <br>
**Space:** O(1)