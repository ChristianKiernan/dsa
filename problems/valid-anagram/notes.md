# Valid Anagram

## Heuristics
1. The most intuitive approach is to use two maps, mapping letters to their frequencies, and then comparing their
equality.
2. Incrementing and decrementing frequency in the same loop (for string s and t respectively) is an alternative
approach. 
---

## Optimal Complexity
**Time:** O(n + m)  
**Space:** O(1)

---

## An Optimal Algorithm
1. If the lengths of the strings differ, return `False` immediately.
2. Create a frequency array count of size `26` initialized to zero.
3. Iterate through both strings: 
   - Increment the count at the index corresponding to `s[i]`.
   - Decrement the count at the index corresponding to `t[i]`.
4. After processing both strings, scan through the count array:
   - If any value is not zero, return `False` because the frequencies differ.
5. If all values are zero, return `True` since the strings are anagrams.
