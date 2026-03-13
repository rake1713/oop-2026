package Problem1.Partb;

public abstract class LibraryItem{
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String t, String a, int p){
        this.title=t;
        this.author=a;
        this.publicationYear=p;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Title: "+title+", Author: "+author+", Year: "+publicationYear;
    }
    
}