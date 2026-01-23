1) DAY 14: SORTING + TWO POINTERS

2) Concepts Learned:

Finding a pair with sum closest to a target
Counting number of pairs with sum less than a target
Using sorting to simplify pointer movement
Understanding how to count multiple valid pairs at once

3) Pattern Used:

Sorting + Two Pointers

4) Important Points:

Sorting helps convert an unsorted problem into a predictable structure
Two pointers should always move based on sum comparison
Use left < right for pair problems (never <=)
bsolute difference is used only to measure closeness, not pointer movement
Pointer movement depends on real sum, not absolute value
Do not move both pointers in the same iteration unless swapping

5) COMMON CLARIFICATIONS AND DOUBTS

Doubt: Why do we use abs(sum - target) if it always gives a positive value?
Explanation: Absolute value only measures how close the sum is to the target.
Pointer movement still depends on whether sum < target or sum > target.

Doubt: Do we need to store all absolute differences to find the closest sum?
Explanation: No. We keep only one variable (minDiff) and update it greedily whenever a better pair is found.

Doubt: Why do we use count += (right - left) instead of count++?
Explanation: Because when arr[left] + arr[right] < target, all pairs between left and right are also valid due to sorting.

Doubt: Earlier the expected answer was said as 6, but code gave 8. Which is correct?
Explanation: After a full dry run, 8 is the correct answer. The earlier explanation missed valid pairs. Dry run confirmed the code logic was correct.

Doubt: Why do leftover values remain in array after removing duplicates?
Explanation: Arrays in Java do not shrink. In-place algorithms overwrite values but only indices 0 to last valid pointer are meaningful.

PATTERN SELECTION QUICK GUIDE

Unsorted array + pair optimization → Sort + Two Pointers
Find closest sum pair → Sort + Two Pointers + Absolute Difference
Count pairs with condition → Sort + Two Pointers + Math counting
Exact match in sorted array → Binary Search

6) LEARNING PHILOSOPHY

Understanding logic matters more than memorizing code
Confusion means learning is happening
Dry runs are more reliable than assumptions
Catching mistakes is progress, not failure

7) CURRENT STATUS

Comfortable with Sorting + Two Pointer problems
Able to distinguish between “find one pair” and “count all pairs”
Understands when to use bulk counting logic
Building confidence in intermediate-level array patterns