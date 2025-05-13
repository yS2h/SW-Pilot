package step02;

import java.util.ArrayList;

public class RoadToBiodome02 {
    public static void main(String[] args) {
        String input = String.join(" ", args);

        if (input.isEmpty()) {
            System.out.println("입력된 메시지가 올바르지 않습니다. 다시 한번 확인해주세요.");
            return;
        }

        Stack s = new Stack();

        for (int i = 0; i < input.length(); i++) {
            s.push(input.charAt(i));
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }

    static class Stack {
        private final ArrayList<Character> stack = new ArrayList<>();

        public void push(char c) {
            stack.add(c);
        }

        public char pop() {
            if (isEmpty()) {
                return '\0';
            }
            return stack.remove(stack.size() - 1);
        }

        public char peek() {
            if (isEmpty()) {
                return '\0';
            }
            return stack.get(stack.size() - 1);
        }

        public boolean isEmpty() {
            return (stack.size() == 0);
        }
    }
}
