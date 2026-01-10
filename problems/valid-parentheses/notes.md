# Valid Parentheses

### Heuristics
1. One approach is to use a map to pair each closing parentheses with its corresponding opening parentheses; 
returning an empty stack signifies that the parentheses are valid.
2. An alternative approach is to simply push opening parantheses onto the stack,
and then ensure that each closing parentheses is paired with the corresponding opening parentheses (popped off the stack).
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
