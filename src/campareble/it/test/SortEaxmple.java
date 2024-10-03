package campareble.it.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortEaxmple {
public static void main(String[] args) {

	// this is eaxmple of compreble and comparetor
	ArrayList<Student> list=new ArrayList<Student>();
	list.add(new Student(7,"deepak",15));
	list.add(new Student(5,"amit",20));
	list.add(new Student(19,"virat",14));
	list.add(new Student(9,"pankaj",25));
	System.out.println(list);
	Collections.sort(list,new IdComparator());
	System.out.println(list);
	ArrayList<Student> list1=new ArrayList<Student>(list);
	Collections.sort(list1,new NameComparator());
	System.out.println(list1);
	/*System.out.println("sort by id ");
	System.out.println(list);
	ArrayList<Student> list1=new ArrayList<Student>();
	list1.add(new Student(7,"deepak",15));
	list1.add(new Student(5,"amit",20));
	list1.add(new Student(19,"virat",14));
	list1.add(new Student(9,"pankaj",25));
	Collections.sort(list1);
	System.out.println("sort by name");
	System.out.println(list1);*/
}
}
