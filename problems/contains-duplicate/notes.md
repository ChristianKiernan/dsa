# Contains Duplicate

## What I Learned
### General
No explicit `int` → `Integer` conversion is required when adding to a collection, since Java performs autoboxing automatically.

### Methods
The `Set.add()` method returns a boolean, which can be used to detect duplicates in a single pass with early exit.

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

