package week1.two_pointer;

public class Subsequence {
    public static void main(String[] args) {
        String s1 = "afgbsc";
        String s2 = "axc";
        System.out.println(isSubsequence(s1, s2));
    }

    private static boolean isSubsequence(String s1, String s2) {
        int p1 = 0, p2 = 0;

        while(p1 < s1.length() && p2 < s2.length()) {
            if (s1.charAt(p1) == s2.charAt(p2)) {
                p1++;
                p2++;
            }else {
                p1++;
            }
        }
        return s2.length() == p2;
    }
}
