package step03;

import java.util.LinkedList;

public class BiodomeFamily06 {
    public static void main(String[] args) {
        Animals a = new Animals("제니", "원숭이", 4);
        Animals b = new Animals("고먀", "코끼리", 4);
        Animals c = new Animals("타이", "호랑이", 9);
        Animals d = new Animals("로아", "코뿔소", 5);
        Animals e = new Animals("바비", "사슴", 7);

        LinkedList<Animals> animals = new LinkedList<>();
        animals.add(a);
        animals.add(b);
        animals.add(c);
        animals.add(d);
        animals.add(e);

        animalSort(animals);
    }

    public static void animalSort(LinkedList<Animals> list) {
        int i1 = findIndex(list, "호랑이");
        int i2 = findIndex(list, "사슴");
        int i3 = findIndex(list, "코끼리");

        if (i1 > i2) {
            Animals temp = list.remove(i2);
            list.addLast(temp);
        }

        if (list.get(i3).getAge() <= 5 && i1 > i3) {
            Animals temp = list.remove(i3);
            list.addLast(temp);
        }

        print(list);
    }

    public static int findIndex(LinkedList<Animals> list, String species) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSpecies().equals(species)) {
                return i;
            }
        }
        return -1;
    }

    public static void print(LinkedList<Animals> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            Animals a = list.get(i);
            System.out.print(a.getName() + "(" + a.getSpecies() + ", " + a.getAge() + "살)");

            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
