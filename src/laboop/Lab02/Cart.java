package laboop.Lab02;

import java.util.Arrays;

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
    
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        long a = Arrays.stream(dvdList).filter(e -> e != null).count();
        if(qtyOrdered + a> MAX_NUMBERS_ORDERED ){          // check neu cart day
            System.out.println("the cart is full");
        }
        else{
            int index=0;
            for(int i=0; i<MAX_NUMBERS_ORDERED;++i){    //them vao cart
                if(itemsOrdered[i] == null){
                    itemsOrdered[i] = dvdList[index];
                    ++index;
                    cost += itemsOrdered[i].getCost();  //tang cost
                    ++ qtyOrdered;                      //tang quantity
                    System.out.println("success");
                    if(index == a) break;
                }   
            }
        }
        
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if(qtyOrdered > MAX_NUMBERS_ORDERED - 1){          // check neu cart day
            System.out.println("the cart is full");
        }
        else{
            for(int i=0; i<MAX_NUMBERS_ORDERED;++i){    //them vao cart
                if(itemsOrdered[i] == null){
                    itemsOrdered[i] = dvd1;
                    cost += itemsOrdered[i].getCost();  //tang cost
                    ++ qtyOrdered;                      //tang quantity
                    System.out.println("success");
                    break;
                }   
            }
            for(int i=0; i<MAX_NUMBERS_ORDERED;++i){    //them vao cart
                if(itemsOrdered[i] == null){
                    itemsOrdered[i] = dvd2;
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
    
    public void searchByTitle(String title){
        for(int i=0; i<MAX_NUMBERS_ORDERED;++i){
            if(itemsOrdered[i]!=null && (itemsOrdered[i].getTitle()).equals(title)){
                System.out.println(itemsOrdered[i]);
                break;
            }
        }
    }
    public void print(){
        int index=0;
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i=0; i<MAX_NUMBERS_ORDERED;++i){
            if(itemsOrdered[i]!=null ){
                ++index;
                System.out.print(index + ". ");
                System.out.println(itemsOrdered[i]);
            }
        }
        System.out.println("Total cost: " + String.format("%.2f", this.totalCost()));
        System.out.println("***************************************************");
    }
}
