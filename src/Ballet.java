public class Ballet extends MusicalShow{
    private String choreographer;

    public Ballet(String title, int duration, Director director, String librettoText, String musicAuthor, String choreographer) {
        super(title, duration, director, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }
}
