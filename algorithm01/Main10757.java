package algorithm01;

import java.util.Scanner;

public class Main10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int standard = 0;
        if (a.length() >= b.length()) standard = a.length() + 1;
        else standard = b.length() + 1;

        int[] arrA = new int[standard];
        int[] arrB = new int[standard];
        for (int i = 0; i < a.length(); i++) {//a를 뒷자리부터 배열에 입력
            arrA[i] = a.charAt(a.length() - 1 - i) - '0';
        }
        for (int i = 0; i < b.length(); i++) {//b를 뒷자리부터 배열에 입력
            arrB[i] = b.charAt(b.length() - 1 - i) - '0';
        }

        int[] result = new int[standard];
        for (int i = 0; i < standard - 1; i++) {
            if (result[i] + arrA[i] + arrB[i] < 10) {
                result[i] = result[i] + arrA[i] + arrB[i];
            } else {
                result[i] = result[i] + arrA[i] + arrB[i] - 10;
                result[i + 1]++;
            }
        }
        if (result[standard - 1] == 0) {
            for (int i = standard - 2; i >= 0; i--) {
                System.out.print(result[i]);
            }
        } else {
            for (int i = standard - 1; i >= 0; i--) {
                System.out.print(result[i]);
            }
        }
    }
}
