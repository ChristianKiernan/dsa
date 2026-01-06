# Two Sum — Pseudocode Notes

## Approach (Pseudocode)

1. Initialize an empty integer array `result` of size 2.
2. Iterate through the `nums` array using index `i` from `0` to `length(nums) - 2`.
   2a. For each `i`, iterate again using index `j` from `i + 1` to `length(nums) - 1`.
   2b. Compute the sum `nums[i] + nums[j]`.
   2c. If the sum equals the `target`:
       - Set `result[0] = i`.
       - Set `result[1] = j`.
3. Return the `result` array.

---

## Complexity

- **Time:** O(n^2)
- **Space:** O(1)

---

## Edge Cases

- Array contains exactly two elements
- Target is formed by the first and last elements
- Multiple valid pairs exist (returns the first found)
- Array contains negative numbers

---

## Heuristic

> When the problem asks for two numbers that sum to a target, start with a brute-force double loop, then optimize using a hash map.
