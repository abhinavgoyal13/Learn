package javacodes.CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTutorials {
    public void arraylistFunctions()
    {
        ArrayList<String> ai = new ArrayList<String>();
        ai.add("Abhinav");
        ai.add("Goyal");
        System.out.println(ai.size());
        System.out.println(ai.contains("Goyal"));
        Iterator<String> i=ai.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println(ai.get(0));
        System.out.println(ai.indexOf("Goyal"));
        System.out.println(ai.toString());
        System.out.println(ai);


    }
     public static void main(String [] args)
     {
         ArrayListTutorials at = new ArrayListTutorials();
         at.arraylistFunctions();
     }
}
