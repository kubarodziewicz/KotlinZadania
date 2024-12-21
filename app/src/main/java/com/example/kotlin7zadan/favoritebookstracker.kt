package com.example.kotlin7zadan

data class Book(val title: String, val author: String, val year: Int) {
    override fun toString(): String {
        return "title: ${title}, author: ${author}, year: ${year}"
    }
}

fun main() {
    val books = listOf(
        Book("The Midnight Library", "Matt Haig", 2020),
        Book("Where the Crawdads Sing", "Delia Owens", 2018),
        Book("Dune", "Frank Herbert", 1965),
        Book("1984", "George Orwell", 1949),
        Book("To Kill a Mockingbird", "Harper Lee", 1960),
        Book("The Alchemist", "Paulo Coelho", 1988),
        Book("The Catcher in the Rye", "J.D. Salinger", 1951),
        Book("Brave New World", "Aldous Huxley", 1932),
        Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2011),
        Book("Atomic Habits", "James Clear", 2018)
    )

    val sortedBooks = books.sortedBy {it.title}
    val showSortedBooks = sortedBooks.forEach{book -> println(book)}


    val showBooks = books.forEach{book -> println(book)}

}

