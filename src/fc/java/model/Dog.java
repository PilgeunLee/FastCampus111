package fc.java.model;

public class Dog extends Animal {
    public Dog(){
        super();
    }
    //재정의 Override
    public void eat() {
        System.out.println("강아지처럼 먹다");
    }
}
