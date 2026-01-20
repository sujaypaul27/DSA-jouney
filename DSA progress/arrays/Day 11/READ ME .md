GOAL
The goal of Day 11 is to build a strong foundation in Bit Manipulation by understanding how binary representation works and how bitwise operators behave at a low level. The focus is on intuition and reasoning rather than memorizing tricks, so that basic bit problems can be solved independently in coding tests and interviews.

DAY-WISE CONCEPTS (DAY 11)

1. Binary representation of integers
2. Understanding set bits (1) and unset bits (0)
3. AND (&) operation

   * How AND compares bits
   * Why AND never creates new 1s
4. OR (|) operation

   * How OR sets bits
5. XOR (^) operation

   * XOR cancellation property
   * Why x ^ x = 0
   * Why x ^ 0 = x
   * Why order does not matter in XOR
6. Right shift operators

   * Signed right shift (>>)
   * Unsigned right shift (>>>)
   * Why >>> is safer for bit problems
7. Effect of (n - 1) on binary numbers
8. Concept of removing the rightmost set bit using n & (n - 1)

IMPORTANT POINTS

1. AND (&) keeps a bit as 1 only if both bits are 1.
2. OR (|) keeps a bit as 1 if at least one bit is 1.
3. XOR (^) keeps a bit as 1 only if the bits are different.
4. XOR is commutative and associative, so element order does not matter.
5. n & 1 is used to check whether the last bit is 1 (odd number).
6. n >>> 1 shifts bits safely to the right and avoids sign-bit issues.
7. n & (n - 1) removes the rightmost set bit from a number.
8. A power of two has exactly one set bit in its binary representation.
9. Bit-processing loops always reduce the number and terminate safely.

COMMON CLARIFICATIONS & DOUBTS

1. Will using a loop on a single number cause it to increase?
   No. Bit shifting (>>> 1) removes bits and continuously reduces the number until it becomes 0.

2. Why do duplicate numbers disappear when using XOR?
   Duplicate numbers have identical binary representations. XORing the same value twice cancels all its bits to 0.

3. Why doesn’t AND make bits 1 if n - 1 has trailing 1s?
   AND never creates new 1s. If a bit is 0 in either operand, the result is 0.

4. Does array order matter in XOR-based problems?
   No. XOR is commutative and associative, so order does not affect the final result.

5. Why use >>> instead of >> in bit problems?

   > > > fills left bits with 0 and avoids infinite loops caused by sign extension.

PATTERN SELECTION GUIDE

1. Use AND (&) when:

   * Checking specific bits
   * Power of two validation
   * Removing set bits

2. Use XOR (^) when:

   * Elements appear in pairs except one
   * Constant space and linear time are required

3. Use n & (n - 1) when:

   * Counting set bits
   * Checking if only one set bit exists
   * Removing bits one by one

4. Use n & 1 with shifting when:

   * Reading bits individually
   * Traversing binary representation

LEARNING PHILOSOPHY
The emphasis is on understanding how bits behave during operations rather than memorizing formulas. Confusion is treated as part of learning, and clarity is built by repeatedly reasoning through small binary examples. Each operator is understood as a behavior (keep, remove, toggle) instead of a shortcut.

CURRENT STATUS
Day 11 completed successfully.

Pattern covered:
Bit Manipulation (Foundations)

Problems practiced:
191. Number of 1 Bits
231. Power of Two
136. Single Number

Understanding of AND, XOR, bit shifting, and pair-cancel
