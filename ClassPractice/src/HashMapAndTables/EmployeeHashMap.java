package HashMapAndTables;

import innerClasses.Employee;

import java.util.HashMap;
import java.util.Objects;

public class EmployeeHashMap {

        private String id;
        private String name;

        public EmployeeHashMap(String id, String name) {
            this.id = id;
            this.name = name;
        }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeHashMap that = (EmployeeHashMap) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "id: " + id + '\'' +
                ", name: " + name + '\'';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    public static boolean hasEmployee(HashMap<String, EmployeeHashMap> emps, String employeeId) {
            if(emps.containsKey(employeeId)) {
                return true;
            }
            return false;
    }

    public static void main(String[] args) {
        HashMap<String, EmployeeHashMap> employeeHashMap = new HashMap<>();
        employeeHashMap.put("one", new EmployeeHashMap("one", "John"));
        employeeHashMap.put("two", new EmployeeHashMap("two", "Jane"));
        employeeHashMap.put("three", new EmployeeHashMap("three", "John"));
        System.out.println(employeeHashMap);

        System.out.println(hasEmployee(employeeHashMap, "one"));
        System.out.println(hasEmployee(employeeHashMap, "seven"));

    }
}
