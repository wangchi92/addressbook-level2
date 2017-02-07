package seedu.addressbook.data.person;

public abstract class Contact {
	public final String value;
	private boolean isPrivate;

	public Contact (String _value, boolean _isPrivate) {
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
