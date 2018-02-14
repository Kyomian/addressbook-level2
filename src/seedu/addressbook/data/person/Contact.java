package seedu.addressbook.data.person;

/**
 * Represents a contact
 */
public class Contact {
    public String value;
    public boolean isPrivate;

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
