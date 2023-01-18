public class LC7 {
    public int reverse(int x) {
        if(x < -Integer.MAX_VALUE){
            return 0;
        }
        boolean check = true;
        if (x < 0) {
            x = -x;
            check = false;
        } else if (x == 0) {
            return x;
        }
        String num = Integer.toString(x);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            sb.append(num.charAt(num.length() - i - 1));
        }
        long result = 0;
        if (check) {
            result = Long.parseLong(sb.toString());
        } else result = -Long.parseLong(sb.toString());
        if (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE) {
            return (int) result;
        } else return 0;
    }
}
