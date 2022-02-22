
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        Book bookObject = (Book) obj;
        
        if (this.name.equals(bookObject.name) && this.publicationYear == bookObject.publicationYear) {
            return true;
        }
        return false;
    }
}
