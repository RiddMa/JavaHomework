package hw19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class traverseCollection {
    void printHashcode(Collection<?> col){
        Iterator<?> it = col.iterator();
        while(it.hasNext()){
            System.out.println(it.next().hashCode());
        }
    }

    public static void main(String[] args) {
        Collection<String> ns = new ArrayList<String>();
        Collections.addAll(ns, "aa","bb","cc");
        System.out.println(ns);
        traverseCollection tc = new traverseCollection();
        tc.printHashcode(ns);
    }
}
