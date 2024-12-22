package com.example.kotlin7zadan

interface Weather {
    fun displayWeather()
}


class Sunny: Weather {
    override fun displayWeather() {
        println("Weather is sunny")
    }
}

class Rainy: Weather {
    override fun displayWeather() {
        println("Weather is rainy")
    }
}

class Stormy: Weather {
    override fun displayWeather() {
        println("Weather is stormy")
    }
}

class Snowy: Weather {
    override fun displayWeather() {
        println("Weather is snowy")
    }
}

class Foggy: Weather {
    override fun displayWeather() {
        println("Weather is foggy")
    }
}

data class City(val name: String, val weather: Weather)

