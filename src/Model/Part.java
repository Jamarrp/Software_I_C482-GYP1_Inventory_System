package Model;

public abstract class Part {

    protected int partID;
    protected String name;
    protected double price = 0.0;
    protected int inStock;
    protected int min;
    protected int max;

//Part setters

    public void setPartID(int partID) {this.partID = partID;}

    public void setName(String name) {this.name = name;}

    public void setPrice(double price) {this.price = price;}

    public void setInStock(int stock) {this.inStock = stock;}

    public void setMin(int min) {this.min = min;}

    public void setMax(int max) {this.max = max;}

//Part getters

    public int getPartID() {return this.partID;}

    public String getName() {return this.name;}

    public double getPrice() {return this.price;}

    public int getInStock() {return this.inStock;}

    public int getMin() {return this.min;}

    public int getMax() {return this.max;}

}
