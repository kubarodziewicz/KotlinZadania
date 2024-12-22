package com.example.kotlin7zadan

interface Weather {
    fun displayWeather()
}



data class City(val name: String, val weather: Weather)