# Valid Anagram

## What I Learned
### General
+ Incrementing and decrementing frequency in the same loop (for string s and t respectively) is a more efficent
approach than storing the frequencies in two separate structures and comparing them afterwards. 
+ A pattern to map letters to their frequencies: <br>
```java
int[] freq = new int[26];
for (int i = 0; i < s.length(); i++) {
    freq[str.charAt(i) - 'a']++;
}
``` 
---

## Optimal Complexity
- **Time:** O(n + m)  
- **Space:** O(1)

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
