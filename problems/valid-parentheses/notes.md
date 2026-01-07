# Valid Parentheses

## Concepts
### Data Structures
Stack and (optionally) map

### Approach
Use the map to map each closing parentheses to its corresponding opening parentheses. 
Returning an empty stack signifies that the parentheses are valid.
Pop stack on valid closing parentheses, push stack on all other characters (the constraints ensure each character is
a parentheses type, so minimal validation is required. This was also part of the motivation for implementing a map.

---

## Optimal Complexity
**Time:** O(n) <br>
**Space:** O(n)

---

## An Optimal Algorithm
1. Create a stack to store opening brackets.
2. For each character in the string:
+ If it is an opening bracket, push it onto the stack.
+ If it is a closing bracket:
  + Check if the stack is not empty and its top matches the corresponding opening bracket.
  + If yes, pop the stack.
  + Otherwise, return `False`.
3. After processing all characters:
  + If the stack is empty, return `True`.
  + Otherwise, return `False`.
