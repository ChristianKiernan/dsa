# Koko Eating Bananas

## Heuristics
1. Understand that k is bounded by the biggest `pile` in `piles[]`. The binary search application helps us
improve the efficient from <br> `O(n * max(piles))` to `O(n * log(max(piles)))`.
---

## Optimal Complexity

**Time:** O(n * log(m)) <br>
**Space:** O(1)