

                                    DAY 9: BINARY SEARCH (BOUNDARIES AND VARIANTS)




1) Concepts Learned:

Basic binary search revision
Understanding how left, right, and mid work together
Finding the smallest element greater than or equal to a target
Handling edge cases when the target is not present

2) Pattern:

Binary Search
Lower Bound / Ceiling Value (Binary Search Variant)

3) Important Points:

Binary search works only on sorted arrays
Mid is always calculated using division by 2
Mid is recalculated every iteration, even when left == right
The answer is not always the last mid value
Store the answer when a condition is satisfied and continue searching
Use right = mid - 1 when looking for a minimum valid value
Initialize result as -1 to represent “not found”

4) COMMON CLARIFICATIONS AND DOUBTS

Doubt: How did mid become 4 when left was 3 and right was 4?
Explanation: Mid did not become 4 at that step. Mid became 4 when left and right both became 4. Mid is recalculated at every iteration, including when left == right.

 Doubt: Why does integer mid not become 3.5?
Explanation: Java uses integer division. Decimal values are discarded, so mid is always an integer.

Doubt: Why do we store result instead of returning immediately?
Explanation: Because we are looking for the smallest valid value, not just any valid value. We continue searching left to improve the answer.

Doubt: Does using multiple if statements affect time complexity?
Explanation: No. If statements are O(1). Time complexity depends on loops, not condition checks.

6) PATTERN SELECTION QUICK GUIDE

Search element in sorted array → Binary Search
Find smallest value ≥ target → Binary Search (Lower Bound)
Find largest value ≤ target → Binary Search (Upper Bound)
Exact match required → Normal Binary Search

7) LEARNING PHILOSOPHY

Understanding pointer movement is more important than memorizing code
Confusion is part of learning advanced patterns
Binary search improves with repetition, not speed
Storing answers prevents logical mistakes

8) CURRENT STATUS

Comfortable with basic binary search logic
Understands why left and right move
Able to solve lower-bound type problems independently
Ready to revisit Binary Search on Answer in future days
Consistency maintained without forcing difficult concepts