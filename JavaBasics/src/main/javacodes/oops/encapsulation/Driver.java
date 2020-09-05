package javacodes.oops.encapsulation;

public class Driver {
    public static void main(String[] args)
    {
        EncapExample ex= new EncapExample();
        ex.setA(10);
        ex.setB(20);
        System.out.println(ex.getA());
        System.out.println(ex.getB());
    }
}
