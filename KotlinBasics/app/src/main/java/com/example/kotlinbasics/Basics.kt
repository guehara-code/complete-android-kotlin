package com.example.kotlinbasics

fun main() {

   var daisy = Dog()
    daisy.bark()

}

fun divide(num1: Double, num2: Double): Double {
    val result = num1/num2
    return result
}

fun add(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}

fun askCoffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()
    println("How many spoons of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
    // call function
    makeCoffee(sugarCountInt, name)

}

fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar for $name")
    } else if (sugarCount == 0) {
        println("Coffee with no sugar for $name")
    } else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}

