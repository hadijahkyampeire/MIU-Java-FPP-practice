package MidtermPractice.qn1;

public class Contact {
    String email;
    String phone;
    ContactType contactType;

    public Contact(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public Contact(String email, String phone, ContactType contactType) {
        this(email, phone);
        this.contactType = contactType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "email=" + email + ", phone=" + phone + ", contactType=" + contactType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Contact c = (Contact) obj;
        return email.equals(c.getEmail());
    }
}
