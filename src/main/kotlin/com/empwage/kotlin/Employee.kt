package com.empwage.kotlin

fun main(args: Array<String>) {
    println("Welcome to the Employee wage program")
    val employee = Employee()
    val isFullTime = 1
    val isPartTime = 2
    println(employee.employeeWage(isFullTime, isPartTime, 20, 20))
}

class Employee() {
     private fun randNumber(isFullTime: Int, isPartTime: Int,): Int {
        return (isFullTime..isPartTime).random()
    }

     fun employeeWage(isFullTime: Int, isPartTime: Int, wagePerHour: Int, noOfDays: Int) {
         var day = 1
         var dailyWage = 0
         var monthlyWage = 0
         while (day <= noOfDays) {
             when (randNumber(isFullTime, isPartTime)) {
                 1 -> {
                     println("Employee is Present for Full Time")
                     dailyWage = calculateWage(wagePerHour, 8)
                     monthlyWage += dailyWage
                     println("Employee Wage for $day is $dailyWage")
                 }
                 2 -> {
                     println("Employee is Present for Part Time")
                     dailyWage = calculateWage(wagePerHour, 4)
                     monthlyWage += dailyWage
                     println("Employee Wage for $day is $dailyWage")
                 }
                 else -> {
                     println("Employee is Absent")
                     dailyWage = calculateWage(wagePerHour,0)
                     monthlyWage += dailyWage
                     println("Employee Wage for $day is $dailyWage")
                 }
             }
             day +=1
         }
         println("The Total wage of Employee for a Month is $monthlyWage")
     }

    private fun calculateWage(wagePerHour: Int, dailyHours: Int): Int {
         val dailyWage = wagePerHour * dailyHours
         return (dailyWage)
     }
 }
