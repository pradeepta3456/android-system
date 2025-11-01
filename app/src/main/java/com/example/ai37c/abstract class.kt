package com.example.ai37c

fun main(){
    abstract class Vehicle{
        abstract fun vehicleName(name:String) : String
        fun vehicleType(type:String): String{
            return type;
        }
        abstract var model: Int
        var speed:Int? = null
    }
    class Car(override var model:Int) : Vehicle(){
        override fun vehicleName(name: String): String{
            return name
        }
        fun main(args: Array<String>){
            var car = Car(2024)
            car.speed = 300

            println("Name : ${car.vehicleName("Ferrari")}\n"+
                    "Type: ${car.vehicleType("Car")}\n"+
                    "Model: ${car.model}\n"+
                    "Speed: ${car.speed}")
        }
    }
}