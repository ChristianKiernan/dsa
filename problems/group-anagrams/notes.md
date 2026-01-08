# Group Anagrams

## Heuristics
1. Use a hash map to store the anagrams, and an `int[]`  of size `26` to represent the frequencies of each character.
2. The `map.computeIfAbsent()` method saves manual steps 
```java
String key = Arrays.toString(freqs);
map.computeIfAbsent(key, k -> new ArrayList<>()).add(str)
```

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