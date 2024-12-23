package c07_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            기본 예제
            n에 숫자를 입력 받아 몇 번 반복할지 정하고, 1부터 n까지 더하는 반복문을 작성하시오

            실행 예
            몇 번 반복할지 입려하세요 >>> 100
            합은 5050입니다.
         */
        Scanner scanner = new Scanner(System.in);
        // 변수 선언 및 초기화
        System.out.print("몇 번 반복할지 입력하세요 >>> ");
        int rst = 0;
        int n = scanner.nextInt();

        for (int i=0; i<n; i++){
            rst += i + 1;
        }
        System.out.println("합은 " + rst + "입니다.");

//        // 1번 풀이
//        int result1 = 0;
//        for (int i=0; i<n; i++){
//            result1 += i+1;
//        }
//        System.out.println("합은 " + result1 + "입니다.");
//
//        // 2번 풀이
//        int result2 = 0;
//        for (int i=0; i<n+1; i++){
//            result2 += i;
//        }
//        System.out.println("합은 " + result1 + "입니다.");
//
//        //3번 풀이
//        int result3 = 0;
//        for (int i=0; i<=n; i++){
//            result3 += i;
//        }
//        System.out.println("합은 " + result1 + "입니다.");


    }
}
