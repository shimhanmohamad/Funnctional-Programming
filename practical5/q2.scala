case class Book(title: String, author: String, isbn: String)

object Library {
    var books: Set[Book] = Set(
        Book("Harry Potter", "J.K. Rowling", "9780316769488"),
        Book("Ghost", "Harper Lee", "9780061120084"),
        Book("1984", "George Orwell", "9780451524935"),
        Book("Panda", "Harper Lee", "0987654345678")
    )

    def addBook(book: Book): Unit = {
        books += book
        println(s"Book added: ${book.title}")
    }
    
    def removeBook(isbn: String): Unit = {
        val bookToRemove = books.find(_.isbn == isbn)
        bookToRemove match {
            case Some(book) =>
                books -= book
                println(s"Book removed: ${book.title}")
            case None =>
                println("Book not found.")
        }
    }
    
    def displayBooks(books: Set[Book]): Unit = {
        for (book <- books) {
            println(s"${book.title}, ${book.author}, ${book.isbn}")
        }
    }

    def searchBook(title: String): Unit = {
        val foundBooks = books.filter(_.title.equalsIgnoreCase(title))
        if (foundBooks.isEmpty) {
            println(s"No books found with title: $title")
        } else {
            println(s"Books found with title '$title':")
            for (book <- foundBooks) {
                println(s"Author: ${book.author}, ISBN: ${book.isbn}")
            }
        }
    }

    def displayBooksByAuthor(author: String): Unit = {
        val booksByAuthor = books.filter(_.author.equalsIgnoreCase(author))
        if (booksByAuthor.isEmpty) {
            println(s"No books found by author: $author")
        } else {
            println(s"Books by $author:")
            for (book <- booksByAuthor) {
                println(s"Title: ${book.title}, ISBN: ${book.isbn}")
            }
        }
    }
}

object q2 extends App {
    println("Initial Library Collection:")
    Library.displayBooks(Library.books)

    println("***********************************************************")
    val newBook = Book("Brave New World", "Aldous Huxley", "9780060850524")
    Library.addBook(newBook)

     println("***********************************************************")
    Library.removeBook("9780316769488")

     println("***********************************************************")
    val isbnToCheck = "9780451524935"
    println(s"Is book with ISBN $isbnToCheck in the library? ${Library.books.exists(_.isbn == isbnToCheck)}")

     println("***********************************************************")
    println("Updated Library Collection:")
    Library.displayBooks(Library.books)

    println("***********************************************************")
    val titleToSearch = "1984"
    Library.searchBook(titleToSearch)

     println("***********************************************************")
    val authorToSearch = "Harper Lee"
    Library.displayBooksByAuthor(authorToSearch)
}
