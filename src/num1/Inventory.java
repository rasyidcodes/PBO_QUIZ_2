package num1;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Item> items =  new ArrayList<>();


    public void add(Item item){
        items.add(item);
        System.out.println("Item called "+ item.getNama() +" has been added to inventory");
    }

}
