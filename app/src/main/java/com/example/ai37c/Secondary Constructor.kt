package com.example.ai37c

fun main(){
    class MySecondCars{
        var name:String? = null
        var model:Int? = null

        constructor(n: String?, m:Int?){
            this.name = n
            this.model = m
        }
    }
    var mySecondCars = MySecondCars("Toyota",1997)
    println("My car name is ${mySecondCars.name} and model is ${mySecondCars.model}")
    }
