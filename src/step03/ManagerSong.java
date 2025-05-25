package step03;

public class ManagerSong extends Song {
    private String genre;

    public ManagerSong(String title, int time, String artist, String genre) {
        super(title, time, artist);
        this.genre = genre;
    }

    @Override
    public String getInfo() {
        return "\"" + getTitle() + ", " + getTime() + "분, " + getArtist() + ", " + genre + "\"";
    }
}
