package javacodes.CCI.Arrays;

import java.util.HashSet;
import java.util.Iterator;

public class SetTutorials {
    public void setexample()
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Abhinav");
        hs.add("Goyal");
        hs.add("Goyal");
        System.out.println(hs);
        System.out.println(hs.contains("Go"));
        Iterator<String> hi =hs.iterator();
        while(hi.hasNext())
        {
            System.out.println(hi.next());
        }


    }
    public static void main(String [] args)
    {
        SetTutorials st= new SetTutorials();
        st.setexample();
    }
}
