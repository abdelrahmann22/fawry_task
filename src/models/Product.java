package models;

public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}

    public boolean isAvailable(int quantity){
        return this.quantity >= quantity;
    }

    public void reduceQuantity(int value){
        this.quantity = value;
    }

}
