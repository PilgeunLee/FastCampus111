package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        PersonVO vo=new PersonVO();
        vo.setName("홍길동");
        vo.setAge(50);
        System.out.println(vo.getName()+"\t"+vo.getAge());
    }
}
