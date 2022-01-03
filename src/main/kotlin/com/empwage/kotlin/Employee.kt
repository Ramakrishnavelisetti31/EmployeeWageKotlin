package com.empwage.kotlin

fun main(args: Array<String>) {
    println("Welcome to the Employee wage program")
    val employee = Employee()
    val isFullTime = 1
    val isPartTime = 2
    val wagePerHour = 20
    println(employee.checkDailyWage(isFullTime, isPartTime, wagePerHour))
}

class Employee {
    private fun randNumber( isFullTime: Int, isPartTime: Int): Int {
        return (isFullTime..isPartTime).random()
    }

    fun checkDailyWage( isFullTime: Int, isPartTime: Int, wagePerHour: Int) {
        val dailyHours: Int
        when (randNumber(isFullTime, isPartTime)) {
            1 -> println("Employee is Present for Full Time\nThe Employee Wage is ${calculateWage(wagePerHour, 8)}")
            2 -> println("Employee is Present for Part Time\nThe Employee Wage is ${calculateWage(wagePerHour, 4)}")
            else -> println("Employee is Absent\nThe Employee Wage is ${calculateWage(wagePerHour, 0)}")
        }
    }

    private fun calculateWage(wagePerHour: Int, dailyHours: Int): Int {
        val dailyWage = wagePerHour * dailyHours
        return (dailyWage)
    }
}