package com.example.kotlin7zadan

class Analyzer {
    companion object {
        var teamMatches: Map<String, Int> = mutableMapOf( // mapa przedstawia wyniki meczow wraz z punktami, dziala jak slownik
            "match1" to 3,
            "match2" to 7,
            "match3" to 4,
            "match4" to 8,
            "match5" to 2,
            "match6" to 5,
            "match7" to 9,
            "match8" to 6,
            "match9" to 1,
            "match10" to 10
        )

        fun displayMatchResults() {
            for((key,value) in teamMatches) { // uzyskiwanie dostepu do wlasciwosci mapy poprzez key i value
                println("$key, points: $value")
            }
        }

        fun addMatch(userMatchName: String, userMatchPoints: Int) { // metoda do dodawania meczow
            teamMatches += userMatchName to userMatchPoints
        }

        fun filterMatchResultsByScore(matchScore: Int) {
            val filteredMatchResults = teamMatches.filter { it.value > matchScore } // .value odnosi sie do pierwszej wlasciwosci mapy
            for((key,value) in filteredMatchResults) {
                println("$key, points: $value")
            }
        }

        fun addBonusPoints(matchName: List<String>) { // uzytkownik podaje ktorym meczom chce zmienic punkty, jest to przekazane jako lista w parametrze
            val updatedMatches = teamMatches.mapValues { // mapValues zachowuje mape zamiast przeksztalcac ja
                if (it.key in matchName) it.value + 1 else it.value // jezeli wartosc z matchName znajduje sie w liscie teamMatches to zwieksz wartosc o 1, jezeli nie, zwroc pierwotna wartosc
            }
            updatedMatches.forEach { // wypisywanie wartosci
                (key, value) -> println("$key, points: $value")
            }
        }
    }
}

fun main() {
    Analyzer.displayMatchResults()
    Analyzer.addBonusPoints(listOf("match1","match2")) // lista jest podana jako parametr funkcji wiec trzeba ja zdefiniowac
}