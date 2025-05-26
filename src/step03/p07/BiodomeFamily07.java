package step03.p07;

public class BiodomeFamily07 {
    public static void main(String[] args) {
        MusicLibrary ml = new MusicLibrary();
        Player p = new Player(ml);
        AnimalSong a = new AnimalSong("초원을 그리며", 2, "레이나", "사슴");
        AnimalSong b = new AnimalSong("영웅 호테", 1, "돈키", "당나귀");
        AnimalSong c = new AnimalSong("과자를 줄게", 3, "제롬", "코끼리");
        ManagerSong d = new ManagerSong("화양연화", 2, "장양림", "재즈");
        ManagerSong e = new ManagerSong("시간의 수평선", 4, "하윤", "팝");

        ml.addSong(a);
        ml.addSong(b);
        ml.addSong(c);
        ml.addSong(d);
        ml.addSong(e);

        p.play(d);
        p.setVolume(30);
        p.setVolume(5);
        p.play(b);
        ml.removeSong("시간의 수평선");
        ml.searchByTitle("시간의 수평선");

        ml.randomPlay();
    }
}
