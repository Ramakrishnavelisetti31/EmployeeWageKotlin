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
        if (randNumber(isFullTime, isPartTime) == 1) {
            val dailyHours = 8
            println("Employee is Present for Full Time")
            println("The Employee Wage is ${calculateWage(wagePerHour, dailyHours)}")
        } else if(randNumber(isFullTime, isPartTime) == 2){
            val dailyHours = 4
            println("Employee is Present for Part Time")
            println("The Employee Wage is ${calculateWage(wagePerHour, dailyHours)}")
        } else {
            val dailyHours = 0
            println("Employee is Absent")
            println("The Employee Wage is ${calculateWage(wagePerHour, dailyHours)}")
        }
    }

    private fun calculateWage(wage_per_hour: Int, dailyHours: Int): Int {
        val dailyWage = wage_per_hour * dailyHours
        return (dailyWage)
    }
}