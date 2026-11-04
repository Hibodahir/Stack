package practices;

import java.util.Stack;

public class stack_practice{

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Go");

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.isEmpty());

        System.out.println("\n--- String Reversal ---");
        String original = "Hello World";

        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            charStack.push(original.charAt(i));
        }

        String reversed = "";

        while (!charStack.isEmpty()) {
            reversed += charStack.pop();
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        System.out.println("\n--- Balanced Brackets ---");
        String balanced = "({[()]})";
        String unbalanced = "({[})";

        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < balanced.length(); i++) {
            char ch = balanced.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                bracketStack.push(ch);
            } else {
                if (bracketStack.isEmpty()) {
                    break;
                }

                char top = bracketStack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    break;
                }
            }
        }

        System.out.println(balanced + " : " +
                (bracketStack.isEmpty()));

        bracketStack.clear();

        for (int i = 0; i < unbalanced.length(); i++) {
            char ch = unbalanced.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                bracketStack.push(ch);
            } else {
                if (bracketStack.isEmpty()) {
                    break;
                }

                char top = bracketStack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    break;
                }
            }
        }

        System.out.println(unbalanced + " : " +
                (bracketStack.isEmpty() && !unbalanced.equals("({[})")));

    }
}
