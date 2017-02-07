package seedu.addressbook.data.tagging;

import seedu.addressbook.data.person.*;
import seedu.addressbook.data.tag.*;

public class Tagging {
    public final String operationName;
    public Person person;
    public Tag tag;

    public Tagging(String _operationName, Person _person, Tag _tag) {
        this.operationName = _operationName;
        this.person = _person;
        this.tag = _tag;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Tagging // instanceof handles nulls
                        && this.operationName.equals(((Tagging) other).operationName)
                        && this.person.equals(other)
                        && this.tag.equals(other)); // state
                                                                            // check
    }

    @Override
    public int hashCode() {
        return operationName.hashCode()+person.hashCode()+tag.hashCode();
    }

    @Override
    public String toString() {
        return operationName + ' ' + person.getName() + ' ' + tag.toString();
    }
}
