package laboop.Lab02.aims.media;

public class Media extends Object{
    private int id;
    private String title;
    private String category;
    private float cost;

    // Constructors
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Media{" + "id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + '}';
    }

    
    public static void main(String[] args) {
        
    }
    // Getter methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    // Setter methods (if needed)
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Other methods or functionality can be added as needed
}
