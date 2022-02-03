package q1;

import java.util.*;

public class PartOfQuestion1 {
	
	public static void main(String[] args) {
		Map<Student, Integer> map=new HashMap<>();
		map.put(new Student(109, "raj", 95), 95);
		map.put(new Student(61, "keta", 78), 78);
		map.put(new Student(11, "gunika", 98), 98);
		map.put(new Student(19, "keshav", 97), 97);
		
//		Print all records sorted as per name of the student
		
//		map.entrySet().stream()
//		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
//		.forEach(m->System.out.println(m));
		
//		Print all records as per id of the student
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId)))
		.forEach(m->System.out.println(m));
	}
}
