package javacodes.CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTutorials {

    public void mapExample()
    {
        HashMap<String,Integer> hmp = new HashMap<String,Integer>();
        hmp.put("A",65);
        hmp.put("B",66);

        System.out.println(hmp.get("A"));
        System.out.println( hmp.containsKey("A"));
        Set s= hmp.entrySet();

        Iterator i= s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
            Map.Entry mp = (Map.Entry) i.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }

        


    }
    public static void main(String[] args)
    {
        MapTutorials ms= new MapTutorials();
        ms.mapExample();
    }
}
