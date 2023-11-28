package addressBook;

public class Contact {
    String firstName;
    String lastName;

    private Contact(ContactBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class ContactBuilder{
        Contact contact;

        private String firstName;

        private String lastName;

        public ContactBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ContactBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}
