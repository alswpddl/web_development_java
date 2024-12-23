package c10_getter_setter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("최민제");
        Person person3 = new Person(-100);
        Person person4 = new Person("사실 나는 사람이 아니다",1000);

        // 접근 지정자 private 코드 삽입 훙는 오류가 발생하기 때문에 주석 처리했습니다.
//        System.out.println(person4.name);
//        System.out.println(person4.age);

//        person4.name = "사실은 동물이다."    -> 이상을 이유로 name 필드에 직접 접근을 하여 값을 변경하는 것도 불가능
        System.out.println(person4.getName());

        // person3의 age를 20으로 변경하고,
        // person4의 name을 김사, age를 30으로 변경한 후, 바뀐 필드들만 콘솔에 출력하시오.

        person3.setAge(20);
        System.out.println(person3.getAge());
        person4.setName("김삼");
        person4.setAge(30);
        System.out.println(person4.getName());
        System.out.println(person4.getAge());

        Person person5 = new Person("김사");
        person5.setAge(150);
    }
}
