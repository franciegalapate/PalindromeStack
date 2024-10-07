import java.util.*;

/**
 * Galapate, Francie Gabrielle A.
 * 7 October 2024
 * CS211 9344 Midterm Individual Exercise Palindrome
 *
 * Algorithm:
     * User enter a string
     * Program iterates input string
     * Adds each character of the input string to the stack using push()
     * Removes each character of the input string to the stack using pop() until the stack is empty
     * Compares the push() character and pop() character of the input string using a for loop to check if they're the same
 *
 * Output:
     * Test 1:
     * This application helps you evaluate if a string is a palindrome or not.
     * Please enter string: abbbdcdbbba
     * abbbdcdbbba is a palindrome.
 *
     * Test 2:
     * This application helps you evaluate if a string is a palindrome or not.
     * Please enter string: mirrorrorrim
     * mirrorrorrim is a palindrome.
 *
     * Test 3:
     * This application helps you evaluate if a string is a palindrome or not.
     * Please enter string: naSabAyaBasaN
     * naSabAyaBasaN is a palindrome.
 *
     * Test 4:
     * This application helps you evaluate if a string is a palindrome or not.
     * Please enter string: abccba
     * abccba is a palindrome.
 *
     * Test 5:
     * This application helps you evaluate if a string is a palindrome or not.
     * Please enter string: abcdef
     * abcdef is a palindrome.
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        PalindromeChecker myProgram;
        try {
            myProgram = new PalindromeChecker();
            myProgram.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public void run() throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("This application helps you evaluate if a string is a palindrome or not.");
        System.out.println("Please enter string: ");
        String input = s.nextLine();

        if (isPalindrome(input) == true) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public boolean isPalindrome(String string) throws StackUnderflowException {
        MyStack<Character> stack = new MyStack<>();
        int index = 0;
        Character topSymbol = null;

        while (index < string.length()/2) {
            stack.push(string.charAt(index));
            index += 1;
        }

        if (string.length()%2 != 0) {
            index += 1;
        }

        for (; index < string.length(); index++) {
            topSymbol = stack.pop();
            if (Character.toLowerCase(topSymbol.charValue()) != string.toLowerCase().charAt(index)) {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
