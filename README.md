# Algorithms 
### Algorithm is sequence of some activities necessary to perform specified tasks. It's a course of action that should lead us to solution of problem.
Here are some implemented algorithms by myself in Java: 
1. [Fibonacci sequence](https://github.com/1G4S/Algorithms/blob/a0be009d0b42277e95247375bb20c5758f308033/src/main/java/com/app/algorithms/number_algorithms/README.md) 
2. [Sieve of Eratosthenes](https://github.com/1G4S/Algorithms/blob/a0be009d0b42277e95247375bb20c5758f308033/src/main/java/com/app/algorithms/number_algorithms/README.md) 
3. [Checking if the word is palindrome](https://github.com/1G4S/Algorithms/blob/a0be009d0b42277e95247375bb20c5758f308033/src/main/java/com/app/algorithms/string_algorithms/README.md) 
4. [Checking if the word is anagram](https://github.com/1G4S/Algorithms/blob/a0be009d0b42277e95247375bb20c5758f308033/src/main/java/com/app/algorithms/string_algorithms/README.md) 
5. [Caesar cipher](src/main/java/com/app/cipher) 

[//]: # (# Algorithm Descriptions)

[//]: # ()
[//]: # (## Fibonacci Sequence )

[//]: # ()
[//]: # (The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. Mathematically, it can be expressed as:)

[//]: # (`F&#40;n&#41; = F&#40;n-1&#41; + F&#40;n-2&#41;`)

[//]: # (with initial conditions `F&#40;0&#41; = 0` and `F&#40;1&#41; = 1`. The problem can be solve [iteratively]&#40;https://github.com/1G4S/Algorithms/blob/3a090b95378aeeef547994ae763c26f8ea7a47db/src/main/java/com/app/algorithms/numberAlgorithms/NumberAlgorithms.java#L4&#41; and [recursively]&#40;https://github.com/1G4S/Algorithms/blob/3a090b95378aeeef547994ae763c26f8ea7a47db/src/main/java/com/app/algorithms/numberAlgorithms/NumberAlgorithms.java#L19&#41;.)

[//]: # ()
[//]: # (## [Sieve of Eratosthenes]&#40;https://github.com/1G4S/Algorithms/blob/b22e4631d5a886d2ad1abd91ee10be8682e25c76/src/main/java/com/app/algorithms/numberAlgorithms/NumberAlgorithms.java#L31&#41; )

[//]: # ()
[//]: # (The Sieve of Eratosthenes is an efficient algorithm for finding all prime numbers up to a specified integer. It works by iteratively marking the multiples of each prime number starting from 2, excluding the prime number itself. The unmarked numbers that remain are primes.)

[//]: # ()
[//]: # (## [Checking if the Word is a Palindrome ]&#40;https://github.com/1G4S/Algorithms/blob/3a090b95378aeeef547994ae763c26f8ea7a47db/src/main/java/com/app/algorithms/stringAlgorithms/StringAlgorithms.java#L17&#41;)

[//]: # ()
[//]: # (A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward &#40;ignoring spaces, punctuation, and capitalization&#41;. The check involves comparing characters from the beginning and the end of the string, moving towards the center.)

[//]: # ()
[//]: # (## [Checking if the Word is an Anagram ]&#40;https://github.com/1G4S/Algorithms/blob/9f2791656e76176dce66da56f4991221304fa4c8/src/main/java/com/app/algorithms/stringAlgorithms/StringAlgorithms.java#L6&#41;)

[//]: # ()
[//]: # (An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. The algorithm checks if two strings are anagrams by comparing sorted characters of both strings or by counting the occurrences of each character in both strings and then comparing these counts.)

[//]: # ()
[//]: # (## Caesar Cipher )

[//]: # ()
[//]: # (The Caesar cipher is a type of substitution cipher in which each letter in the plaintext is shifted a certain number of places down or up the alphabet. For example, with a shift of 1, 'A' would be replaced by 'B', 'B' would become 'C', etc. )

[//]: # (You can do [encryption]&#40;https://github.com/1G4S/Algorithms/blob/c15cf62702fe06639bd716db23510178adecdf9d/src/main/java/com/app/cipher/Ciphers.java#L5&#41; and [decryption]&#40;https://github.com/1G4S/Algorithms/blob/c15cf62702fe06639bd716db23510178adecdf9d/src/main/java/com/app/cipher/Ciphers.java#L25&#41; with this cipher.)