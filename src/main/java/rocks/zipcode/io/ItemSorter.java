package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        for(int i = 0; i < this.items.length - 1; i++){
            for(int j = i+1; j < this.items.length; j++){
                if(comparator.compare(this.items[i], this.items[j]) > 0){
                    Item temp = this.items[i];
                    this.items[i] = this.items[j];
                    this.items[j] = temp;
                }
            }
        }
        //System.out.println(this.items[0].getPrice() + " " + this.items[1].getPrice() + " " + this.items[2].getPrice());
        return this.items;
    }
}
