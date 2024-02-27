# Number Algorithms Descriptions

## Fibonacci Sequence

The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. Mathematically, it can be expressed as:
`F(n) = F(n-1) + F(n-2)`
with initial conditions `F(0) = 0` and `F(1) = 1`. The problem can be solve [iteratively](https://github.com/1G4S/Algorithms/blob/a885265cb32dbae92b3ab98c5026caba7abd1b7f/src/main/java/com/app/algorithms/number_algorithms/NumberAlgorithms.java#L13) and [recursively](https://github.com/1G4S/Algorithms/blob/a885265cb32dbae92b3ab98c5026caba7abd1b7f/src/main/java/com/app/algorithms/number_algorithms/NumberAlgorithms.java#L37).

## [Sieve of Eratosthenes](https://github.com/1G4S/Algorithms/blob/a885265cb32dbae92b3ab98c5026caba7abd1b7f/src/main/java/com/app/algorithms/number_algorithms/EratosthenesSieve.java#L8)

The Sieve of Eratosthenes is an efficient algorithm for finding all prime numbers up to a specified integer. It works by iteratively marking the multiples of each prime number starting from 2, excluding the prime number itself. The unmarked numbers that remain are primes.
