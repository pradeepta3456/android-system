package com.example.ai37c

fun studentMarks(){
    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )
    println("Enter student name:")
    val input : String = readln().lowercase()
    println(studentMarks[input])
}

fun main(){
    studentMarks()
}
