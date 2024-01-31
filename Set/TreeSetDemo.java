package Set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable{

    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student(String name , Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        Integer id = student.getId();
        if (this.id > id){
            return 1;
        } else if (this.id <id) {
            return -1;
        }else {
            return 0;
        }
    }
}
class Mycoparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        Integer id1 = s1.getId();
        Integer id2 = s2.getId();
        if (id1 > id2){
            return 1;
        } else if (id1 <id2) {
            return -1;
        }else {
            return 0;
        }


    }
}

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<Student> sortedSet = new TreeSet<>(new Mycoparator());
        sortedSet.add(new Student("Guru" , 12));
        sortedSet.add(new Student("Juju" , 1));
        sortedSet.add(new Student("Rudra" , 10));
        sortedSet.add(new Student("Satya" , 14));
        sortedSet.add(new Student("Kamala" , 2));
        sortedSet.add(new Student("Raja" , 12));


        System.out.println(sortedSet);
    }
}
