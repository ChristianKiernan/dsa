# Two Sum 

## Heuristics
1) Single pass (one for-loop) for insertion and lookup
2) HashMap uses the value of the element in the array as the key and the index as the value.

---

## Optimal Complexity

**Time:** O(n) <br>
**Space:** O(n)

---

## Optimal Algorithm
1. Create a hash map to store the value and index of each element in the array.
2. Iterate through the array and compute the complement of the current element, which is `target - nums[i]`.
3. Check if the complement exists in the hash map.
4. If it does, return the indices of the current element and its complement.
5. If no such pair is found, return an empty array.