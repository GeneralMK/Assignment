# JAVA PROJECT (OOPS) PART 1 - CODING SOLUTION

This repository contains solutions for (OOPS) PART 1 - CODING SOLUTION, including:
- String manipulation problems
- ArrayList duplicate removal
- Zoo Ecosystem Simulation (OOP: interface + abstract classes + inheritance + polymorphism)
- Registration validation (email/username/password rules)
- JUnit 5 tests (including **System.out capture** tests for `main()` output)

---

## Tech Stack
- Java (JDK 17+ recommended)
- Maven
- JUnit 5

---

## Exercises Implemented

1. Swap 2 Strings without a temporary variable (`SwapStrings`)
2. Count alphabetic characters in a string (`CountAlpha`)
3. Reverse a string (`ReverseString`)
4. Check if a string is palindrome (`PalindromeCheck`)
5. Check if two strings are anagrams (`AnagramCheck`)
6. Count vowels in `"documentation"` (`CountVowels`)
7. Count words in a string (`WordCount`)
8. Keep only strings starting with `"A"` and return in lower case (`FilterAStrings`)
9. First non-repeating character (`FirstNonRepeatingChar`)
10. Remove duplicates from `ArrayList` (`RemoveDuplicates`)
11. Zoo ecosystem simulation (OOP) (`ZooSimulation` + Animal classes)
12. Registration validation (`Registration`)

---

## Tests Included (JUnit 5)

All tests are located in:
`src/test/java/assignmenttests`

Test classes:
- `AnagramCheckTest`
- `CountAlphaTest`
- `CountVowelsTest`
- `FilterAStringsTest`
- `FirstNonRepeatingCharTest`
- `PalindromeCheckTest`
- `RegistrationTest`
- `RemoveDuplicatesTest`
- `ReverseStringTest`
- `SwapStringsTest`
- `WordCountTest`
- `ZooSimulationTest`

---

## Registration Validation Rules

The `Registration` class validates:
- Email must be **Yahoo only** (e.g. `name@yahoo.com`, `name@yahoo.co.za`)
- Username cannot be empty and must be **longer than 6**
- Password cannot be empty and must be **longer than 6**
- Password **must not contain** the username
