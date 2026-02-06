/**
 * Kotlin Practice: Control Flow (Topic 1 - If-Else Expression)
 * Created by: Adarsh Kumar
 * Goal: Deep dive into all 4 types of If-Else logic and understand 'If as an Expression'.
 *
 * 🧠 DEEP DIVE CONCEPTS:
 * 1. Condition Rule: 'if' ke andar jo bhi likho, uska final result Boolean (true/false) hona chahiye.
 * 2. Expression Power: Kotlin mein 'if' value return kar sakta hai (Java/C++ se alag).
 * 3. Scope Rule: Nested if mein inner block outer variables ko use kar sakta hai, par outer inner ko nahi.
 */

fun main() {
    // --- 1. IF STATEMENT (The Basic Guard) ---
    println("=== 1. Basic If Statement ===")

    val isRaining = true

    /* 🔍 DEEP DIVE: "Strictly Boolean" ka asli matlab
       Kotlin C++ ya Python jaisa nahi hai jahan if(1) ya if("text") True maana jata hai.
       Yahan bracket () ke andar FINAL result 'true' ya 'false' hi aana chahiye.

       Valid Examples:
       - if (isRaining)      -> Kyunki ye direct Boolean variable hai.
       - if (10 > 5)         -> Valid, kyunki '10 > 5' ka result 'true' (Boolean) hai.
       - if (x == 1 && y == 2)-> Valid, kyunki Logical operators Boolean dete hain.
    */

    // Example 1: Direct Boolean
    if (isRaining) {
        println("Take an umbrella.")
    }

    // Example 2: Relational Operator (Result is Boolean)
    // 2 > 1 solve hokar 'true' ban jata hai, isliye ye allowed hai.
    if (2 > 1) println("Math is working! (2 is greater than 1)")


    // --- 2. IF-ELSE STATEMENT (The Binary Choice) ---
    println("\n=== 2. If-Else Statement ===")
    val age = 16

    // Flow: Agar condition True hui to 'if' chalega, nahi to 'else' chalega.
    if (age >= 18) {
        println("Result: Vote kar sakte hain.")
    } else {
        println("Result: Wait for ${18 - age} years.")
    }


    // --- 3. IF-ELSE-IF LADDER (The Priority Check) ---
    println("\n=== 3. If-Else-If Ladder ===")
    val marks = 75

    /*
       🧠 PERFORMANCE NOTE (Short-Circuiting):
       Ladder upar se niche check hoti hai.
       Jaise hi pehli 'True' condition milti hai, compiler baaki niche ke saare 'else-if'
       ko ignore kar deta hai (unhe check bhi nahi karta).
    */
    if (marks >= 90) {
        println("Grade: A+ (Topper)")
    } else if (marks >= 80) {
        println("Grade: A (Excellent)")
    } else if (marks >= 70) {
        println("Grade: B (Good)") // Yahan condition True hui, execution yahan ruk jayega.
    } else if (marks >= 60) {
        println("Grade: C (Average)") // Ye line kabhi check nahi hogi (Resource saved).
    } else {
        println("Grade: D (Fail)")
    }


    // --- 4. NESTED IF (Logic inside Logic) ---
    println("\n=== 4. Nested If Statement ===")
    val hasLoginId = true
    val hasPassword = true
    val isOtpCorrect = false

    /*
       🧠 SCOPE RULE (Memory Visibility):
       - Outer block ka variable (hasLoginId) -> Inner block mein available hai.
       - Lekin agar Inner block mein koi variable banate, to wo Outer mein available nahi hota.
    */
    if (hasLoginId) {
        // Outer Layer Check Passed
        if (hasPassword) {
            // Middle Layer Check Passed
            if (isOtpCorrect) {
                // Innermost Layer
                println("Login Successful!")
            } else {
                println("Login Failed: Incorrect OTP.")
            }
        } else {
            println("Login Failed: Password Missing.")
        }
    } else {
        println("Login Failed: No Login ID.")
    }


    // --- 🔥 5. DEEP DIVE: IF AS AN EXPRESSION (Kotlin Superpower) ---
    println("\n=== 5. If as an Expression ===")
    val number = 10

    /*
       Expression Rule 1: 'else' branch is MANDATORY.
       Agar hum value return kar rahe hain, to har situation ka jawaab hona chahiye.
       Agar 'else' nahi hoga aur condition false ho gayi, to variable 'resultType' mein kya store hoga?
       Isliye Kotlin force karta hai ki 'else' likhna hi padega.

       Expression Rule 2: Last line is the Return Value.
       Block ke andar aap kitni bhi lines likho (e.g., println), lekin jo
       LAST line hogi, wahi variable mein store hogi.
    */

    val resultType = if (number % 2 == 0) {
        println("Processing logic for Even...") // Ye sirf print hoga
        "Even" // <-- Ye value return hokar 'resultType' ban jayegi
    } else {
        println("Processing logic for Odd...")
        "Odd"
    }

    println("Final Output: Number $number is $resultType")
}