public class Book {
    private String name;
    private String author;
    private int yearPublication;

    public Book (String name, String author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getAuthor() {
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
