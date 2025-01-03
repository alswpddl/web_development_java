package c12_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayLotto {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lottoNumbers = new int[6];
        int count = 5;
        boolean duplicate = false;
        int number = 0;

        String logo = """
                 ___       ________  _________  _________  ________    \s
                |\\  \\     |\\   __  \\|\\___   ___\\\\___   ___\\\\   __  \\   \s
                \\ \\  \\    \\ \\  \\|\\  \\|___ \\  \\_\\|___ \\  \\_\\ \\  \\|\\  \\  \s
                 \\ \\  \\    \\ \\  \\\\\\  \\   \\ \\  \\     \\ \\  \\ \\ \\  \\\\\\  \\ \s
                  \\ \\  \\____\\ \\  \\\\\\  \\   \\ \\  \\     \\ \\  \\ \\ \\  \\\\\\  \\\s
                   \\ \\_______\\ \\_______\\   \\ \\__\\     \\ \\__\\ \\ \\_______\\
                    \\|_______|\\|_______|    \\|__|      \\|__|  \\|_______|
                """;

        System.out.println(logo);
        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");
        System.out.println("이번 로또 추천 번호는 다음과 같습니다.");

        while (count > 0){
            // 일단 1 게임을 완성하는 코드
            for (int i=0; i<lottoNumbers.length; i++){
                // 반복문이 돌 때마다 duplicate = false로 초기화를 시켜줘야 할거 같음.
                duplicate = false;
                // 배열에 값을 대입하기 전에 임시 변수인 number에 대입 후 중복 확인하고
                // 중복되지 않는다면 이후에 lottoNumbers 배열에 데이터 대입
                number = random.nextInt(45)+1;
                for (int j=0; j<i; j++){    // 한계값 j<lottoNumbers.length를 사용하지 않았습니다.
                    if(lottoNumbers[i] == number){
                        duplicate = true;
                    }
                }

                // 중복이 되지 않으면 if 부분이 실행돼서 배열에 값을 대입
                // 중복이 된다는 else 부분이 실행됨 -> 이 경우 다시 한 번 random.nextInt()를 실행해야 하기 때문에
                // i를 하나 감해줬습니다.
                if (!duplicate){
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
            count--;
        }


    }
}
