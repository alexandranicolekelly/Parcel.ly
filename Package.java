public class Package {

    //instance variables
    int orderNumber;
    String receiver;
    String owner;
    String product;
    boolean hasShipped;
    int numberOfBoxes;
    int numberOfItems;

    public int getOrderNumber(){
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getReceiver(){
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProduct(){
        return product;
    }

    public boolean getHasShipped() {
        return hasShipped;
    }

    public void setHasShipped(boolean hasShipped) {
        this.hasShipped = hasShipped;
    }

    public int getNumberOfBoxes(){
        return numberOfBoxes;
    }

    public void setNumberOfBoxes(int numberOfBoxes) {
        this.numberOfBoxes = numberOfBoxes;
    }

    public int getNumberOfItems(){
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public Package (boolean hasShipped, int numberOfBoxes, int numberOfItems) {
        this.hasShipped = hasShipped;
        this.numberOfBoxes =numberOfBoxes;
        this.numberOfItems = numberOfItems;
    }
}