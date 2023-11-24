package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        if(o1.getName().toLowerCase().equals(o2.getName())){
            return 0;
        }
        else if(o1.getName().length() > o2.getName().length()){
            return 1;
        }

        return -1;

    }
}
