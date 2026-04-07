public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, String librettoText, String musicAuthor) {
        super(title, duration, director);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
