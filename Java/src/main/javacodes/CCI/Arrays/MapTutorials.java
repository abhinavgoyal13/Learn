package javacodes.CCI.Arrays;

import org.graalvm.compiler.replacements.StandardGraphBuilderPlugins;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
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
        


    }
    public static void main(String[] args)
    {
        MapTutorials ms= new MapTutorials();
        ms.mapExample();
    }
}
