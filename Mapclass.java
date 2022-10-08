//id-21ce010,name-vedika
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
 
class Mapclass {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            Integer integer = treeMap.get(word);
            if (integer == null)
                treeMap.put(word, 1);
            else
                treeMap.put(word, integer + 1);
            }
            Set s=treeMap.entrySet();
            Iterator i=s.iterator();
            while(i.hasNext())
            {
             Map.Entry t=(Map.Entry) i.next();
             System.out.println(t.getKey()+" "+t.getValue());
            }
        System.out.println(treeMap);
    }
}
