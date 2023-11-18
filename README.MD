# ABOUT

This repository is dedicated to Leetcode problems solving. The goal is to
complete [Leetcode 75](https://leetcode.com/studyplan/leetcode-75/).

Every problem is described in README. Use problem's number to find its solution in its own package (e.g P001).

My solution is named as ``Kkotto + problem number``. Solution suggested by Leetcode community is named
as ``Leetcode + problem number``.

> Note: Leetcode requires non-static solutions. Since my solutions are run in ``public static void main(String[] args)``
> method they're static.

> Note: Don't forget to add ``import``s to Leetcode before running code.

## Leetcode 75

- [151. Reverse Words in a String](#151-reverse-words-in-a-string)
- [238. Product of Array Except Self](#238-product-of-array-except-self)

### 151. Reverse Words in a String

Given an input string s, reverse the order of the words.

A **word** is defined as a sequence of non-space characters. The **words** in ``s`` will be separated by at least one
space.

Return _a string of the words in reverse order concatenated by a single space._

> Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should
> only
> have a single space separating the words. Do not include any extra spaces.

**Example 1:**

```text
Input: s = "the sky is blue"
Output: "blue is sky the"
```

**Example 2:**

```text 
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
```

**Example 3:**

```text
Input: s = "a good example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string. 
```

**Constraints:**

```text
1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
```

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?

### 238. Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of
nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

```text
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
```

```text
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
```

```text
Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
```

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for
space complexity analysis.)