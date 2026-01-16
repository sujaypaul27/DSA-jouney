📅 Day 8 – Binary Search Pattern
📌 Concept Overview

1) On Day 8, I focused on understanding the Binary Search pattern, which is used to efficiently search elements in a sorted array by repeatedly eliminating half of the search space.

2) The goal was not speed, but to clearly understand how and why pointers move, and how binary search differs from other patterns like Two Pointers.

🧩 Problems Covered
1) Code 1
Binary Search in a Sorted Array
Find the index of a target element
Return -1 if the element is not present

2) Code 2
Find First and Last Occurrence of an Element in a Sorted Array
Use modified binary search
Find the leftmost and rightmost position of a target value

🧠 Key Learnings

1) Binary Search works only on sorted data
2) Each iteration safely discards half of the search space
3) mid is recalculated every loop — we move left or right, never mid
4) Initializing result as -1 helps clearly represent “not found”
5) First and last occurrence problems require continuing the search even after finding the target


🔍 Clarifications (Important Doubts I Had)



1️⃣ Why do we use left = mid + 1 or right = mid - 1?

1) Because the array is sorted, once arr[mid] is compared with the target, half of the array becomes impossible to contain the answer and can be safely ignored.


2️⃣ Why don’t we check the skipped values again?
Binary Search does not “miss” values — it logically proves they cannot be the answer due to sorted order.


3️⃣ Why use
mid = left + (right - left) / 2
instead of
(left + right) / 2?
To avoid integer overflow in large input cases. This is a safe and professional practice.


4️⃣ Why initialize the answer as -1?
-1 clearly represents “target not found” and is never a valid array index. This avoids ambiguity in the result.


5️⃣ Why not stop (break) when the target is found in Code 2?
* Because the problem asks for first and last occurrence, not just existence.
  After finding the target:
* Move left to find the first occurrence
* Move right to find the last occurrence


6️⃣ Why can’t we update mid directly?
mid is a calculated value.
Binary Search works by shrinking the search boundaries (left and right), not by manually moving mid.



7️⃣ Why must helper methods be outside main()?
Java does not allow methods inside methods.
All helper functions must be defined at the class level.


🧠 Pattern Recognition Hint

If a problem mentions:

1) “sorted array”
2) “first / last occurrence”
3) “search efficiently”
4) “minimum / maximum position”

👉 Think Binary Search