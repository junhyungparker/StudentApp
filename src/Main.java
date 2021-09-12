import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		al.add(new Student(101,"Kim",23));
		al.add(new Student(102,"Choi", 21));
		al.add(new Student(103,"Park", 25));
		al.add(new Student(104,"Caleb",22));
		al.add(new Student(105,"James", 26));
		al.add(new Student(106,"April", 25));
		al.add(new Student(107,"Matthew",20));
		al.add(new Student(108,"Adam", 21));
		al.add(new Student(109,"Samuel", 25));
		al.add(new Student(110,"Kristen", 21));
		
		Collections.sort(al);
		for (Student s : al) {
			System.out.println(s.toString());
		}
	}

}
