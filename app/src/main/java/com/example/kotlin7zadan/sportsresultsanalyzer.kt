package com.example.kotlin7zadan

class Analyzer {
    companion object {
        var teamMatches: Map<String, Int> = mutableMapOf(
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

        fun addMatch(userMatchName: String, userMatchPoints: Int) {
            teamMatches += userMatchName to userMatchPoints
        }
    }
}

fun main() {
    println(Analyzer.teamMatches)
}