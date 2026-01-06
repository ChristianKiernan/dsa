## Pseudocode

1. If the lengths of `s` and `t` are not equal, return **false**.

2. Initialize two HashMaps:
   - `sMap` to store character frequencies for `s`
   - `tMap` to store character frequencies for `t`

3. For each index `i` from `0` to `length(s) - 1`: <br>
   3a. Insert `s[i]` into `sMap`  
       - If the key does not exist, initialize its value to `0`  
       - Increment the value by `1`  
   3b. Insert `t[i]` into `tMap`  
       - If the key does not exist, initialize its value to `0`  
       - Increment the value by `1`

4. For each key in `sMap`:
   4a. Compare `sMap[key]` with `tMap[key]`  
   4b. If the values are not equal, return **false**

5. If all keys match in frequency, return **true**

---

## Complexity
- **Time:** O(n + m)  
- **Space:** O(n)

---

## Edge Cases
- Strings of different lengths  
- Empty strings  
- Same characters but different frequencies  
- Same length but different character sets  

---

## Notes
- When two strings must match by character composition, compare their frequency maps.
