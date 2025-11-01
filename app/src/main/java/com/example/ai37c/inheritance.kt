package com.example.ai37c

open class Vehicle {
    var type: String = ""
    var model: String = ""
    var maxSpeed: Int = 0

    fun show() {
        println("Type: $type")
        println("Model: $model")
        println("Max Speed: $maxSpeed km/h")
    }

    open fun start() {
        println("$model is starting...")
    }

    open fun accelerate(speed: Int) {
        println("$model is accelerating to $speed km/h")
    }
}

class Car : Vehicle() {
    fun superAccelerate(speed: Int) {
        super.accelerate(speed)
        println("Super acceleration activated!")
    }

    override fun start() {
        println("Car has started")
    }

    override fun accelerate(speed: Int) {
        println("Car accelerates at $speed")
    }
}

class MotorCycle : Vehicle()

fun main() {
    var car = Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 350
    car.show()
    car.start()
    car.accelerate(speed = 120)
    car.superAccelerate(speed = 120)

    //creating motorcycle object
    var motor = MotorCycle()
    motor.type = "Motorcycle"
    motor.model = "Yamaha"
    motor.maxSpeed = 180
    motor.accelerate(speed = 100)
    motor.show()
}