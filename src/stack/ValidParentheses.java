package stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String str1 = "{[([])]}";
        String str2 = "{[()}";
        System.out.println(isValidParentheses(str1));
        System.out.println(isValidParentheses(str2));
    }

    private static boolean isValidParentheses(String str) {
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(')
                stack.push(str.charAt(i));
            if (str.charAt(i) == ')' && stack.peek().equals('(')
                    || str.charAt(i) == '}' && stack.peek().equals('{')
                    || str.charAt(i) == ']' && stack.peek().equals('[')
            )
                stack.pop();
        }
        return stack.length == 0;
    }
}
