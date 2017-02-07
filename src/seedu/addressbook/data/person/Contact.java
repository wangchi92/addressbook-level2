package seedu.addressbook.data.person;

/**
 * Represents an type of contact detail.
 */
public abstract class Contact {
    public final String value;
    private boolean isPrivate;

    /**
     * @param _value        is the stored string data
     * @param _isPrivate    whether the data is private in boolean
     */
    public Contact(String _value, boolean _isPrivate) {
        this.value = _value;
        this.isPrivate = _isPrivate;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
