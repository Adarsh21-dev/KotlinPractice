/**
 * Kotlin Practice: Control Flow (Topic 3 - While & Do-While Loops)
 * Created by: Adarsh Kumar
 *
 * 🎯 STUDY STRATEGY (The 80/20 Rule):
 * 1. MOST USED (Focus Here):
 * - Basic 'while' loop: State check karne ke liye (e.g., while(isActive)).
 * - 'break' & 'continue': Complex logic se bahar nikalne ke liye.
 *
 * 2. LEAST USED (Just read once):
 * - 'do-while': Android Dev mein iska use 1% se bhi kam hai.
 * - 'while' for Arrays: NEVER do this in production.
 * - Manual Iterators: Hum modern Kotlin mein '.forEach' use karte hain.
 *
 * 🧠 DEEP DIVE CONCEPTS:
 * 1. Entry vs Exit Control: Check pehle (While) ya baad mein (Do-While)?
 * 2. Array Traversal: While loop se array access (Manual Indexing).
 * 3. Iterator Pattern: Professional way to handle data streams (Database/Lists).
 * 4. NO ELSE SUPPORT: Kotlin mein 'while-else' nahi hota.
 *
 * 💡 WHY SKIP / AVOID? (Practical Reasoning):
 * 1. Arrays ke liye 'while' kyu nahi?
 * - Risk: Aapko index khud banana padta hai aur 'index++' khud karna padta hai.
 * - Crash: Agar 'index++' bhool gaye toh App Crash (Infinite Loop).
 * - Solution: 'For Loop' (06_for_loop.kt) best hai, wo automatic next item par jata hai.
 *
 * 2. 'Do-While' kyu nahi?
 * - Reason: Programming mein aise scenarios bohot kam aate hain jahan humein "Check baad mein" karna ho.
 * - Safety: Usually, hum pehle check karna pasand karte hain taaki error na aaye.
 */

fun main() {
    // --- 1. BASIC WHILE LOOP (Entry Controlled) ---
    println("=== 1. Basic While Loop ===")
    var fuel = 3

    /* 🧠 DEEP DIVE: Execution Flow (Entry Control)
       Ye loop tab tak chalega jab tak condition (fuel > 0) TRUE hai.
       Agar shuru mein hi fuel = 0 hota, toh ye loop EK BAAR bhi nahi chalta.
       Isiliye ise 'Entry Controlled Loop' kehte hain - Pehle ID check, fir Entry.
    */
    while (fuel > 0) {
        println("Driving... Fuel left: $fuel")
        fuel--
    }


    // --- 2. DO-WHILE LOOP (Exit Controlled) ---
    println("\n=== 2. Do-While Loop ===")
    var retryCount = 0

    /* 🧠 DEEP DIVE: The Guarantee (Exit Control)
       'do-while' ki khasiyat ye hai ki ye block kam se kam EK BAAR zaroor chalta hai,
       chahe condition shuru mein hi False kyu na ho.
       Use Case: User se password mangna ya Server retry logic (kam se kam ek try to banta hai).
    */
    do {
        println("Connecting to Server... (Attempt ${retryCount + 1})")
        retryCount++
    } while (retryCount < 2)


    // --- 3. WHILE WITH ARRAYS (Manual Indexing) ---
    println("\n=== 3. While Loop with Arrays ===")
    val skills = arrayOf("Kotlin", "Java", "Python", "Dart")
    var index = 0

    /* 🧠 DEEP DIVE: Why use While for Arrays?
       Waise to 'for' loop arrays ke liye better hai.
       Par 'while' tab kaam aata hai jab humein index ko irregular tarike se badhana ho.
       Example: Kabhi i++, kabhi i += 2 (Skipping elements logic).
    */
    while (index < skills.size) {
        println("Skill $index: ${skills[index]}")
        index++ // Increment zaroori hai, warna Infinite Loop ban jayega!
    }


    // --- 4. THE ITERATOR PATTERN (Professional Way) ---
    println("\n=== 4. While with Iterator (Standard Logic) ===")
    val todoList = listOf("Code", "Eat", "Sleep")
    val iterator = todoList.iterator()

    /* 🧠 DEEP DIVE: hasNext() Logic
       Ye pattern Databases (SQLite/Room) aur bade Lists read karne mein use hota hai.
       Hum check karte hain: "Kya agla item hai?" (hasNext)
       Agar haan, to "Agla item fetch karo" (next).
    */
    while (iterator.hasNext()) {
        val item = iterator.next()
        println("To-Do: $item")
    }


    // --- 5. INFINITE LOOP & BREAK ---
    println("\n=== 5. Handling Infinite Loops ===")
    var seconds = 0

    /* 🧠 DEEP DIVE: Infinite Loop & Game Logic
       'while(true)' ka matlab hai loop hamesha chalta rahega.
       Ye technique Game Development (Game Loop) aur Servers mein use hoti hai.
       Aise loops ko rokne ke liye 'break' keyword hi ek rasta hai.
    */
    while (true) {
        seconds++
        if (seconds == 3) {
            println("Time's up! Breaking the loop.")
            break // Loop ko forcefully todne ke liye
        }
    }


    // --- 6. SKIP ITERATION (Continue Keyword) ---
    println("\n=== 6. Continue Keyword ===")
    var number = 0
    while (number < 5) {
        number++

        // Agar number 3 hai, toh print mat karo, wapas upar jao.
        if (number == 3) {
            println("Skipping number 3...")
            continue // Current round ko yahi chhod do aur next round start karo
        }
        println("Processing Number: $number")
    }

    /* ⚠️ MYTH BUSTER: While-Else
       Kotlin does NOT support 'while-else'.
       Python mein hota hai: while(cond): ... else: ...
       Kotlin mein agar aapko 'else' chahiye, to loop ke baad normal 'if' lagana padega.
    */
}