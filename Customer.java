import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    public static void customer() {

        //Ask the user for the package name
        Scanner askPropertyName = new Scanner(System.in);
        System.out.println("Which property is the package for?");

        //Confirm package has been received by the user
        ArrayList<String> propertyList = new ArrayList<String>();
        propertyList.add(askPropertyName.nextLine());
        System.out.print("Package from " + propertyList + " has been received. \n");
        System.out.println("Have a nice day!");

    }

    public static void main(String[] args) {
        customer();
    }
}

