package c10_getter_setter;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    // 기본 생서자, 매개변수 생성자들 전부 만들어보세요.
    // PersonMain.java에서 해당 객체들을 만드세요
    // Person person1 = new Person();
    // Person person2 = new Person("여러분 이름");
    // Person person3 = new Person(-100);
    // Person person4 = new Person("사실 나는 사람이 아니다",1000);

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter 및 Getter 정의

    // 1. 외부에서 필드에 직접 접근을 하지 못하도록 접근지정자를 설정함

    // 2. Setter의 구조
    //      메서드에 매개변수가 필수적으로 요구됨 -> 값을 변경하거나 대입할 argumant가 필요하기 때문
    //      그리고 return값이 없음 -> void
    public void setName(String newName){
        this.name = newName;
    }

    // 3. Getter의 구조
    //      데이터를 조회만 하면 되기 때문에 매개변수가 요구되지 않음. 즉 () 형태로 마무리됨
    //      대신 필드와 동일 자료형의 return 값이 요구됨 -> void가 아니다.
    public String getName(){
        return name;        // name값을 반환한다는 의미
    }

    // setAge와 getAge을 정의하고

    public void setAge(int age){
        // method이기 떄문에 {}내부에 코드를 작성할 수 있음.
        // -> 이를 통해 데이터 유효성 검증을 위한 부분을 추가할 수 있음.
        // 조건문을 적용을 해서 0 이상의 값만 입력이 가능하게끔 코드를 작성하면 됩니다.
        // 시작하세요
        // 다 하신 분들은 150 미만의 값만 입력되게 끔 코드를 추가해주세요
//        if (age >= 0){
//            // 중첩 if문 사용
//            if (age < 150){
//                this.age = age;
//            } else{
//                System.out.println("다시 입력하세요.");
//            }
//        } else {
//            System.out.println("다시 입력하세요.");
//        }

        // 중첩 if문을 줄이기 위한 && 연산자 사용
        // -> 여기에 while문을 붙여서 올바른 값만 입력하세끔 코드를 작성하시오.
//            if (age >= 0 && age < 150) {
//                this.age = age;
//            } else {
//                System.out.println("다시 입력하세요");
//            }

        // 메서드 내에서 사용할 클래스를 import
        Scanner scanner = new Scanner(System.in);
//        age >= 0 && age < 150 범위의 반대는 어떻게 될까? -> 값이 잘못됐을때
        // 반복문이 실행돼야 하므로 반대 범위를 산출해냈음.
        while (age < 0 || age >= 150){
            System.out.print("나이는 0이상 150 미만이어야 합니다. 다시 입력하세요 >>> ");
            age = scanner.nextInt();    // argument로 age를 받았지만 , 값이
                                        // 적절하지 않기 때문에 재 입력을 받아서
                                        // age에 '재'대입하는 과정이 필요
        }
        System.out.println("나이가 정상적으로 업데이트 되었습니다.");
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
