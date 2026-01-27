package strings;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reversed("rahul"));
    }

    private static String reversed(String s) {
        char[] charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

}
