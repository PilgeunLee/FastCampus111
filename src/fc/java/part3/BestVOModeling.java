package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO movie = new MovieVO("아바타",20221214,"제이크설리","액션",192.0f,12);
        System.out.println(movie);
    }
}