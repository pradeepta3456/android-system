package com.example.ai37c

fun main(){
    var number1:Int = 5
    var number2:Int = 8
    var number3:Int = 12
    var result:Boolean = false;
    result = (number1 > number2) && (number3 > number2)
    println(result)
    result = (number1 > number2) || (number3 > number2)
    println(result)
}