package fc.java.poly;

public class Board  extends Object {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
//    public String toString(){
//        return title;
//    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
