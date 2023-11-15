package laboop.Lab02;

import java.util.StringJoiner;

public class DigitalVideoDisc {
    static String title;
    static String category;
    static String director;
    static int length;
    static float cost;
    private static int nbDigitalVideoDiscs = 0;

    public String getTitle() {
        return title;    }
    public void setTitle(String title) {
        DigitalVideoDisc.title = title;    }
    public String getCategory() {
        return category;    }
    public void setCategory(String category) {
        DigitalVideoDisc.category = category;    }
    public String getDirector() {
        return director;    }
    public void setDirector(String director) {
        DigitalVideoDisc.director = director;    }
    public int getLength() {
        return length;    }
    public void setLength(int length) {
        DigitalVideoDisc.length = length;    }
    public float getCost() {
        return cost;    }
    public void setCost(float cost) {
        DigitalVideoDisc.cost = cost;    }

    public DigitalVideoDisc(String title) {
        DigitalVideoDisc.title = title;
        DigitalVideoDisc.nbDigitalVideoDiscs++;
    }
    
    public DigitalVideoDisc(String title, String category, float cost) {
        DigitalVideoDisc.title = title;
        DigitalVideoDisc.category = category;
        DigitalVideoDisc.cost = cost;
        DigitalVideoDisc.nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        DigitalVideoDisc.title = title;
        DigitalVideoDisc.category = category;
        DigitalVideoDisc.director = director;
        DigitalVideoDisc.cost = cost;
        DigitalVideoDisc.nbDigitalVideoDiscs++;
    }
    
    public void info(){
        System.out.println(title+" "+category+" "+director+" "+cost+" "+nbDigitalVideoDiscs);
    }
    
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        DigitalVideoDisc.title = title;
        DigitalVideoDisc.category = category;
        DigitalVideoDisc.director = director;
        DigitalVideoDisc.length = length;
        DigitalVideoDisc.cost = cost;
        DigitalVideoDisc.nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }    

    

//    @Override
//    public String toString() {
//        return "DVD" + " - " + title + " - " + category + " - " + director + " - " + length + " - " + cost + "$";
//    }
 
    @Override
    public String toString() {
        final var joiner = new StringJoiner(" - ",  "DVD - ", "");
        joiner.add("" + title + "");
        joiner.add("" + category + "");
        if (director != null) {
            joiner.add("" + director + "");
        }
        if (length != 0) {
            joiner.add("" + length + "");
        }
        joiner.add("" + cost + "");
        return joiner.toString();
    }   
}
