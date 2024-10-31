package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

/**
 * The type Poly array test 2.
 */
public class PolyArrayTest2 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c= new Cat();

        Animal[ ] ani= new Animal[2];
        ani[0] = d;
        ani[1] = c;
        display1(ani);
    }

    private static void display1(Animal[] ani) {
        for (int i =0 ; i<ani.length; i++){
            ani[i].eat();
            if (ani[i] instanceof Cat){
                ((Cat)ani[i]).night();
            }
        }
    }
}
