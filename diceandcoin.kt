package com.example.a7aplikacji
import kotlin.random.Random

interface RollingTool {
    fun roll()
}

class Coin : RollingTool {
    override fun roll() {
        val randomInt = Random.nextInt(0, 2)
        if(randomInt == 1) {
            println("Heads")
        }
        else {
            println("Tails")
        }
    }
}

class Dice : RollingTool {
    override fun roll() {
        val randomInt = Random.nextInt(1,7)
        println(randomInt)
    }
}


fun main() {
    val coin = Coin()
    val dice = Dice()

    coin.roll()
    dice.roll()

}