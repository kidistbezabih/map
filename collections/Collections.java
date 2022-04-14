package collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {

        
        List<Integer> l2 =Arrays.asList(1,2,3,5,6);
        List l1 = Arrays.asList(7,8,9,0);
        List l3 = new ArrayList();
        l3.addAll(l1);
        l3.addAll(l2);

//        Sysmtem.out.println(ls.getClass().getName());
        Iterator t = l3.iterator();
        
        while (t.hasNext()) {
            System.out.println(t.next());
        }
//        ListIterator itr = ls.listIterator();
//        for (int i = 10; i > 1; i--) {
//            l1.add(i);
//        }
        
        
//        while (itr.hasNext()) {
//           System.out.println(itr.next());
//           itr.remove();
//           System.out.println(itr);
//
//        }
    }
}
