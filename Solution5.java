
import java.util.Stack;

public class Solution5 {

    public static String reverseString(String input) {

        char[] chars = input.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char ch : chars) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "hello"; 
        String output = reverseString(input); 
        System.out.println("Reversed string: " + output);
    }
}
