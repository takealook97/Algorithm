package algorithm01;

import java.util.Scanner;

public class Main1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (N <= K) {//N이 K보다 작을 경우엔 물병을 더 구매하지 않아도된다
            System.out.println(0);
            return;
        }
        int result = 0;
        while (true) {
            char[] bin = Integer.toBinaryString(N).toCharArray();
            int count = 0;
            for (int i = 0; i < bin.length; i++) {
                if (bin[i] == '1') {
                    count++;
                }
            }
            if (count <= K) {
                break;
            }
            N++;
            result++;
        }
        System.out.println(result);
    }
}
