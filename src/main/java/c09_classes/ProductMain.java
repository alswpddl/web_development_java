package c09_classes;
/*
    1. 기본 생성자 사용

    해당 제품의 시리얼 넘버는 147258이고,
    제품명은 LG제이패드입니다.

    2. 시리얼넘버 사용한 객체 생성

    해당 제품의 시리얼 넘버는 987654이고,
    제품명은 GS충전기입니다.

    3. 제품명을 사용한 객체 생성

    해당 제품의 시리얼 넘버는 159357이고,
    제품명은 피치패드입니다.

    4. 시리얼 넘버 및 제품명을 사용한 객체 생성

    해당 제품의 시리얼 넘버는 4862이고,
    제품명은 블루미플립6입니다.
 */
public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();   -> 이제는 new 클래스명에서 '클래스명()'이 생성자라는 사실을 우리는 압니다.
        // 1번 지시 사항 - 기본 생성자 사용
        Product product01 = new Product();
        // 시본 생성자를 사용했다는 말은 객체 생성 시 속성에 아무런 값을 대입하지 않았다는 의미이므로
        // 추가적인 코드 작성을 통해 속성에 값으 대입해야만 함.
        // 예시를 위한 product1.showInfo() 메서드 확인
        product01.showInfo();
        product01.productNum=147258;
        product01.productName="LG제이페드";

        // 2번 지시 사항 - 기본 시리얼 넘버 매개변수 생성자-1 사용
        Product product02 = new Product(987654);
        product02.showInfo();
        product02.productName="GS충전기";

        // 3번 지시 사항 - 제품명 매개변수 생성자-2 사용
        Product product03 = new Product("피치패드");
        product03.showInfo();
        product03.productNum=159357;

        // 4번 지시 사항 - 시리얼 넘버 및 제품명 매개변수-3 생성자 사용
        Product product04 = new Product(4862,"블루미플립");
        product04.showInfo();
    }
}
