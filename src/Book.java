public class Book {
    private String name;
    private Author author;
    private int yearPublication;

    public Book (String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication (int yearPublic) {
        this.yearPublication = yearPublic;
    }
}
