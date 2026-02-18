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
        String input1 = "madam";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        boolean issPalindrome = input.equals(reversed);
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + issPalindrome);
    }
}




