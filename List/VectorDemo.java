package List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        int capacity =v.capacity();
        System.out.println(capacity);
        for (int i = 0 ; i < v.capacity() ; i++){
            v.add(i);
        }
        System.out.println(v);
        System.out.println(v.hashCode());

        v.addElement(1231);
        System.out.println(v.capacity());
        System.out.println(v);

        // Using enumerator for legacy class like vector

        Enumeration<Integer> elements = v.elements();
        while (elements.hasMoreElements()){
            Integer integer = elements.nextElement();
            System.out.print(integer + " ");
        }





    }
}
