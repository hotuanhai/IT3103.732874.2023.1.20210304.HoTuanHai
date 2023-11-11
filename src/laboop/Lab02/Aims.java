package laboop.Lab02;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc (dvd1);//them dvd1
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
        anOrder.addDigitalVideoDisc (dvd2);//them dvd1
        DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc (dvd3);//them dvd1
        System.out.println("Total Cost is: ");//in ra cost
        System.out.println(String.format("%.2f", anOrder.totalCost()));
        anOrder.removeDigitalVideoDisc(dvd1); //xoa khoi gio
        System.out.println("Total Cost is: ");//in ra cost
        System.out.println(String.format("%.2f", anOrder.totalCost())); // cost se giam di 19.95
    }
}
//hello world
