import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;

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
        for (int i = input1.length() - 1; i >= 0; i--) {
            reversed = reversed + input1.charAt(i);
        }
        boolean issPalindrome = input1.equals(reversed);
        System.out.println("Input text: " + input1);
        System.out.println("Is it a Palindrome?: " + issPalindrome);


        //Usecase4
        String input3 = "radar";
        char[] chars = input3.toCharArray();
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

        for (char c : input4.toCharArray()) {
            stack.push(c);
        }

        boolean is2Palindrome = true;
        for (char c : input4.toCharArray()) {
            if (c != stack.pop()) {
                is2Palindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input4);
        System.out.println("Is Palindrome? : " + is2Palindrome);


        //UseCase6
        String input5 = "civic";

        Stack<Character> stack2 = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : input5.toCharArray()) {
            stack2.push(c);
            queue.add(c);
        }

        boolean is3Palindrome = true;
        for (int i = 0; i < input5.length(); i++) {
            if (stack2.pop() != queue.remove()) {
                is3Palindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input5);
        System.out.println("Is Palindrome? : " + is3Palindrome);


        //UseCase7
        String text = "refer";
        Deque<Character> dq = new LinkedList<>();

        for (char ch : text.toCharArray()) {
            dq.addLast(ch);
        }

        boolean result = true;

        while (dq.size() > 1) {
            char frontChar = dq.removeFirst();
            char rearChar = dq.removeLast();

            if (frontChar != rearChar) {
                result = false;
                break;
            }
        }

        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);


        //UseCase8
        String input6 = "level";

        class Node {
            char data;
            Node next;

            Node(char data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;

        for (char c : input6.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node firstHalf = head;
        Node secondHalf = prev;

        boolean is4Palindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                is4Palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        System.out.println("Input : " + input6);
        System.out.println("Is Palindrome? : " + is4Palindrome);


        //UseCase9 (Recursion)
        String input7 = "madam";

        boolean is5Palindrome = isPalindromeRecursive(input7, 0, input7.length() - 1);

        System.out.println("Input : " + input7);
        System.out.println("Is Palindrome? : " + is5Palindrome);

    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}