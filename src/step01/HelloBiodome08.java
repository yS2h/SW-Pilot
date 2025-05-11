package step01;

import java.util.*;

public class HelloBiodome08 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(args[0]);
        String[] dict = {"hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please", "need", "we", "isn’t", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can", "?"};
        Arrays.sort(dict, (d1, d2) -> d2.length() - d1.length());

        List<Integer> list = isContain(dict, s);
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            int idx = list.get(i);
            if (idx < s.length() && s.charAt(idx) != '?') {
                s.insert(idx, " ");
            }
        }

        if (!s.toString().endsWith("?")) {
            s.append(".");
        }

        System.out.println(s);
    }

    public static List<Integer> isContain(String[] dict, StringBuilder s) {
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[s.length()];

        for (String w : dict) {
            int i = 0;
            while (i <= s.length() - w.length()) {
                int idx = s.indexOf(w, i);
                if (idx == -1) {
                    break;
                }
                int end = idx + w.length();
                
                boolean skip = false;

                for (int j = idx; j < end; j++) {
                    if (used[j]) {
                        skip = true;
                        break;
                    }
                }

                if (!skip) {
                    for (int j = idx; j < end; j++) {
                        used[j] = true;
                    }
                    list.add(end);
                }
                i = idx + 1;
            }
        }
        return list;
    }
}

