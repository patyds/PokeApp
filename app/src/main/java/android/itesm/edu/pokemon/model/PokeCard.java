package android.itesm.edu.pokemon.model;

public class PokeCard {
    private String id, name, imageURL, author;

    public PokeCard(String id, String name, String imageURL, String author) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.author = author;
    }

    public PokeCard(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
