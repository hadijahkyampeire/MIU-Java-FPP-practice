package innerClasses;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Member inner class for managing address
    public class Address {
        private String city;
        private String state;

        // Complete this constructor
        public Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        // Complete this method to return the full address
        public String getFullAddress() {
            return city + ", " + state;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Software Engineer");
        Employee.Address empAddress = emp.new Address("New York", "NY");

        System.out.println("Employee: " + emp.name);
        System.out.println("Position: " + emp.position);
        System.out.println("Address: " + empAddress.getFullAddress()); // Should print "New York, NY"
    }
}

