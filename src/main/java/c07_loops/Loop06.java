package c07_loops;

import java.util.Scanner;

public class Loop06 {
    public static void main(String[] args) {
        /*
                *
               **
              ***
             ****
            *****

            실행문1 이 요구되는 패턴
         */

        for (int i=0; i<5; i++){
            // 공백 영역 + 별의 개수 = 5로 고정이 되어야 함.
            // 공백이 먼저 나오기 때문에 공백을 처리하는 반복문이 먼저 작성돼야 함.
            for (int j=4; j>i; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<i+1; k++) {
                System.out.print("*");
            }
            // 개행이 일어나는 실행문ㅊ
            System.out.println();
        }

    }
}
