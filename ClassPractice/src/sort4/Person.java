package sort4;

import java.util.Arrays;
import java.util.Comparator;

public class Person {
	private String fname;
	private String lname;
	private double salary;
	
	public Person(String n, String l, double salary) {
		fname = n;
		lname = l;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return fname + " " + lname + " " + salary;
	}
	
	static class innerSort implements Comparator<Person> {
		@Override
		public int compare(Person o1, Person o2) {
			// reverse order
			return Double.compare(o2.getSalary(), o1.getSalary());
		}
	}
	
}
