/**
 * Kotlin Practice: Control Flow (Topic 3 - While & Do-While Loops)
 * Created by: Adarsh Kumar
 * Goal: Understand Entry-Controlled vs Exit-Controlled loops.
 *
 * 🧠 CONCEPT OVERVIEW:
 * 1. While Loop: Pehle condition check hoti hai, phir code chalta hai. (Entry Control)
 * 2. Do-While Loop: Pehle code chalta hai, baad mein condition check hoti hai. (Exit Control)
 * 3. Use Case: Jab humein ye NA pata ho ki loop kitni baar chalana hai (e.g., Waiting for server response).
 */

fun main() {
    // --- 1. BASIC WHILE LOOP (Entry Controlled) ---
    println("=== 1. Basic While Loop ===")

    var fuel = 5 // Initial state

    /* 🧠 DEEP DIVE: execution Flow
       Ye loop tab tak chalega jab tak condition (fuel > 0) TRUE hai.
       Agar shuru mein hi fuel = 0 hota, toh ye loop EK BAAR bhi nahi chalta.
       Isiliye ise 'Entry Controlled Loop' kehte hain.
    */
    while (fuel > 0) {
        println("Driving... Fuel left: $fuel liters")
        fuel-- // Decrement (Bahut zaruri hai, warna infinite loop ban jayega!)
    }
    println("Car stopped. Out of fuel.")


    // --- 2. DO-WHILE LOOP (Exit Controlled) ---
    println("\n=== 2. Do-While Loop ===")

    var dataLoadRetry = 0

    /* 🧠 DEEP DIVE: The Guarantee
       'do-while' ki khasiyat ye hai ki ye block kam se kam EK BAAR zaroor chalta hai,
       chahe condition shuru mein hi False kyu na ho.
       Use Case: User se password mangna (kam se kam ek baar toh mangoge hi).
    */
    do {
        println("Loading data... (Attempt: ${dataLoadRetry + 1})")
        dataLoadRetry++
    } while (dataLoadRetry < 3) // Check baad mein hogi

    println("Data Loaded Successfully.")


    // --- 3. HANDLING INFINITE LOOPS (Warning) ---
    println("\n=== 3. Infinite Loop Control ===")

    var serverStatus = "Connecting"
    var seconds = 0

    /* 🧠 DEEP DIVE: Infinite Loop Logic
       'while(true)' ka matlab hai loop hamesha chalta rahega.
       Aise loops ko rokne ke liye hum 'break' keyword ka use karte hain.
       Ye technique Servers aur Game Loops mein use hoti hai.
    */
    while (true) {
        seconds++
        println("Server Status: $serverStatus ($seconds sec)")

        if (seconds == 4) {
            println("Server Connected! Stopping loop.")
            break // Loop ko forcefully todne ke liye
        }
    }


    // --- 4. SKIP ITERATION (Continue Keyword) ---
    println("\n=== 4. Continue Keyword ===")

    var number = 0
    while (number < 5) {
        number++

        // Agar number 3 hai, toh print mat karo, wapas upar jao check karne.
        if (number == 3) {
            println("Skipping number 3...")
            continue // Current round ko yahi chhod do aur next round start karo
        }

        println("Processing Number: $number")
    }
}