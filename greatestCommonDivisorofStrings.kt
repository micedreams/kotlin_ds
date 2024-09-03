class Solution {
  fun gcd(a: Int, b: Int): Int {
        var num1 = a
        var num2 = b
        while (num2 != 0) {
            val temp = num2
            num2 = num1 % temp
            num1 = temp
        }
        return num1
  }

  fun gcdOfStrings(str1: String, str2: String): String {
    val gcdLength = gcd(str1.length, str2.length)
    val candidate = str1.substring(0, gcdLength)

    return if (candidate.repeat(str1.length / gcdLength) == str1 &&
               candidate.repeat(str2.length / gcdLength) == str2) candidate else ""
  }
}

/* 
1071. Greatest Common Divisor of Strings
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 

Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.

*/