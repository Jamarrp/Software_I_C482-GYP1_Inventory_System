package Model;

import java.util.ArrayList;

public class Product {

    private int productID;
    private String name;
    private double price = 0.0;
    private int inStock = 0;
    private int min;
    private int max;
    private ArrayList<Part> associatedParts = new ArrayList<>();

    public Product(int productID, String name, double price, int inStock, int min, int max) {
        setProductID(productID);
        setName(name);
        setPrice(price);
        setInStock(inStock);
        setMin(min);
        setMax(max);
    }

//Product setters

    public void setProductID(int productID) {this.productID = productID;}

    public void setName(String name) {this.name = name;}

    public void setPrice(double price) {this.price = price;}

    public void setInStock(int stock) {this.inStock = stock;}

    public void setMin(int min) {this.min = min;}

    public void setMax(int max) {this.max = max;}

//Product getters

    public int getProductID() {return this.productID;}

    public String getName() {return this.name;}

    public double getPrice() {return this.price;}

    public int getInStock() {return this.inStock;}

    public int getMin() {return this.min;}

    public int getMax() {return this.max;}

//Associated Parts

    public void addAssociatedPart(Part partsToAdd) {associatedParts.add(partsToAdd);}

    public boolean removeAssociatedParts(int partToRemove) {
        return true;
    }

}
