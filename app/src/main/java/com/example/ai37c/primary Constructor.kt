package com.example.ai37c

fun main(){
    class MyCars constructor(var name: String, var model:Int){
        init{
            println("My car name is $name and model is $model")
        }
    }
    MyCars("Kia",2005)
}