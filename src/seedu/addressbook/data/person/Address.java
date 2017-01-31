package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    private class Block {
    	private final String value;
    	
    	public Block(String value) {
    		this.value=value;
    	}
    	public String getValue() {
    		return value;
    	}
    }
    private class Street {
    	private final String value;
    	
    	public Street(String value) {
    		this.value=value;
    	}
    	public String getValue() {
    		return value;
    	}
    }
    private class Unit {
    	private final String value;
    	
    	public Unit(String value) {
    		this.value=value;
    	}
    	public String getValue() {
    		return value;
    	}
    }
    private class PostalCode {
    	private final String value;
    	
    	public PostalCode(String value) {
    		this.value=value;
    	}
    	public String getValue() {
    		return value;
    	}
    }
    Block block;
    Street street;
    Unit unit;
    PostalCode postalCode;
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = trimmedAddress;
        String[] addressAttributes = address.split(",");
        if(addressAttributes.length>=1) {
        	this.block = new Block(addressAttributes[0].trim());
        }
        if(addressAttributes.length>=2) {
        	this.street = new Street(addressAttributes[1].trim());
        }
        if(addressAttributes.length>=3) {
        	this.unit = new Unit(addressAttributes[2].trim());
        }
        if(addressAttributes.length>=4) {
        	this.postalCode = new PostalCode(addressAttributes[3].trim());
        }
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
