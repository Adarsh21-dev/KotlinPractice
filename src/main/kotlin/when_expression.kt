/**
 * Kotlin Practice: Control Flow (Topic 2 - When Expression)
 * Created by: Adarsh Kumar
 * Goal: Master the 'when' expression - Kotlin's most powerful branching tool.
 *
 * 🧠 WHY IS THIS A SUPERPOWER?
 * 1. Automatic Type Casting (Smart Cast).
 * 2. Can replace complex 'if-else-if' chains completely.
 * 3. Supports Ranges (in 1..10), Types (is String), and Logic.
 * 4. No need for 'break' statements (unlike Java/C++ switch).
 */

fun main() {
    // --- 1. WHEN AS A STATEMENT (Basic Switch) ---
    // Simple matching like C++/Java switch, but cleaner (No 'break' needed).
    println("=== 1. Basic When Statement ===")
    val day = 3

    when (day) {
        1 -> println("Monday: Start of work.")
        2 -> println("Tuesday: Keep going.")
        3 -> println("Wednesday: Mid-week.")
        4 -> println("Thursday: Almost there.")
        5 -> println("Friday: Weekend coming.")
        6, 7 -> println("Weekend: Party time!") // ✨ Feature: Multiple values in one line
        else -> println("Invalid Day") // 'else' acts like 'default'
    }


    // --- 2. WHEN AS AN EXPRESSION (Returning Value) ---
    // Just like 'if', 'when' can return a result directly into a variable.
    // RULE: 'else' branch is MANDATORY here.
    println("\n=== 2. When as an Expression ===")
    val month = 4

    val season = when (month) {
        12, 1, 2 -> "Winter"
        3, 4, 5 -> "Spring"
        6, 7, 8 -> "Summer"
        9, 10, 11 -> "Autumn"
        else -> "Unknown Season"
    }
    println("Month $month is in $season season.")


    // --- 3. WHEN WITH RANGES (The 'in' Keyword) ---
    // 'if (x >= 10 && x <= 20)' likhne ki zarurat nahi. Direct 'in' use karein.
    println("\n=== 3. When with Ranges ===")
    val marks = 85

    when (marks) {
        in 90..100 -> println("Grade: A+ (Outstanding)")
        in 80..89 -> println("Grade: A (Excellent)")
        in 70..79 -> println("Grade: B (Average)")
        !in 0..100 -> println("Error: Invalid Marks") // '!' means NOT in range
        else -> println("Grade: Fail")
    }


    // --- 4. WHEN WITH TYPES (Smart Casting - The Android Hero) ---
    // Ye Android mein sabse zyada use hota hai.
    // Agar hum check karte hain 'is String', toh Kotlin automatic us variable ko String maan leta hai.
    println("\n=== 4. When with Type Checking (is) ===")
    val anyData: Any = "Hello Kotlin" // 'Any' matlab ye kuch bhi ho sakta hai (Int, String, Boolean)

    when (anyData) {
        is Int -> println("It is an Integer: ${anyData * 2}") // Kotlin knows it's Int now
        is String -> println("It is a String of length: ${anyData.length}") // Automatic length property access
        is Boolean -> println("It is a Boolean: $anyData")
        else -> println("Unknown Type")
    }


    // --- 5. ARGUMENT-LESS WHEN (Replacement for If-Else-If Ladder) ---
    // Notice: 'when' ke bagal mein brackets () nahi hain.
    // Ye complex conditions ko clean tarike se likhne ka best tareeka hai.
    println("\n=== 5. Argument-less When (Clean Logic) ===")
    val trafficLight = "Red"
    val isEmergency = true

    when {
        isEmergency -> println("GO GO GO! (Emergency)") // Priority 1
        trafficLight == "Red" -> println("STOP")
        trafficLight == "Yellow" -> println("WAIT")
        trafficLight == "Green" -> println("GO")
        else -> println("Signal Malfunction")
    }
}