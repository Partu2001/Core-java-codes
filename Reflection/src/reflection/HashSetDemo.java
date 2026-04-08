package reflection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(null);
        hs.add(20);
        hs.add(40);
        System.out.println(hs);
        for (Integer ite : hs){
            System.out.println(ite);
        }

        Iterator itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}