package hwsort.taska;

import java.util.Arrays;
public class TaskAMain {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        Arrays.sort(data, new NameComparator());
        System.out.println("Comparator outside by name");

        for(DeptEmployee e : data) {
            System.out.println(e);
        }
        System.out.println("Lamba --------");
        // Lamba
        Arrays.sort(data, (e1, e2) -> e2.getName().compareTo(e1.getName()));
        System.out.println("Comparator outside by name");
        for(DeptEmployee e : data) {
            System.out.println(e);
        }
    }

}
