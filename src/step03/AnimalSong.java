package step03;

public class AnimalSong extends Song {
    private String animalType;

    public AnimalSong(String title, int time, String artist, String animalType) {
        super(title, time, artist);
        this.animalType = animalType;
    }

    @Override
    public String getInfo() {
        return "\"" + getTitle() + ", " + getTime() + "분, " + getArtist() + ", " + animalType + "\"";
    }
}
