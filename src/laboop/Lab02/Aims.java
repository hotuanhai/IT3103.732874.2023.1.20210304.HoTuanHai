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
}

