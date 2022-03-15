public class Book {
    private String title;
    private String pageNumber;
    private String publicationYear;
    
    public Book (String title, String pageNumber, String publicationYear) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getPageNumber() {
        return this.pageNumber;
    }
    
    public String getPublicationYear() {
        return this.publicationYear;
    }
    
    @Override
    public String toString() {
        return this.getTitle() + ", " + this.getPageNumber() + " pages, " + this.getPublicationYear();
   }
}
