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

fun main() {
    val cities = listOf(
        City("Warsaw", Sunny()),
        City("Berlin", Rainy()),
        City("Paris", Stormy()),
        City("London", Foggy()),
        City("Moscow", Snowy()),
        City("Madrid", Sunny()),
        City("Rome", Sunny()),
        City("Athens", Sunny()),
        City("Stockholm", Snowy()),
        City("Helsinki", Snowy()),
        City("Dublin", Rainy()),
        City("Edinburgh", Foggy()),
        City("Lisbon", Sunny()),
        City("Prague", Rainy()),
        City("Vienna", Foggy()),
        City("Oslo", Snowy()),
        City("Copenhagen", Rainy()),
        City("Brussels", Rainy()),
        City("Amsterdam", Foggy()),
        City("Zurich", Snowy())
    )
}