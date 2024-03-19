# Number Algorithms Descriptions

## Fibonacci Sequence

The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. Mathematically, it can be expressed as:
`F(n) = F(n-1) + F(n-2)`
with initial conditions `F(0) = 0` and `F(1) = 1`. The problem can be solve [iteratively](https://github.com/1G4S/Algorithms/blob/1c811471897048212033478305743984fc9b526e/src/main/java/com/app/algorithms/number_algorithms/NumberAlgorithms.java#L14) and [recursively](https://github.com/1G4S/Algorithms/blob/1c811471897048212033478305743984fc9b526e/src/main/java/com/app/algorithms/number_algorithms/NumberAlgorithms.java#L39).

## [Sieve of Eratosthenes](https://github.com/1G4S/Algorithms/blob/1c811471897048212033478305743984fc9b526e/src/main/java/com/app/algorithms/number_algorithms/EratosthenesSieve.java#L6)

The Sieve of Eratosthenes is an efficient algorithm for finding all prime numbers up to a specified integer. It works by iteratively marking the multiples of each prime number starting from 2, excluding the prime number itself. The unmarked numbers that remain are primes.

## [Prime Number Check](https://github.com/1G4S/Algorithms/blob/1c811471897048212033478305743984fc9b526e/src/main/java/com/app/algorithms/number_algorithms/NumberAlgorithms.java#L69)
A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
Determining whether a given number is prime involves checking that it is not divisible by any number less than itself (and greater than 1). 
The algorithm optimizes this process by only checking divisibility up to the square root of the number, as any factors larger than the square root would have a corresponding factor smaller than the square root.

## [Perfect Number Check](https://github.com/1G4S/Algorithms/blob/1c811471897048212033478305743984fc9b526e/src/main/java/com/app/algorithms/number_algorithms/NumberAlgorithms.java#L107)
A perfect number is a positive integer that is equal to the sum of its proper positive divisors, excluding the number itself. For instance, 6 is a perfect number because its divisors are 1, 2, and 3, and 1 + 2 + 3 = 6. 
The algorithm for checking if a number is perfect involves finding these divisors and summing them up to compare with the original number. It efficiently calculates the sum of divisors by iterating only up to the square root of the number and adjusting for perfect squares if necessary. 
This approach to checking for perfect numbers ensures a balance between accuracy and computational efficiency. 

## [Calculate sum of digits in number](https://github.com/1G4S/Algorithms/blob/1c811471897048212033478305743984fc9b526e/src/main/java/com/app/algorithms/number_algorithms/NumberAlgorithms.java#L138)
The algorithm for calculating the sum of digits in a number operates efficiently on both positive and negative integers
by first converting the input to its absolute value. It iteratively divides the number by 10 to isolate each digit and
accumulates these digits into a sum. This process continues until the entire number has been decomposed, ensuring that
all digits are accounted for in the final sum. It's a straightforward yet versatile method, suitable for a wide range
of applications where digit manipulation is required.
