package com.example.kotlinbasics

fun main() {

    // Immutable list
//    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

    // Mutable list
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")

    println(shoppingList)

    shoppingList.removeAt(2)
    println(shoppingList)
    shoppingList.removeAt(1)
    println(shoppingList)

    shoppingList.add(2, "RAM")
    println(shoppingList[3])

    shoppingList[3] = "Graphics Card RX 7800XT"
    println(shoppingList)

    shoppingList.set(1, "Water Cooling")
    println(shoppingList)

    

}

/*
data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)
*/

/*
fun askCoffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()
    println("How many spoons of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
    // call function
//    makeCoffee(sugarCountInt, name)

}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 1) {
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}")
    } else if (coffeeDetails.sugarCount == 0) {
        println("Coffee with no sugar for ${coffeeDetails.name}")
    } else {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")
    }
}

*/