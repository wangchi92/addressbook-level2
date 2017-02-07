package seedu.addressbook.data.tagging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import seedu.addressbook.data.tag.Tag;

public class UniqueTaggingList {
    private final List<Tagging> internalList = new ArrayList<>();
    
    public void addTagging (Tagging tagging) {
        internalList.add(tagging);
    }
    
    public void clearTagging () {
        internalList.clear();
    }
    
    public String toString () {
        final StringBuilder builder = new StringBuilder();
        for (Tagging tagging : internalList) {
            builder.append(tagging.toString());
            builder.append('\n');
        }
        return builder.toString();
    }
}
