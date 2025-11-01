package com.example.ai37c

fun main(){
    var vehicle = arrayListOf<String>("Tata","Kia","Hyundai","MG")
    for(y in vehicle.indices){
        println("The value in $y index is : - "+ vehicle[y])
    }
}