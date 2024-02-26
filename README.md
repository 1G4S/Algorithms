# Algorithms 
### Algorithm is sequence of some activities necessary to perform specified tasks. It's a course of action that should lead us to solution of problem.
Here are some implemented algorithms by myself in Java: 
1. Fibonacci sequence 
2. Sieve of Eratosthenes 
3. Checking if the word is palindrome 
4. Checking if the word is anagram 
5. Caesar cipher 

# Algorithm Descriptions

## Fibonacci Sequence 

The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. Mathematically, it can be expressed as:
`F(n) = F(n-1) + F(n-2)`
with initial conditions `F(0) = 0` and `F(1) = 1`. The problem can be solve [iteratively](https://github.com/1G4S/Algorithms/blob/3a090b95378aeeef547994ae763c26f8ea7a47db/src/main/java/com/app/algorithms/numberAlgorithms/NumberAlgorithms.java#L4) and [recursively](https://github.com/1G4S/Algorithms/blob/3a090b95378aeeef547994ae763c26f8ea7a47db/src/main/java/com/app/algorithms/numberAlgorithms/NumberAlgorithms.java#L19).

## Sieve of Eratosthenes 

The Sieve of Eratosthenes is an efficient algorithm for finding all prime numbers up to a specified integer. It works by iteratively marking the multiples of each prime number starting from 2, excluding the prime number itself. The unmarked numbers that remain are primes.

## [Checking if the Word is a Palindrome ](https://github.com/1G4S/Algorithms/blob/3a090b95378aeeef547994ae763c26f8ea7a47db/src/main/java/com/app/algorithms/stringAlgorithms/StringAlgorithms.java#L17)

A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization). The check involves comparing characters from the beginning and the end of the string, moving towards the center.

## [Checking if the Word is an Anagram ](https://github.com/1G4S/Algorithms/blob/9f2791656e76176dce66da56f4991221304fa4c8/src/main/java/com/app/algorithms/stringAlgorithms/StringAlgorithms.java#L6)

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. The algorithm checks if two strings are anagrams by comparing sorted characters of both strings or by counting the occurrences of each character in both strings and then comparing these counts.

## Caesar Cipher 

The Caesar cipher is a type of substitution cipher in which each letter in the plaintext is shifted a certain number of places down or up the alphabet. For example, with a shift of 1, 'A' would be replaced by 'B', 'B' would become 'C', etc. 