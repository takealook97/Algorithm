package algorithm02;

public class LC9 {
    public boolean isPalindrome(int x) {
        boolean check = true;
        String num = Integer.toString(x);
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                check = false;
                break;
            }
        }
        return check;
    }
}