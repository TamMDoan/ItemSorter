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

        // COMPARE ASCII OF EACH INDIVIDUAL LETTER DUMMY
        for(int i = 0; i < o1.getName().length(); i++){
            if(o1.getName().charAt(i) > o2.getName().charAt(i)){
                return 1;
            }
            else if(o1.getName().charAt(i) < o2.getName().charAt(i)){
                break;
            }
        }
        return -1;

    }

//    @Override
//    public int compare(Item o1, Item o2){
//        if(o1.getName().equals(o1.getName())){
//            return 0;
//        }
//        else if(o1.get > o2.getId()){
//            return 1;
//        }
//
//        return -1;
//    }
}
