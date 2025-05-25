package step03;

public class Player {
    MusicLibrary library;
    private Song songInfo;
    private int volume = 1;

    public Player(MusicLibrary library) {
        this.library = library;
    }

    public void play(Song song) {
        if (library.searchByTitle(song.getTitle()) == null) {
            System.out.println("재생 리스트에 음악이 없습니다.");
        } else {
            songInfo = song;
            if (songInfo instanceof AnimalSong && volume > 5)
                setVolume(volume - 5);
            System.out.println(song.getInfo() + " 재생합니다.");
        }
    }

    public void stop(Song song) {
        System.out.println(song.getInfo() + " 일시정지합니다.");
    }

    public void setVolume(int v) {
        if (songInfo instanceof AnimalSong && (v < 0 || v > 5)) {
            System.out.println("동물을 위한 볼륨은 0~5로 설정해 주세요.");
        } else if (songInfo instanceof ManagerSong && (v < 0 || v > 50)) {
            System.out.println("사람을 위한 볼륨은 0~50으로 설정해 주세요.");
        } else {
            volume = v;
            System.out.println("볼륨을 " + v + "로 설정합니다.");
        }
    }
}
