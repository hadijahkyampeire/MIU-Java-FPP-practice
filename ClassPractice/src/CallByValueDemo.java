class Student
{
    String name;
    int id;
    int score;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    Student()
    {
        name = null;
        id = 0;
    }

    Student (String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

public class CallByValueDemo
{
    public static void main(String[] args)
    {
        // Create an object s1 on the heap and return a value of the heap memory reference - 45
        Student s1 = new Student("Anne", 10);
        Student s2 = new Student("Biniam", 11);
        Student s3 = new Student("Seifu", 12);

        System.out.println("Before Swap");
        System.out.println("s1 - Name: " + s1.name + "\t" + "ID : " + s1.id);
        System.out.println("s2 - Name: " + s2.name + "\t" + "ID : " + s2.id);
        System.out.println(); //inserting new line


        /* swap (s1, s2) would not be able to swap
         * objects s1, and s2 because in Java, parameters
         * are passed by value to the function.
         */
        swap (s1, s2);

        System.out.println("After Swap");
        System.out.println("s1 - Name: " + s1.name + "\t" + "ID : " + s1.id);
        System.out.println("s2 - Name: " + s2.name + "\t" + "ID : " + s2.id);

        // using Assignment

        Student temp;
        temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("Swap using Assignement without method call");
        System.out.println("s1 - Name: " + s1.name + "\t" + "ID : " + s1.id);
        System.out.println("s2 - Name: " + s2.name + "\t" + "ID : " + s2.id);

        int[] scores = {78,89,67};
        Student[] list = {s1,s2,s3};
        System.out.println("Before Assigning score");
        for(Student x:list){
            System.out.println(x.getScore());
        }
        // Setting the scores
        assignScore(list,scores);
        System.out.println("Setting the score using object Reference");
        for(Student x : list){
            System.out.println(x.getName() + " " + x.getScore());
        }
    }

    static void swap (Student x1, Student x2)    {
        /* objects x1, and x2 are swapped but
         * they will have no impact on actual
         * parameters passed to this function.
         * Therefore, x1, and x2 will be swapped
         * but not s1, and s2 that are actual parameters
         * passed to this function. It shows that Java uses pass by value
         */
        Student temp = x1;
        x1 = x2;
        x2 = temp;

        //Print swapped content of x1, x2
        System.out.println("Inside Swap method\n");
        System.out.println("From swap method x1 - Name: " + x1.name + "\t" + "ID :" + x1.id);
        System.out.println("From swap method x2 - Name: " + x2.name + "\t" + "ID :" + x2.id);

    }
    static void assignScore(Student ob[], int[] scr){
        int i=0;
        for(Student x:ob){
            x.setScore(scr[i++]);
        }
    }
}

