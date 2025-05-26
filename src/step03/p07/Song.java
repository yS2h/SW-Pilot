package step03.p07;

public abstract class Song {
    private String title;
    private int time;
    private String artist;

    public Song(String title, int time, String artist) {
        this.title = title;
        this.time = time;
        this.artist = artist;
    }

    public abstract String getInfo();

    public String getTitle() {
        return title;
    }

    public int getTime() {
        return time;
    }

    public String getArtist() {
        return artist;
    }
}
