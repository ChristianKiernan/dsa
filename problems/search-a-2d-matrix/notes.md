# Binary Search

## Heuristics
1. For optimal runtime, consider flattening the matrix. Use `int row = midpoint/n` and <br>
`int col = midpoint % n` to map the midpoint to the correct row and column.
2. Two separate binary searches(for correct row first, and then to check if the target is in that row) is 
a less optimal approach `(Olog(n) * Olog(m))`.

---

## Optimal Complexity

**Time:** O(log(m*n)) <br>
**Space:** O(1)