package javacodes.oops.abstraction.interfaces;

public class Samsung implements AndriodMobile{
    @Override
    public void display() {
        System.out.println("Samsung Display");
    }

    @Override
    public void clock() {
        System.out.println("Samsung Clock");
    }

    @Override
    public void updates() {
        System.out.println("Samsung updates");
    }
}
