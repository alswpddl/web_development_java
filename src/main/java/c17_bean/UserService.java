package c17_bean;
// 서비스 객체(비지니스 로직)
public class UserService {
     /*
        기능
            메서드들의 집합

        Entity 클래스 : 주로 데이터베이스 테이블(표)과 매핑(매칭)되는 클래스
        일반적으로 애플리케이션 데이터 모델을 정의하며, 데이터베이스와의 상호작용을 위해 사용됨 -> DBMS

        주요 특징
        데이터베이스 테이블 매핑 : Entity 클래스는 데이터베이스 테이블의 구조와 일치
            -> 지난 시간에 +----------------+ 이 형태로 그렸던 표와 관련있습니다.
        필드와 컬럼 매핑 : 클래스의 필드는 데이터베이스 테이블의 컬럼과 매핑됩니다.(마찬가지로 지난 시간 수업)
        식별자 : @Id 애너테이션을 사용하여 기본 키(prime key)를 지정합니다 -> Spring 관련 PK
        애너테이션 사용 : @Entity, @Table, @Column 등의 애너테이션 사용 -> Lombok과 관련

        Service 클래스 : 비지니스 로직을 구현하는 클래스. 이 클래스는 애플리케이션의 비지니스 규칙을 처리
            데이터의 변환, 검증, 처리 등을 수행           -> 중복 체크 / 비밀번호 확인 등
            보통 Repository 클래스를 사용하여 데이터베이스와 상호작용함.

        비지니스 클래스 = 서비스 클래스
            보통 도메인을 캡슐화하고, 특정 비지니스 규칙을 구현

        캡슐화(Encapulation) : 객체의 필드와 메서들르 하나로 묶고, 일부를 외부에 감추어 은닉하는 것
            -> private 접근 지정자를 통해서 학습한 적이 있습니다.
        해시코드(Hashcode) : 객체의 고유한 정수 값을 반환하는 메서드
            -> 해당 정수 값은 객체의 메모리 주소 혹은 상태를 기반으로 생성

            1. 기본 구현 : 기본적으로 Object 클래스의 hashCode()는 객체의 메모리 주소를 기반으로
                한 정수 값을 반환 -> 대부분 클래스에서 '재정의'됨.

            2. 재정의 필요성 : 커스텀 클래스(사용자 정의 클래스)를 만들 때, equals() 메서드를
                재정의했다면, hashCode() 메서드도 재정의할 필요가 있음 -> 두 메서드의 일관성을 이유로

            3. 규약(protocol) :
                일관성 : 같은 객체에 대해 여러 번 호출된 hashCode() 메서드는 항상 동일한 정수값을
                    반환해야 함.
                동등 객체 : 두 객체가 equals() 메서드에 따라 같은 값이 반환된다면(즉, true가 나온다면)
                    두 객체의 hashCode() 값도 동일해야 함.
                서로 다른 객체 : 두 객체가 서로 다르더라도 반드시 다른 hashCode 값을 반환할 필요는 없음
                    -> 하지만 다른 값을 반환하는 것이 hashTable의 성능을 향상시킬 수 있음.
     */
}

