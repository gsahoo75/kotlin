fun main() {
    // Sample collection for demonstration
    val numbers = listOf(1, 2, 3, 4, 5)

    // 1. `all` - Checks if all elements satisfy the condition
    val allPositive = numbers.all { it > 0 }
    println("All positive: $allPositive")  // Output: true

    // 2. `any` - Checks if any element satisfies the condition
    val anyNegative = numbers.any { it < 0 }
    println("Any negative: $anyNegative")  // Output: false

    // 3. `none` - Checks if no elements satisfy the condition
    val noNegative = numbers.none { it < 0 }
    println("No negative: $noNegative")  // Output: true

    // 4. `filter` - Returns a list of elements that satisfy the condition
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")  // Output: [2, 4]

    // 5. `map` - Transforms each element using a given function
    val squares = numbers.map { it * it }
    println("Squares: $squares")  // Output: [1, 4, 9, 16, 25]

    // 6. `reduce` - Reduces the elements by applying a binary operation (accumulation)
    val sum = numbers.reduce { acc, number -> acc + number }
    println("Sum using reduce: $sum")  // Output: 15

    // 7. `fold` - Similar to `reduce`, but with an initial value
    val sumWithInitial = numbers.fold(10) { acc, number -> acc + number }
    println("Sum using fold: $sumWithInitial")  // Output: 25

    // 8. `forEach` - Applies an action on each element of the collection
    numbers.forEach { println("Element: $it") }
    // Output:
    // Element: 1
    // Element: 2
    // Element: 3
    // Element: 4
    // Element: 5

    // 9. `find` - Finds the first element that satisfies the condition
    val firstEven = numbers.find { it % 2 == 0 }
    println("First even number: $firstEven")  // Output: 2

    // 10. `maxOrNull` - Returns the largest element, or null if the collection is empty
    val maxNumber = numbers.maxOrNull()
    println("Max number: $maxNumber")  // Output: 5

    // 11. `minOrNull` - Returns the smallest element, or null if the collection is empty
    val minNumber = numbers.minOrNull()
    println("Min number: $minNumber")  // Output: 1
}
