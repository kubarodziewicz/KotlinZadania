package com.example.kotlin7zadan

data class Book(val title: String, val author: String, val year: Int) {
    override fun toString(): String {
        return "title: ${title}, author: ${author}, year: ${year}"
    }
}

val books = mutableListOf<Book>(
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

fun filterBook() {
    println("Select what you want to sort by: ")
    val filterOption = readln()

    println("Choose value of your sorting: ")
    val filterOptionValue = readln()

    when (filterOption) {
        "author" -> {
            val filtering = books.filter { book -> book.author == filterOptionValue }
            filtering.forEach{book -> println(book)}
        }
        "year" -> {
            val filtering = books.filter { book -> book.year == filterOptionValue.toInt() }
            filtering.forEach{book -> println(book)}
        }
        else -> {
            print("Something went wrong")
        }
    }

}

fun addBook(list: MutableList<Book>) {
    println("enter title: ")
    val title = readln()

    println("enter author: ")
    val author = readln()

    println("enter year: ")
    val year = readln().toInt()

    list.add(Book(title, author, year))
}

fun manageBooks(userFunction: Int) {
        when(userFunction) {
            1 -> books.forEach { book -> println(book) }
            2 -> sortedBooks.forEach { book -> println(book) }
            3 -> addBook(books)
            4 -> filterBook()

    }

}


fun main() {
    var cos = false

    while(!cos) {
        println("Select your action \n 1: show books \n 2: show books sorted by title \n 3: add a new title\n 4: show books by filtering\n 0: end program\n")
        val option = readln().toInt()
        manageBooks(option)

        if (option == 0) {
            cos = true
        }
    }


}

