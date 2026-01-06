## Approach
1. Initialize an empty ArrayList to store integers.  
2. Iterate through the input int array.  
3. For each int:  
   a) Convert it to an Integer.  
   b) Add it to the ArrayList.  
4. Initialize a HashSet with the values of the ArrayList.  
5. Compare the sizes of the ArrayList and HashSet:  
   - If they are different, a duplicate exists → return true.  
   - Otherwise, return false.

## Complexity
- Time: O(n)  
- Space: O(n)

## Edge cases
- N/A

## Common pitfalls
- N/A

## Notes
- Canonical version: the Set `.add()` method returns a boolean, which can be used to detect duplicates in a single pass with early exit.
- Also, no explicit `int` → `Integer` conversion is needed when adding to a collection, since Java handles autoboxing automatically.
