
package laboop.Lab02;

import static laboop.Lab02.Cart.MAX_NUMBERS_ORDERED;

public class Store {
    private int curStore = 0;
    public static final int MAX_NUMBERS_STORE = 50;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_STORE];

    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }
    
    public void addDVD(DigitalVideoDisc disc){
        if(curStore == MAX_NUMBERS_STORE){          // check neu cart day
            System.out.println("the cart is full");
        }
        else{
            for(int i=0; i<MAX_NUMBERS_STORE;++i){    //them vao cart
                if(itemsInStore[i] == null){
                    itemsInStore[i] = disc;
                    ++ curStore;                      //tang quantity
                    System.out.println("success");
                    break;
                }   
            }
        }    
    }
    
    public void removeDVD(DigitalVideoDisc disc){//xoa
        for(int i=0; i<MAX_NUMBERS_ORDERED;++i){
            if(disc.equals(itemsInStore[i])){           // neu tim thay 
                -- curStore;                          //giam quantity
                System.out.println("success");
                itemsInStore[i] = null;                 //xoa
                    break;
                }              
            }
    }
    
}
