package step01;

public class HelloBiodome07 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("염기서열이 입력되지 않았습니다.");
            return;
        }

        String s = String.join(" ", args).replaceAll(" ", "").toUpperCase();
        String result = zip(s);
        System.out.println(result);
    }

    public static String zip(String s) {
        String DNA = "CYJEH";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (DNA.indexOf(s.charAt(i)) == -1) {
                return "염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요";
            }
        }

        int n = 1;
        char current = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (current == s.charAt(i)) {
                ++n;
            } else {
                result += current + Integer.toString(n);
                current = s.charAt(i);
                n = 1;
            }
        }

        result += current + Integer.toString(n);
        return result;
    }
}
