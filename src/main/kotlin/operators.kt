/**
 * Kotlin Practice: Operators (Comprehensive Guide - All Operators Included)
 * Created by: Adarsh Kumar
 * Goal: Master every operator category with their technical translations.
 */

fun main() {
    val a = 10
    val b = 3

    // --- 1. ARITHMETIC OPERATORS ---
    println("=== 1. Arithmetic Operators ===")
    println("$a + $b = ${a + b} \t\t (Translate to: a.plus(b))")   // Addition: Do numbers ko jodna
    println("$a - $b = ${a - b} \t\t (Translate to: a.minus(b))")  // Subtraction: Pehle mein se dusra ghatana
    println("$a * $b = ${a * b} \t\t (Translate to: a.times(b))")  // Multiplication: Guna karna
    println("$a / $b = ${a / b} \t\t (Translate to: a.div(b))")    // Division: Bhaag dena (Sirf quotient milega)
    println("$a % $b = ${a % b} \t\t (Translate to: a.rem(b))")    // Modulus: Bhaag dene ke baad bacha hua sheshfal (Remainder)


    // --- 2. RELATIONAL OPERATORS ---
    println("\n=== 2. Relational Operators ===")
    println("$a > $b  = ${a > b} \t (Translate to: a.compareTo(b) > 0)")  // Greater than: Kya a bada hai b se?
    println("$a < $b  = ${a < b} \t (Translate to: a.compareTo(b) < 0)")  // Less than: Kya a chhota hai b se?
    println("$a >= $b = ${a >= b} \t (Translate to: a.compareTo(b) >= 0)") // GTE: Kya a bada ya barabar hai b ke?
    println("$a <= $b = ${a <= b} \t (Translate to: a.compareTo(b) <= 0)") // LTE: Kya a chhota ya barabar hai b ke?
    println("$a == $b = ${a == b} \t (Translate to: a?.equals(b) ?: ...)") // Equality: Kya dono ki value same hai?
    println("$a != $b = ${a != b} \t (Translate to: !(a?.equals(b) ?: ...))") // Not Equal: Kya dono alag-alag hain?


    // --- 3. ASSIGNMENT OPERATORS (All Included) ---
    println("\n=== 3. Assignment Operators ===")
    var c = 10
    println("Initial c: $c")
    c += 2; println("c += 2  => $c \t (Translate to: c.plusAssign(2))")  // Add & Assign: c mein 2 jodo aur wapas c mein save karo
    c -= 3; println("c -= 3  => $c \t (Translate to: c.minusAssign(3))") // Sub & Assign: c mein se 3 ghatao aur update karo
    c *= 4; println("c *= 4  => $c \t (Translate to: c.timesAssign(4))") // Mul & Assign: c ko 4 se guna karke update karo
    c /= 6; println("c /= 6  => $c \t (Translate to: c.divAssign(6))")   // Div & Assign: c ko 6 se bhaag dekar update karo
    c %= 3; println("c %= 3  => ${0} \t (Translate to: c.remAssign(3))")   // Mod & Assign: Remainder nikal kar c mein save karo


    // --- 4. UNARY OPERATORS ---
    println("\n=== 4. Unary Operators ===")
    var d = 5
    println("d++: ${d++} | ++d: ${++d}") // Increment: Value ko 1 se badhana (Post: Baad mein, Pre: Pehle)
    println("d--: ${d--} | --d: ${--d}") // Decrement: Value ko 1 se kam karna


    // --- 5. LOGICAL OPERATORS (Including NOT) ---
    println("\n=== 5. Logical Operators ===")
    val x = true
    val y = false
    println("x && y (AND): ${x && y} \t (Result TRUE tabhi hoga jab dono conditions true hon)")
    println("x || y (OR):  ${x || y} \t (Result TRUE hoga agar koi ek bhi condition true ho)")
    println("!x (NOT):     ${!x} \t (Translate to: x.not()) - True ko False aur False ko True karta hai")


    // --- 6. BITWISE OPERATORS (All Functions Included) ---
    println("\n=== 6. Bitwise Operators ===")
    val n1 = 10 // Binary: 1010
    val n2 = 2  // Binary: 0010
    println("$n1 and $n2: ${n1 and n2} \t (Bitwise AND: Dono bits 1 hon to result 1)")
    println("$n1 or $n2:  ${n1 or n2} \t (Bitwise OR: Koi ek bit 1 ho to result 1)")
    println("$n1 xor $n2: ${n1 xor n2} \t (Bitwise XOR: Dono bits alag hon to result 1)")
    println("inv 10:     ${n1.inv()} \t (Bitwise Inverse: 0 ko 1 aur 1 ko 0 kar deta hai)")
    println("10 shl 1:   ${10 shl 1} \t (Signed Shift Left: Bits ko left shift karo, 'ushl' ki zaroorat nahi hoti)")
    println("10 shr 1:   ${10 shr 1} \t (Signed Shift Right: Sign bit preserve karke right shift)")
    println("10 ushr 1:  ${10 ushr 1} \t (Unsigned Shift Right: Zero-fill right shift, naye bits 0 honge)")
}