package two_pointer;

public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal – Panama!";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s){
        int p1 = 0, p2 = s.length() - 1;

        while (p1 < p2) {
            char c1 = s.charAt(p1);
            char c2 = s.charAt(p2);
            if (!Character.isLetterOrDigit(c1)) {
                p1++;
            }
            else if (!Character.isLetterOrDigit(c2)) {
                p2--;
            }
            else if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
            else {
                // Characters match, move both pointers
                p1++;
                p2--;
            }
        }
        return true;
    }
}
