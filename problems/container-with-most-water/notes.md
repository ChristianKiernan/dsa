# Container With Most Water

## Heuristics
1) Two converging pointers. Increment (or decrement) the pointer with the smaller value (key point).
2) Use `while (l < r)`. Initial instinct was to use a `for` loop to iterate through `heights.length`, but the `while` loop is cleaner, and a common pattern.

---

## Optimal Complexity

**Time:** O(n) <br>
**Space:** O(1)

---
