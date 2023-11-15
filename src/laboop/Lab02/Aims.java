package laboop.Lab02;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc (dvd1);//them dvd1
        dvd1.info();
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
        anOrder.addDigitalVideoDisc (dvd2);//them dvd1
        dvd2.info();
        DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc (dvd3);//them dvd1

        dvd3.info();
        dvd1.info(); //dvd3==dvd1
    }

        System.out.println("Total Cost is: ");//in ra cost
        System.out.println(String.format("%.2f", anOrder.totalCost()));
        anOrder.removeDigitalVideoDisc(dvd1); //xoa khoi gio
        System.out.println("Total Cost is: ");//in ra cost
        System.out.println(String.format("%.2f", anOrder.totalCost())); // cost se giam di 19.95
        DigitalVideoDisc[] dvd = new DigitalVideoDisc[10];
        dvd[0] = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        dvd[1] = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        dvd[2] = new DigitalVideoDisc ("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd);
        System.out.println("Total Cost is: ");//in ra cost
        System.out.println(String.format("%.2f", anOrder.totalCost()));
    }   

}

