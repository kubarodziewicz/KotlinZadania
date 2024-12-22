package com.example.kotlin7zadan

class Krokomierz {
    companion object {
        var numberOfSteps: Int = 0

        fun doStep(amountOfSteps: Int) {
            for(x in 1..amountOfSteps) {
                numberOfSteps += 1
            }
            println("Liczba krokow: $numberOfSteps")
        }
        fun resetStepsCount() {
            numberOfSteps = 0
            println("Liczba krokow: $numberOfSteps")
        }
    }
}
fun main() {
    Krokomierz.doStep(3)
    Krokomierz.resetStepsCount()
    Krokomierz.doStep(5)
}