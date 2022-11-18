import java.util.Stack;

public class Bai2 {
    public static void main(String[] args) {
        String test = "())()";

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < test.length(); i++) {
            if(test.charAt(i) == '(') {
                stack.push('(');
            } else if(test.charAt(i) == ')') {
                if(stack.size() > 0 && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(')');
                }
            }
        }

        if(stack.size() == 0) {
            System.out.println("Dung");
        } else {
            System.out.println("Sai");
        }
    }
}
