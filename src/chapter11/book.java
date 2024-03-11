package chapter11;

public class book implements product{
    public String colour;
    public String name;
    public double price;
    public String author;
    public String isbn;
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String  getColour() {
        return colour;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }
}
