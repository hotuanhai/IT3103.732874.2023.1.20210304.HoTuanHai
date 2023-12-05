
package laboop.Lab02;

import java.util.ArrayList;
import laboop.Lab02.aims.media.DigitalVideoDisc;
import static laboop.Lab02.Cart.MAX_NUMBERS_ORDERED;
import laboop.Lab02.aims.media.Media;

public class Store {
    public static final int MAX_NUMBERS_STORE = 50;// bo curnumber
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media me){//them media
        itemsInStore.add(me);
    }
    
    public void removeMedia(Media me){//xoa media
        itemsInStore.remove(me);
    }
     public static Media searchMediaByTitle(Store store, String title) {
            for (Media media : store.itemsInStore) {
                if (media.getTitle().equals(title)) {
                    return media; // Found the media with the specified title
                }
            }
            return null; // Media with the specified title not found
    }
    
}
