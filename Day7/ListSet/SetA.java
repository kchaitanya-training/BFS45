package Day7.ListSet;

import java.util.*;

public class SetA {
    void newHashmap()
    {
    Map mp = new HashMap();
    mp.put(1, "Breakfast");
    mp.put(2, "Lunch");
    mp.put(3, "Dinner");

    Object k = mp.keySet();
    Object v = mp.values();
    Object e = mp.entrySet();
        System.out.println(mp);
        System.out.println("Keys: " + k);
        System.out.println("Values: " + v);
        System.out.println(e);

     }

     void newHashonly()
     {
         HashMap<Integer,String> hm = new HashMap();
         hm.put(101, "John");
         hm.put(102, "Maxie");

         System.out.println("HashMap: " + hm);
     }
     void newHashset()
     {
         HashSet<Integer> hset= new HashSet<>();
         hset.add(5);
         hset.add(6);
         hset.add(7);
         System.out.println("HashSet: " + hset);

     }
     void newSet()
     {
         Set sob = new HashSet();
         sob.add("hello");
         sob.add(12);
         sob.add(45.66);
         sob.add(true);
         System.out.println("Set Object: " + sob);

     }

    public static void main(String[] args) {
        SetA sa = new SetA();
        sa.newHashmap();
        sa.newHashonly();
        sa.newHashset();
        sa.newSet();




    }}
