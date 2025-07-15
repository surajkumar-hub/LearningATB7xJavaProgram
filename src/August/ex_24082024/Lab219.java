package August.ex_24082024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab219 {
    public static void main(String[] args) {
        // Student - name, id
        Student s1 = new Student(4, "Supriya");
        Student s2 = new Student(2, "Thakur Amit Singh");
        Student s3 = new Student(3, "Muthu");
        Student s4 = new Student(1, "Darshan");

        List arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        System.out.println(arrayList);
        // Collections.sort(arrayList); // this is if we are using Comparable
//        Collections.sort(arrayList, new SortByID());
//        Collections.sort(arrayList, new SortByName());
//        Collections.sort(arrayList, new SortByIDDesc());
        Collections.sort(arrayList, new SortByNameDesc());
        System.out.println(arrayList);


    }
}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNameDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

class SortByID implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class SortByIDDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}


//class Student implements Comparable<Student> {
class Student {
    private Integer id;
    private String name;

    public Student(Integer id, String name) // Parameterized Constructor
    {
        this.id = id;
        this.name = name;
    }

    public Integer getId()  // Getter Method
    {
        return id;
    }

    public void setId(Integer id) // Setter Method
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
/** toString() is used to print the object information like student name and ID. If we don't use this
 method, then only object address will be printed **/

//    @Override
//    public int compareTo(Student another) {
//        return Integer.compare(this.id, another.id);
//    }
//
//    @Override
//    public int compareTo(Student another) {
//        return CharSequence.compare(this.name, another.name);
//    }
}

/** When we have normal numbers like Lab220, Collections.sort will do the sorting without any hesitation
 because there we have natural sorting.But when we have to compare one student with another like Lab219,
 (whether based on ID  or based on name or based on phone number), we have to tell this. In this case
 we have to use compareTo() method.
 1st s1.id will be compare with s2.id -> Sorting will be 2,4
 Then s2.is will be compare with s3.id -> Sorting will be 2,3,4
 But there is a disadvantage - By using the Comparable we can't compare based on id and name.
 Either we should use id or name.
 Instead of this we can use Comparator.
 We have to create a new class le this -> class SortByName {} or class SortByID {}.
 We can create n number of classes based on attributes but here we need to implement Comparator ->
 class SortByName implements Comparator<Student> or class SortByID implements Comparator<Student>.
 There is a function called compare(), where we need to pass Student o1 and Student o2 as an argument.
 To compare based on the name we have to write like this -> return o1.getName().compareTo(o2.getName());
 To compare based on the ID we have to write like this -> return Integer.compare(o1.getId(), o2.getId());

 Using Comparator interface we can derive our own comparison logic
 */
