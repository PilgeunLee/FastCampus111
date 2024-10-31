package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PloyTest {
    public static void main(String[] args) {
        //Upcasting으로 객체를 생성
        //상속관계, 재정의 (Override), 동적바인딩
        Animal ani = new Dog();
        ani.eat();

        ani=new Cat();
        ani.eat();
        ((Cat)ani).night();

    }
}
