package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c= new Cat();

        Animal[] ani=new Animal[2];
        ani[0]=d;
        ani[1]=c;
        dispaly(ani);


    }

    private static void dispaly(Animal[] ani) {
        for (int i=0;i<ani.length;i++){
            ani[i].eat();
            if(ani[i] instanceof Cat){
                ((Cat)ani[i]).night();
            }
        }
    }
}
