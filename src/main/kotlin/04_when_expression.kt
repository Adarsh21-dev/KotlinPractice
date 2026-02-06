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
    println("=== 1. Basic When Statement ===")
    val day = 3

    when (day) {
        1 -> println("Monday: Start of work.")
        2 -> println("Tuesday: Keep going.")
        3 -> println("Wednesday: Mid-week.")
        4 -> println("Thursday: Almost there.")
        5 -> println("Friday: Weekend coming.")

        /* 🧠 DEEP DIVE: Multiple Matches
           Agar hum 'if' use karte to likhna padta: 'if (day == 6 || day == 7)'
           'when' mein comma (,) laga kar multiple values ek saath check kar sakte hain.
        */
        6, 7 -> println("Weekend: Party time!")

        else -> println("Invalid Day") // 'else' acts like 'default'
    }


    // --- 2. WHEN AS AN EXPRESSION (Returning Value) ---
    println("\n=== 2. When as an Expression ===")
    val month = 4

    // Rule: Jab 'when' se value return karte hain, toh 'else' likhna MANDATORY hai.
    val season = when (month) {
        12, 1, 2 -> "Winter"
        3, 4, 5 -> "Spring"
        6, 7, 8 -> "Summer"
        9, 10, 11 -> "Autumn"
        else -> "Unknown Season"
    }
    println("Month $month is in $season season.")


    // --- 3. WHEN WITH RANGES (The 'in' Keyword) ---
    println("\n=== 3. When with Ranges ===")
    val marks = 85

    /* 🧠 DEEP DIVE: Range Handling
       Java/C++ ke switch mein Range check nahi hoti. Wahan 'if' lagana padta.
       Kotlin mein 'in 90..100' ka matlab hai: marks >= 90 AND marks <= 100.
       Sabse clean syntax!
    */
    when (marks) {
        in 90..100 -> println("Grade: A+ (Outstanding)")
        in 80..89 -> println("Grade: A (Excellent)")
        in 70..79 -> println("Grade: B (Average)")
        !in 0..100 -> println("Error: Invalid Marks") // '!' means NOT in range
        else -> println("Grade: Fail")
    }


    // --- 4. WHEN WITH TYPES (Smart Casting - The Android Hero) ---
    println("\n=== 4. When with Type Checking (is) ===")
    val anyData: Any = "Hello Kotlin"

    /* 🧠 DEEP DIVE: Smart Casting Logic
       Notice karein humne 'anyData' ko manually String mein convert nahi kiya.
       Jaise hi 'when' ne check kiya 'is String' -> Kotlin compiler samajh gaya ki ye String hai.
       Isliye humne direct '.length' property use kar li. Ye feature bugs kam karta hai.
    */
    when (anyData) {
        is Int -> println("It is an Integer: ${anyData * 2}")
        is String -> println("It is a String of length: ${anyData.length}") // Automatic access!
        is Boolean -> println("It is a Boolean: $anyData")
        else -> println("Unknown Type")
    }


    // --- 5. ARGUMENT-LESS WHEN (Replacement for If-Else-If Ladder) ---
    println("\n=== 5. Argument-less When (Clean Logic) ===")
    val trafficLight = "Red"
    val isEmergency = true

    /* 🧠 DEEP DIVE: The Power of "No Argument"
       Yahan 'when' ke bagal mein brackets () nahi hain.
       Iska fayda: Hum alag-alag variables (trafficLight, isEmergency) ko ek hi
       logic flow mein check kar sakte hain. Ye code ko "Story" ki tarah banata hai.
    */
    when {
        isEmergency -> println("GO GO GO! (Emergency)") // Priority 1 check
        trafficLight == "Red" -> println("STOP")
        trafficLight == "Yellow" -> println("WAIT")
        trafficLight == "Green" -> println("GO")
        else -> println("Signal Malfunction")
    }
}