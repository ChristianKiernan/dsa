# Daily Temperatures

## Heuristics
1. Use the stack to store the indices of the temperatures.
2. Intuition sticking point: think about what the stack should store, and why
Since the difference between the indices (the number of days) is what determines the output,
storing the indices in the stack makes more sense, especially since you can access all the 
temperatures directly with `temperatures[i]`.
4. Another sticking point: the conditions of the while loop. Think about what the conditions should be,
   (e.g. popping on higher/lower temperatures? Can the stack be empty?)
3. A DP approach might be more optimal, with regards to space complexity.

---

## Optimal Complexity
**Time:** O(n)  
**Space:** O(n)

---