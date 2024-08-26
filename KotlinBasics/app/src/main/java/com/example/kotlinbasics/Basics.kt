package com.example.kotlinbasics

fun main() {

    // call function
    makeCoffee(1, "Jimmy")
    makeCoffee(2, "Bob")
    makeCoffee(30, "Sarah")
    makeCoffee(0, "Sarah")


//    var pi = 3.14f
//
//    println(pi)
//
//    pi = 3.1415926535f
//    println(pi)

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

