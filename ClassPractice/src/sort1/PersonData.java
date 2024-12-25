package sort1;

import java.util.Arrays;
import java.util.Comparator;
// Sort1-Outside Comparator
/** Processes person data. Makes use of an external NameComparator class */
public class PersonData {
	public static Person[] prepareData() {
		Person[] persons = 
			{new Person("Joe","Brown",4566.56), new Person("Bob","Roth",3455.23), 
			 new Person("Anne","Mary",6788.90), new Person("Tim","Cook",2345.67),
			 new Person("Rosy","Cook",4567.88)};
		return persons;
	}
	public static void main(String[] args) {
		
		Person[] persons = prepareData();
		System.out.println("Before sorting:" + Arrays.toString(persons));
		Arrays.sort(persons, new FirstNameComparator());
		System.out.println("After sorting:" + Arrays.toString(persons));

	}	
	
}
