package com.example.ai37c

fun main(){
    var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a' .. 'j'

    var check = 'z' in testCharRange
    println("mycharRange has z : $check")
    println(myCharRange)
    println(testCharRange)
}