package step02;

public class RoadToBiodome04 {
    public static void main(String[] args) {
        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        // 선택 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        System.out.println("평균값 : " + AVG(arr) + ", " + "중앙값 : " + MED(arr));
    }

    public static double AVG(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static double MED(int[] arr) {
        int mid = arr.length / 2;
        if (arr.length % 2 == 1) {
            return arr[mid];
        } else {
            return (arr[mid - 1] + arr[mid]) / 2.0;
        }
    }
}
