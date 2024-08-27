package com.example.kotlinbasics

class Dog (val name: String, val breed: String, val age: Int) {

    init {
        bark()
    }

    fun bark() {
        println("${this.name} says Woof Woof")
    }
}