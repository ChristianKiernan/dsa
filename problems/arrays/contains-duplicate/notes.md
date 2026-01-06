## Pseudocode

1. Initialize an empty `ArrayList` to store integers.

2. Iterate through the input integer array:
   2a. For each integer:
       - Convert it to an `Integer`.
       - Add it to the `ArrayList`.

3. Initialize a `HashSet` using the values from the `ArrayList`.

4. Compare the sizes of the `ArrayList` and the `HashSet`:
   4a. If the sizes are different, a duplicate exists → return **true**.  
   4b. Otherwise, return **false**.

---

## Complexity
- **Time:** O(n)  
- **Space:** O(n)

---

## Edge Cases
- Empty array
- Single element

---

## Notes
- Canonical solution: the `Set.add()` method returns a boolean, which can be used to detect duplicates in a single pass with early exit.
- No explicit `int` → `Integer` conversion is required when adding to a collection, since Java performs autoboxing automatically.
