package step02;

import java.util.ArrayList;

public class RoadToBiodome05 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        boolean TF = true;

        try {
            for (String s : args) {
                String str = s.replace("[", "").replace(",", "").replace("]", "");
                int n = Integer.parseInt(str);

                if (n < 0 || n > 100) {
                    System.out.println("잘못된 입력입니다. 1~100 사이의 숫자를 입력하세요");
                    return;
                }

                if (TF) {
                    arr1.add(n);
                } else {
                    arr2.add(n);
                }

                if (s.contains("]")) {
                    TF = false;
                }
            }

            int[] merge = new int[arr1.size() + arr2.size()];

            for (int i = 0; i < arr1.size(); i++) {
                merge[i] = arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                merge[arr1.size() + i] = arr2.get(i);
            }

            quickSort(merge, 0, merge.length - 1);

            System.out.print("[");
            for (int i = 0; i < merge.length; i++) {
                System.out.print(merge[i]);
                if (i != merge.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");

        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 1~100 사이의 숫자를 입력하세요");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int index = partition(arr, start, end);

        quickSort(arr, start, index - 1);
        quickSort(arr, index, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return start;
    }
}
