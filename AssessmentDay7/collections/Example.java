package AssessmentDay7.collections;

import java.util.*;

public class Example {
    void arrayList() {
        ArrayList<Object> arr = new ArrayList<Object>();

        arr.add(10);
        arr.add("Hello,World");
        arr.add(new SampleData());

        arr.add(10.5);

        System.out.println("----\n\rArrayList\n\r----");
        System.out.println(arr);

        arr.remove(10.5);
        System.out.println(arr);

        Iterator<Object> i = arr.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (Object a : arr) {
            System.out.println(a);
        }
    }

    void hashSet() {
        Set<Object> s = new HashSet<Object>();

        s.add(10);
        s.add("Hello,World");
        s.add(new SampleData());

        s.add(10.5);

        System.out.println("----\n\rHashSet\n\r----");

        System.out.println(s);

        s.remove(10.5);
        System.out.println(s);
    }

    void hashMap() {
        Map<Object, Object> m = new HashMap<Object, Object>();

        m.put("Key", "Value");
        m.put(10, 3.14f);
        m.put('a', new SampleData());

        System.out.println("----\n\rHashMap\n\r----");
        System.out.println(m);
        System.out.println(m.get('a'));

        Set<Object> s = m.keySet();
        System.out.println("Keys");
        System.out.println(s);
        System.out.println("Values");
        System.out.println(m.values());
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.arrayList();
        ex.hashSet();
        ex.hashMap();
    }
}

class SampleData {
    @Override
    public String toString() {
        return "Sample Data Object";
    }
}
