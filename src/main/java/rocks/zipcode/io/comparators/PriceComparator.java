package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        System.out.println(o1.getPrice());
        System.out.println(o2.getPrice());
        if(o1.getPrice() == o2.getPrice()){
            return 0;
        }
        else if(o1.getPrice() > o2.getPrice()){
            return 1;
        }

        return -11;
    }
}
