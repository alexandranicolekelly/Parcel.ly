public class Package {

    public static int packageItemNumber;

    //instance variables
    boolean hasShipped;
    int numberOfBoxes;
    int numberOfItems;

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
