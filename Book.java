public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private String genre;
    private boolean availabilityStatus;

    public Book(String title, String author, String ISBN, int publicationYear, String genre, boolean availabilityStatus) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nISBN: %s\nPublication Year: %d\nGenre: %s\nAvailable: %s\n",
                title, author, ISBN, publicationYear, genre, availabilityStatus ? "Yes" : "No");
    }
}