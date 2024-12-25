package sort2;

import java.util.Arrays;
import java.util.Comparator;

/** Sort2-Comparator using Member Inner class */
public class PersonData {
	public static Person[] prepareData() {
		Person[] persons = 
			{new Person("Joe","Brown",4566.56), new Person("Bob","Roth",3455.23), 
			 new Person("Anne","Mary",6788.90), new Person("Tim","Cook",2345.67),
			 new Person("Rosy","Cook",4567.88)};
		return persons;
	}

	public static void main(String[] args) {
		
		Person[] persons1 = prepareData();
		PersonData ob = new PersonData();

		System.out.println("Before sorting" + Arrays.toString(persons1));
		Arrays.sort(persons1, ob.getmySorter());
		System.out.println("After sorting" + Arrays.toString(persons1));
		
	}	
	
	private class MySorter implements Comparator<Person> {
		@Override
		public int compare(Person o1, Person o2) {
			return o1.getLname().compareTo(o2.getLname());
		}
	}

	public MySorter getmySorter() {
		return new MySorter();
	}
}
