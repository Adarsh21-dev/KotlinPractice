/**
 * Kotlin Practice: Variables and Data Types
 * Created by: Adarsh Kumar
 * Goal: Master the fundamentals of variables and data types.
 */

fun main() {
    // --- 1. VARIABLES (Keywords) ---
    // val (Value): Immutable/Read-only. Ek baar assign hone ke baad badla nahi ja sakta.
    // var (Variable): Mutable. Iski value ko baad mein re-assign (change) kiya ja sakta hai.

    val name: String = "Kotlin"
    var age: Int = 18
    age = 15 // Valid because 'age' is a var

    println("--- Basic Info ---")
    println("Name: $name | Age: $age\n")

    // --- 2. DATA TYPES (Kotlin Classes) ---
    /*
       Note: Kotlin mein sabhi Types Capital se shuru hote hain kyunki ye
       Objects hain, primitives nahi.
    */

    // 1. Numbers (Integer Types)
    val rgbCode: Byte = 112          // 8-bit
    val pinCode: Short = 11256       // 16-bit
    val count: Int = 45_263          // 32-bit (Most common, Range: +/- 2 Billion)
    val phone: Long = 99_99_95_005L  // 64-bit (L suffix is mandatory for Long, Range: Huge (For large data))

    // 2. Floating-points (Decimal Types)
    val price: Float = 82_650.26F    // 32-bit (F suffix is mandatory, 5-6 digits accuracy)
    val salary: Double = 89_55_650.5 // 64-bit (More precise, 15 digits accuracy (Common))

    // 3. Booleans (Logical Types)
    val isStatusActive: Boolean = true

    // 4. Characters & Sequences
    val category: Char = 'A'         // Single character (Single quotes)
    val message: String = "Hello!"   // Sequence of characters (Double quotes)

    // 5. Collections (Data Grouping)
    val numbersArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    // --- 3. OUTPUT SECTION ---
    println("--- Detailed Data Types ---")
    println("Category: $category")
    println("Message:  $message")
    println("Byte:     $rgbCode")
    println("Short:    $pinCode")
    println("Int:      $count")
    println("Long:     $phone")
    println("Float:    $price")
    println("Double:   $salary")
    println("Boolean:  $isStatusActive")

    // Arrays ko print karne ke liye .contentToString() zaruri hai
    println("Array:    ${numbersArray.contentToString()}")

    // --- 4. TYPE INFERENCE (Bonus Concept) ---
    // Kotlin itna smart hai ki agar aap :Type na likhein, toh bhi wo samajh jata hai.
    val autoString = "Adarsh" // Kotlin knows it's a String
    val autoInt = 2026        // Kotlin knows it's an Int
}