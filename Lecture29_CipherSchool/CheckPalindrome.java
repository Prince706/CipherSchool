package Lecture29_CipherSchool;

public class CheckPalindrome {
    static boolean checkPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "MADAM";
        String s2 = "CIPHER";
        System.out.println(checkPalindrome(s));
        System.out.println(checkPalindrome(s2));
    }
}