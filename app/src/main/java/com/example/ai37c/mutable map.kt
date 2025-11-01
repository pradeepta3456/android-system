package com.example.ai37c

val studentMarks = mutableMapOf(
"ram" to 45,
"shyam" to 45,
"hari" to 45,
"gita" to 45
)

fun main() {
    studentMarks["ram"] = 60
    studentMarks.put("sabin", 80)
    println("Enter student name: ")
    val input = readln().lowercase()
    println(studentMarks[input])
}