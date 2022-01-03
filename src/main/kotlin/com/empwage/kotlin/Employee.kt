package com.empwage.kotlin

fun main(args: Array<String>) {
    println("Welcome to the Employee wage program")
    val employee = Employee()
    val isAbsent = 0
    val isPresent = 1
    val wagePerHour = 20
    println(employee.checkDailyWage(isAbsent, isPresent, wagePerHour))
}

class Employee {
    private fun randNumber(isAbsent: Int, isPresent: Int): Int {
        return (isAbsent..isPresent).random()
    }

    fun checkDailyWage(isAbsent: Int, isPresent: Int, wagePerHour: Int) {
        if (randNumber(isAbsent, isPresent) == 0) {
            val dailyHours = 0
            println("Employee is Absent")
            println("The Employee Wage is ${calculateWage(wagePerHour, dailyHours)}")
        } else {
            val dailyHours = 8
            println("Employee is Present")
            println("The Employee Wage is ${calculateWage(wagePerHour, dailyHours)}")
        }
    }

    private fun calculateWage(wage_per_hour: Int, dailyHours: Int): Int {
        val dailyWage = wage_per_hour * dailyHours
        return (dailyWage)
    }
}