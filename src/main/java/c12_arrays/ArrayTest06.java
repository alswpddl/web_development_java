package c12_arrays;

public class ArrayTest06 {
    public static void main(String[] args) {
        // 빈 배열 선언
        int[][] arr = new int[5][5];

        // 사용할 변수 선언
        int num = 0;

        // 1부터 25까지의 숫자를 arr 배열에 순서대로 값을 넣으시오.
//        [
//            [1,2,3,4,5],
//            [6,7,8,9,10],
//            [11,12,13,14,15],
//            [16,17,18,19,20],
//            [21,22,23,24,25],
//        ]

        // 다 하신 분들은 방금 입력한 값을 출력할 때
        /*
            방금 집어넣은 데이터 값을 출력할 때
                1 2 3 4 5
                6 7 8 9 10
                11 12 13 14 15
                16 17 18 19 20
                21 22 23 24 25

            형태로 출력해보시오
         */

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = ++num;
            }
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
