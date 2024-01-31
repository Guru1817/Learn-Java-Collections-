package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(113);
        list.add(14);
        list.add(119);
        list.add(53);
        list.add(176);
        System.out.println(list);
        int a= list.size();
        System.out.println("the size of ArrayList is : " + a);

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(124);
        list1.add(13);
        list1.add(14);
        list1.add(19);
        list1.add(3);
        list1.add(76);
        Boolean newList = list.addAll(list1);//( list.addAll(list1));
        System.out.println(newList);
        System.out.println(list);
        System.out.println(list.size());

        for (Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
        Iterator<Integer> it = list.iterator();
         while (it.hasNext()){
             System.out.print(it.next() + " ");
         }
        System.out.println();

        System.out.println(list.contains(48));
        System.out.println(list.hashCode());
        System.out.println(list.isEmpty());

        


    }
}
