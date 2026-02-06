fun main() {
    // Variables
    // val - This keyword is used for to create Read-Only variables.
    // var - This keyword is used for to create ReAssigned variables.

    val name: String = "Kotlin"
    var age: Int = 18
    age = 15

    println("Name = $name and age = $age\n")


    // Datatypes
    // 1. Numbers - byte, short, int, long
    // 2. Floating-points - float, double
    // 3. Booleans - booleans (true, false)
    // 4. Characters - char, string
    // 5. Collections - array, list, set, map

    // Most used datatypes in kotlin examples:-
    val category: Char = 'A'
    val message: String = "Hello, Kotlin!"
    val rgbCode: Byte = 112
    val pinCode: Short = 11256
    val number1: Int = 45_263
    val phone: Long = 99_99_95_005
    val price: Float = 82_650.260F
    val salary: Double = 89_55_650.500
    val isStatusActive: Boolean = true
    val myArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    println("Category = $category")
    println("Message = $message")
    println("RGB Code = $rgbCode")
    println("Pin code = $pinCode")
    println("Number 1 = $number1")
    println("Phone = $phone")
    println("Price = $price")
    println("Salary = $salary")
    println("Is StatusActive = $isStatusActive")
    println("My Array = ${myArray.contentToString()}")

}