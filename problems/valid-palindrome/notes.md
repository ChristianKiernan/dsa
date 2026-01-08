# Valid Palindrome

## Concepts

### Approach
One method is the two-pointers pattern (left and right pointers) to compare
characters. Another approach is to clean the string and then compare it with 
the reversed string. 

---

## Optimal Complexity
**Time:** O(n) <br>
**Space:** O(1)

---

## An Optimal Algorithm
1. Initialize two pointers:
+ `l` at the start of the string,
+ `r` at the end of the string.
2. While `l` is less than `r`:
+ Move `l` forward until it points to an alphanumeric character.
+ Move `r` backward until it points to an alphanumeric character.
+ Compare the lowercase characters at `l` and `r`:
  + If they don’t match, return `False`.
+ Move both pointers inward: `l += 1`, `r -= 1`.
3. If the loop finishes without mismatches, return `True`.
