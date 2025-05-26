package step03.p07;

import java.util.ArrayList;
import java.util.Collections;

public class MusicLibrary {
    ArrayList<Song> songList = new ArrayList<>();

    public void addSong(Song song) {
        if (!songList.contains(song)) {
            songList.add(song);
            System.out.println("새로운 노래 " + song.getInfo() + " 추가되었습니다.");
        } else {
            System.out.println("같은 노래가 존재합니다.");
        }
    }

    public void removeSong(String title) {
        for (int i = 0; i < songList.size(); i++) {
            Song s = songList.get(i);
            if (s.getTitle().equals(title)) {
                songList.remove(s);
                System.out.println("노래 " + s.getInfo() + " 삭제되었습니다.");
            }
        }
    }

    // 동물을 위한 모든 음악 조회하기
    public ArrayList<Song> getAnimalSongList() {
        ArrayList<Song> result = new ArrayList<>();
        for (Song s : songList) {
            if (s instanceof AnimalSong) result.add(s);
        }
        return result;
    }

    // 조건으로 검색 - 제목
    public Song searchByTitle(String title) {
        for (int i = 0; i < songList.size(); i++) {
            Song s = songList.get(i);
            if (s.getTitle().equals(title)) {
                return s;
            }
        }
        System.out.println("\"" + title + "\" 노래가 존재하지 않습니다.");
        return null;
    }


    public void randomPlay() {
        Collections.shuffle(songList);
        System.out.println("랜덤 재생 플리!!");
        for (Song s : songList) {
            System.out.println(" - " + s.getInfo());
        }
    }
}
