package step03.p06;

import java.util.LinkedList;

public class BiodomeFamily06 {
    public static void main(String[] args) {
        Animal a = new Animal("제니", "원숭이", 4);
        Animal b = new Animal("고먀", "코끼리", 4);
        Animal c = new Animal("타이", "호랑이", 9);
        Animal d = new Animal("로아", "코뿔소", 5);
        Animal e = new Animal("바비", "사슴", 7);

        LinkedList<Animal> animals = new LinkedList<>();
        animals.add(a);
        animals.add(b);
        animals.add(c);
        animals.add(d);
        animals.add(e);

        animalSort(animals);
    }

    public static void animalSort(LinkedList<Animal> list) {
        int i1 = findIndex(list, "호랑이");
        int i2 = findIndex(list, "사슴");
        int i3 = findIndex(list, "코끼리");

        if (i1 > i2) {
            Animal temp = list.remove(i2);
            list.addLast(temp);
        }

        if (list.get(i3).getAge() <= 5 && i1 > i3) {
            Animal temp = list.remove(i3);
            list.addLast(temp);
        }

        print(list);
    }

    public static int findIndex(LinkedList<Animal> list, String species) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSpecies().equals(species)) {
                return i;
            }
        }
        return -1;
    }

    public static void print(LinkedList<Animal> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            Animal a = list.get(i);
            System.out.print(a.getName() + "(" + a.getSpecies() + ", " + a.getAge() + "살)");

            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
