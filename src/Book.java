import java.util.Objects;

public class Book {
    private int year;
    private String bookTitle;
    private Author author;

    public Book(int year, String bookTitle, Author author) {
        this.year = year;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return getBookTitle() + author.toString() + " " + getYear() + " года";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(year, bookTitle, author);
    }
}
