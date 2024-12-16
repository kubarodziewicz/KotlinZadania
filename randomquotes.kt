package com.example.a7aplikacji

import kotlin.random.Random

object Quotes {
    val QuoteList = mutableListOf<String>("Success is not the key to happiness. Happiness is the key to success.", "The only way to do great work is to love what you do.", "In the end, we only regret the chances we didn’t take.", "The best way to predict the future is to create it.", "Life is 10% what happens to us and 90% how we react to it.", "You miss 100% of the shots you don’t take.", "Don’t wait for the perfect moment. Take the moment and make it perfect.", "Happiness is not something ready-made. It comes from your own actions.", "The harder you work for something, the greater you’ll feel when you achieve it.", "Believe you can and you're halfway there.")

    fun getRandomQuote() : String {
        return QuoteList[ Random.nextInt(0, QuoteList.size) ]
    }

    fun addQuote(newQuote : String) {
        QuoteList.add(newQuote)
        println("Added a quote '${newQuote}' ")
    }
}

fun main() {

    println( Quotes.getRandomQuote() )
    Quotes.addQuote("When life gives you lemons, make a lemonade.")
    println( Quotes.getRandomQuote() )
}