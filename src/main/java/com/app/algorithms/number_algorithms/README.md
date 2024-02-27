# Algorithm Descriptions

## Fibonacci Sequence

The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. Mathematically, it can be expressed as:
`F(n) = F(n-1) + F(n-2)`
with initial conditions `F(0) = 0` and `F(1) = 1`. The problem can be solve [iteratively](https://github.com/1G4S/Algorithms/blob/3a090b95378aeeef547994ae763c26f8ea7a47db/src/main/java/com/app/algorithms/numberAlgorithms/NumberAlgorithms.java#L4) and [recursively](https://github.com/1G4S/Algorithms/blob/3a090b95378aeeef547994ae763c26f8ea7a47db/src/main/java/com/app/algorithms/numberAlgorithms/NumberAlgorithms.java#L19).

## [Sieve of Eratosthenes](https://github.com/1G4S/Algorithms/blob/b22e4631d5a886d2ad1abd91ee10be8682e25c76/src/main/java/com/app/algorithms/numberAlgorithms/NumberAlgorithms.java#L31)

The Sieve of Eratosthenes is an efficient algorithm for finding all prime numbers up to a specified integer. It works by iteratively marking the multiples of each prime number starting from 2, excluding the prime number itself. The unmarked numbers that remain are primes.
