package javacodes.oops.Static;

public class Driver {
    public static void main(String[] args)
    {
        System.out.println(StaticTutorials.z);
        StaticTutorials st = new StaticTutorials();
        st.x=40;
        st.y=50;
        StaticTutorials.example();
    }
}
