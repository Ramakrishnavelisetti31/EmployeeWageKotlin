package com.empwage.kotlin

fun main(args: Array<String>) {
    println("Welcome to the Employee wage program")
    val employee = Employee()
    val isFullTime = 1
    val isPartTime = 2
    println(employee.employeeWage(isFullTime, isPartTime, 20, 20, 100))
}

class Employee() {
     private fun randNumber(isFullTime: Int, isPartTime: Int,): Int {
        return (isFullTime..isPartTime).random()
    }

     fun employeeWage(isFullTime: Int, isPartTime: Int, wagePerHour: Int, noOfDays: Int, maxHours: Int) {
         var day: Int= 1
         var dailyWage: Int = 0
         var monthlyWage: Int = 0
         var hours: Int = 0
         while (day <= noOfDays && hours <= maxHours) {
             when (randNumber(isFullTime, isPartTime)) {
                 1 -> {
                     println("Employee is Present for Full Time")
                     var dailyHours = 8
                     dailyWage = calculateWage(wagePerHour, dailyHours)
                     hours += dailyHours
                     monthlyWage += dailyWage
                     println("Employee Wage for $day is $dailyWage")
                 }
                 2 -> {
                     println("Employee is Present for Part Time")
                     var dailyHours = 4
                     dailyWage = calculateWage(wagePerHour, dailyHours)
                     hours += dailyHours
                     monthlyWage += dailyWage
                     println("Employee Wage for $day is $dailyWage")
                 }
                 else -> {
                     println("Employee is Absent")
                     var dailyHours = 0
                     dailyWage = calculateWage(wagePerHour, dailyHours)
                     hours += dailyHours
                     monthlyWage += dailyWage
                     println("Employee Wage for $day is $dailyWage")
                 }
             }
             day += 1
         }
         println("The Total wage of Employee for a Month is $monthlyWage and the Total Hours are $hours")
     }

    private fun calculateWage(wagePerHour: Int, dailyHours: Int): Int {
         val dailyWage = wagePerHour * dailyHours
         return (dailyWage)
     }
 }
