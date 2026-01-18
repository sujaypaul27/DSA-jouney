DAY 10: PREFIX SUM (1D) AND SUBARRAY PROBLEMS

1) Concepts Learned:

Prefix sum array creation (1D)
Why prefix[0] is initialized as 0
Range sum queries using prefix sum
Checking if a subarray with a given sum exists
Using HashSet with prefix sum to handle negative numbers

2) Pattern:

Prefix Sum
Prefix Sum + Hashing

3) Important Points:

Prefix sum stores cumulative sums to avoid repeated calculations
prefix[i] represents the sum of elements before index i
Using prefix sum avoids nested loops and reduces time complexity
HashSet helps quickly check if a required prefix sum already exists
Two pointers cannot be used when negative numbers are present

4) COMMON CLARIFICATIONS AND DOUBTS

Doubt: Why is prefix[0] equal to 0?
Explanation: prefix[0] represents the sum before index 0. Since no elements exist before index 0, the sum is 0. This simplifies range calculations and avoids edge cases.

Doubt: Why do we check currentSum - target in the set?
Explanation: If a previous prefix sum equals currentSum - target, then the elements between those two points form a subarray with sum equal to target.

Doubt: Can two pointers solve this problem?
Explanation: Two pointers work only when all numbers are non-negative. With negative numbers, sum behavior becomes unpredictable, so prefix sum + hashing is required.

Doubt: Why do we add currentSum to the set after checking?
Explanation: This ensures we only use prefix sums from earlier indices and do not incorrectly reuse the current index.

5) PATTERN SELECTION QUICK GUIDE

Subarray sum with negative numbers → Prefix Sum + HashSet
Range sum queries → Prefix Sum
Fixed-size window problems → Sliding Window
Pair problems in sorted arrays → Two Pointers

6) LEARNING PHILOSOPHY

Understanding why a pattern works is more important than writing code fast
Confusion during learning means progress is happening
Dry runs help build confidence before coding
Consistency and clarity matter more than solving hard problems early

7) CURRENT STATUS

Comfortable with prefix sum fundamentals
Able to identify when prefix sum is needed over two pointers
Successfully implemented subarray sum detection using hashing
Ready to move toward more advanced prefix sum and array patterns