package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo= new PersonVO("홍길동",50,"010-2222-1111");
        System.out.println(vo.toString());
        System.out.println(vo);
    }
}
