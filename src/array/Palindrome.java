package array;

public class Palindrome {

    public static void main(String[] args) {

        String word = "madam";
        System.out.println(isPalindrome(word));
        System.out.println(isPalindrome2(word));
    }

    private static boolean isPalindrome(String word) {
        char[] c = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            c[i] = word.charAt(word.length() - 1 - i);
        }
        return word.equals(new String(c));
    }

    private static boolean isPalindrome2(String word) {
        char[] c = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (c[start] != c[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}
