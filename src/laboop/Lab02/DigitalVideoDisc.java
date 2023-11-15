package laboop.Lab02;

import java.util.StringJoiner;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;    }
    public void setTitle(String title) {
        this.title = title;    }
    public String getCategory() {
        return category;    }
    public void setCategory(String category) {
        this.category = category;    }
    public String getDirector() {
        return director;    }
    public void setDirector(String director) {
        this.director = director;    }
    public int getLength() {
        return length;    }
    public void setLength(int length) {
        this.length = length;    }
    public float getCost() {
        return cost;    }
    public void setCost(float cost) {
        this.cost = cost;    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }
    
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }

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
