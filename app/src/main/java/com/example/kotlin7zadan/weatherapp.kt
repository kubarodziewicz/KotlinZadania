package com.example.kotlin7zadan

interface Weather {
    val displayWeather: String
}


class Sunny: Weather {
    override val displayWeather: String = "sunny"
    }


class Rainy: Weather {
    override val displayWeather: String = "rainy"
}

class Stormy: Weather {
    override val displayWeather: String = "stormy"
}

class Snowy: Weather {
    override val displayWeather: String = "snowy"
}

class Foggy: Weather {
    override val displayWeather: String = "foggy"
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

    print("What city would you like to check the weather for?\n|")
    val displaycities = cities.forEach{city -> print(" ${city.name} |")}
    val usersCity = readln()
    val matchingCity = cities.find { city -> city.name.uppercase() == usersCity.uppercase() }
    if (matchingCity != null) {
        println("Weather in ${matchingCity.name} is ${matchingCity.weather.displayWeather}")
    }
}