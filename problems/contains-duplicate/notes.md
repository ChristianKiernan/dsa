# Contains Duplicate

## Heuristics
1. A set is the obvious choice of data structure.

---

## Optimal Complexity
**Time:** O(n) <br>
**Space:** O(n)

---

## An Optimal Algorithm
1. Convert the array into a hash set, which removes duplicates.
2. Compare the size of the set with the size of the original array.
3. If the set is smaller, return `True` because duplicates must have been removed.
4. Otherwise, return `False`.

---

