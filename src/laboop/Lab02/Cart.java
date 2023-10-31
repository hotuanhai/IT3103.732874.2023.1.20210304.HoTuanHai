package laboop.Lab02;
public class Cart {
    private double cost=0;//tong tien
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered [] = new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc){//add to cart
        if(qtyOrdered == MAX_NUMBERS_ORDERED){          // check neu cart day
            System.out.println("the cart is full");
        }
        else{
            for(int i=0; i<MAX_NUMBERS_ORDERED;++i){    //them vao cart
                if(itemsOrdered[i] == null){
                    itemsOrdered[i] = disc;
                    cost += itemsOrdered[i].getCost();  //tang cost
                    ++ qtyOrdered;                      //tang quantity
                    System.out.println("success");
                    break;
                }   
            }
        }
    }
    
    public double totalCost(){
        return cost;        //tra ve tong tien
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){//remove
        for(int i=0; i<MAX_NUMBERS_ORDERED;++i){
                if(disc.equals(itemsOrdered[i])){           // neu tim thay 
                    cost -= itemsOrdered[i].getCost();      //giam tien
                    -- qtyOrdered;                          //giam quantity
                    System.out.println("success");
                    itemsOrdered[i] = null;                 //xoa
                    break;
                }              
            }
    }
}
