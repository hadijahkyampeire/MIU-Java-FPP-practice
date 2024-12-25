package MidtermPractice.qn1;

public class Person {
    String firstname;
    String lastname;
    String city;
    Contact[] contacts;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public Person(String firstname, String lastname, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
    }

    @Override
    public String toString() {
        return "First Name: " + firstname + " Last Name: " + lastname + " City: " + city;
    }

    public boolean hasContactWithEmail(String email) {
        if (contacts == null) return false;
        for (Contact contact : contacts) {
            if (contact.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean equals(Object person) {
        if (person == this) return true;
        if (person == null) return false;
        if (person.getClass() != this.getClass()) return false;
        Person person1 = (Person) person;

        boolean isEqual = person1.firstname.equals(this.firstname)
                && person1.lastname.equals(this.lastname)
                && person1.city.equals(this.city);
        return isEqual;
    }
}
