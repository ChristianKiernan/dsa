# Group Anagrams

## What I Learned
### Methods
- The `map.computeIfAbsent()` and `map.putIfAbsent` methods save manual steps (e.g. checking if the key exists)
- `Arrays.toString` can be used to print an array (fewer steps than initializing a StringBuilder object)
---

## Optimal Complexity
**Time:** O(m * n) <br>
**Space:** O(m) extra space, O(m *n) space for the output list

---

## An Optimal Algorithm
1. Create a hash map where each key is a `26`-length length representing character frequencies, and each value is a list of strings belonging to that anagram group.
2. For each string in the input:
+ Initialize a frequency array of size `26` with all zeros.
+ For each character in the string, increment the count at the corresponding index.
+ Convert the frequency array to a tuple and use it as the key.
+ Append the string to the list associated with this key.
3. After processing all strings, return all the lists stored in the hash map.

---