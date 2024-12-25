package MidtermPractice.qn1;

public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("h@gmail.com", "+17888899",ContactType.BUSINESS);
        Contact c2 = new Contact("h@gmail.com", "+17888899",ContactType.PERSONAL);
        Contact c3 = new Contact("m@gmail.com", "+17888899",ContactType.OFFICE);

        Contact[] contacts = {c1, c2 };
        Contact[] contacts2 = {c3};

        Person p1 = new Person("ma", "ke", "Fair");
        Person p2 = new Person("ma", "ke", "Fair");
        Person p3 = new Person("mar", "kem", "Fair");

        p1.setContacts(contacts);
        p2.setContacts(contacts);
        p3.setContacts(contacts2);

        System.out.println(p1.equals(p2));
        System.out.println(c1.equals(c2)); // true
        System.out.println(p1.hasContactWithEmail(c1.email));

    }
}
