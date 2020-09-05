package javacodes.oops.abstraction.interfaces;

public class Driver {
    public static void main(String[] args)
    {
        Nokia nk = new Nokia();
        Samsung sg = new Samsung();

        nk.clock();;
        nk.display();
        nk.updates();
        sg.display();
        sg.clock();
        sg.updates();
        nk.appledisplay();;
        nk.appleUpdate();

    }
}
