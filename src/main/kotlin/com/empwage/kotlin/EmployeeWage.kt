package com.empwage.kotlin

fun main(args: Array<String>) {
    println("Welcome to the Employee wage program")

    val isAbsent = 0
    val isPresent = 1
    if (randNumber(isAbsent, isPresent) == 0) {
       println("Employee is Absent")
    } else {
        println("Employee is Present")
    }
}
fun randNumber(isAbsent: Int, isPresent: Int): Int {
    return (isAbsent..isPresent).random()
}