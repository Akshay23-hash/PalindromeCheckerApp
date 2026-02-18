import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        //Usecase2

        String input = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);

        //UseCase3
        String input1 = "malayalam";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        boolean issPalindrome = input.equals(reversed);
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + issPalindrome);

        //Usecase4

        String input3 = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean is1Palindrome = true;
        while (start < end) {
            if (chars[start] != chars[end]) {
                is1Palindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input : " + input3);
        System.out.println("Is Palindrome? : " + is1Palindrome);

        //UseCase5
        String input4 = "noon";
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean is2Palindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                is2Palindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input4);
        System.out.println("Is Palindrome? : " + is2Palindrome);
    }
}





