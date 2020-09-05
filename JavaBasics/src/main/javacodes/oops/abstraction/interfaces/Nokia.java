package javacodes.oops.abstraction.interfaces;

public class Nokia implements AndriodMobile,Apple {
    @Override
    public void display() {
        System.out.println("Nokia display");
    }

    @Override
    public void clock() {
        System.out.println("Nokia clock display");
    }

    @Override
    public void updates() {
        System.out.println("Nokia updates");
    }

    @Override
    public void appledisplay() {
        System.out.println("Apple display");
    }

    @Override
    public void appleUpdate() {
        System.out.println("apple updates");
    }
}
