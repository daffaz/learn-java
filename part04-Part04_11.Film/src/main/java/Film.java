public class Film {
    private final String name;
    private final int ageRating;
    
    public Film(String filmName, int filmRating) {
        this.name = filmName;
        this.ageRating = filmRating;
    }
    
    public String name() {
        return this.name;
    }
    
    public int ageRating() {
        return this.ageRating;
    }
}
