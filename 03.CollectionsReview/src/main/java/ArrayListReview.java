import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
List<Student> students=new ArrayList<>();

// Add elements to ArrayList
        students.add(new Student(1,"Jack"));
        students.add(new Student(2,"Julia"));
        students.add(new Student(3,"Mike"));
        students.add(new Student(4,"Mary"));

        // Iteration on ArrayLists
        // 1. For Loop with get(index)
        System.out.println("print with legacy for-loop");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("Printing with legacy for-loop..............");

        // 2. Iterator
        // Forward Iteration
        System.out.println("printing with iterator");
Iterator iter=students.listIterator();

while(iter.hasNext()){
    System.out.println(iter.next());
}

        // Backwards Iteration
        System.out.println("printing backwards with iterator");
        while(((ListIterator<Student>) iter).hasPrevious()){
            System.out.println(((ListIterator<Student>) iter).previous());}
        // 3. for each loop
        System.out.println("Printing with for_each loop..............");


        // 4. Lambda


        // Sorting Elements in List using comparator interface

        //  implementations of  Comparator
    }}