package com.empwage.kotlin

fun main(args: Array<String>) {
    println("Welcome to the Employee wage program")
    val employee = Employee()
    val isFullTime = 1
    val isPartTime = 2
    println(employee.employeeWage("TCS",isFullTime, isPartTime, 18, 19, 90))
    println(employee.employeeWage("HCL",isFullTime, isPartTime, 16, 22, 80))
    println(employee.employeeWage("Accenture",isFullTime, isPartTime, 22, 18, 95))
}

class Employee() {
     private fun randNumber(isFullTime: Int, isPartTime: Int,): Int {
        return (isFullTime..isPartTime).random()
    }

     fun employeeWage(name: String, isFullTime: Int, isPartTime: Int, wagePerHour: Int, noOfDays: Int, maxHours: Int) {
         var day: Int= 1
         var dailyWage: Int = 0
         var monthlyWage: Int = 0
         var hours: Int = 0
         while (day <= noOfDays && hours <= maxHours) {
             when (randNumber(isFullTime, isPartTime)) {
                 1 -> {
                     var dailyHours = 8
                     dailyWage = calculateWage(wagePerHour, dailyHours)
                     monthlyWage += dailyWage
                 }
                 2 -> {
                     var dailyHours = 4
                     dailyWage = calculateWage(wagePerHour, dailyHours)
                     monthlyWage += dailyWage
                 }
                 else -> {
                     var dailyHours = 0
                     dailyWage = calculateWage(wagePerHour, dailyHours)
                     monthlyWage += dailyWage
                 }
             }
             day += 1
         }
         println("The Total wage for Employee in the $name for a Month is $monthlyWage")
     }

    private fun calculateWage(wagePerHour: Int, dailyHours: Int): Int {
         val dailyWage = wagePerHour * dailyHours
         return (dailyWage)
     }
 }
