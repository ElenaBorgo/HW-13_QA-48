package ru.netology.Product;

public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            if (getName().contains(search)) {
                return getName().contains(search);
            }
            return true;
        }
        if (getAuthor().contains(search)) {
            return getAuthor().contains(search);
        }
        return false;
    }
}
