package fc.java.part3;

public class Main {
    public static void main(String[] args) {
      int x=10, y=5;
        System.out.println("x="+x);
        System.out.println("y="+y);

        int tmp =x;
        x = y;
        y = tmp;
        System.out.println("X="+x);
        System.out.println("Y="+y);
    }
}