package step04.p05;

public class PlantHashMap<K, V> {
    static final int size = 16;
    Entry<K, V>[] map;

    public PlantHashMap() {
        map = new Entry[size];
    }

    public void put(K key, V value) {
        int idx = getIndex(key);
        map[idx] = new Entry<>(key, value);
        System.out.println("'" + key + "' 추가: '" + value + "'");
    }

    public V get(K key) {
        int idx = getIndex(key);
        V result = map[idx].value;
        System.out.println("'" + key + "' 검색: '" + result + "'");
        return result;
    }

    public void remove(K key) {
        int idx = getIndex(key);
        map[idx] = null;
        System.out.println("'" + key + "' 삭제: '" + key + "' 와 그 특징이 삭제되었습니다.");
    }

    public void printIndex(K key) {
        System.out.println("'" + key + "' 인덱스: " + getIndex(key));
    }

    public int getIndex(K key) {
        return key.hashCode() % size;
    }

    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
