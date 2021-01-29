/**
  <h1>Parcel.ly</h1>
  A test program for the Parcel.ly project

  @author  Alexandra Kelly
 * @version 1.3
 * @since 1/29/2021
*/

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Print greeting with date
        long millis=System.currentTimeMillis();
        Date date=new Date(millis);
        System.out.printf("Welcome to Parcel.ly! Today's date is " + date + ".\n");

        System.out.println("");

        // Ask the user to create a username
        System.out.println("You will now be asked to create a username and password.");
        Scanner loginUser = new Scanner(System.in);
        System.out.println("Please create a username: ");

        // Print out username
        String userName = loginUser.nextLine();
        System.out.print("Your username is: " + userName + ".\n");

        // Ask the user to create a password
        Scanner loginPassword = new Scanner(System.in);
        System.out.println("Please create a password: ");
        String password = loginPassword.nextLine();
        System.out.println("Please re-enter your password to confirm: ");
        String confirmedPassword = loginPassword.nextLine();

        // Confirm password was entered correctly and created
        int i = 0;
        while (i < 3) {
            if (password.equals(confirmedPassword)) {
                System.out.print("Password for " + userName + " has been created.\n");
                break;
            } else {
                System.out.println("Passwords did not match. Please try again.");
                System.out.println("Please re-enter your password to confirm: ");
                confirmedPassword = loginPassword.nextLine();
                i++;
            }
        }

        System.out.println("");

        //Ask the user if they have received any packages
        Scanner packageCheck = new Scanner(System.in);
        System.out.println("Did you receive any packages today? Please respond with either Yes or No.");
        String packageInput = packageCheck.nextLine();

        // Create output for each response
        if (packageInput.equals("Yes")) {
            System.out.println("You have received packages.\n");
            Scanner askPackageNumber = new Scanner(System.in);
            System.out.println("How many packages have you received today? Please enter a positive integer.");
            int packageNumber = askPackageNumber.nextInt();

            // Nested if statement for number of packages
            if (packageNumber == 1){
                System.out.print("You have received " + packageNumber + " package today.\n");

                //Ask the user for the package name
                Scanner askPropertyName = new Scanner(System.in);
                System.out.println("Which property is the package for?");

                //Confirm package has been received by the user
                ArrayList<String> propertyList = new ArrayList<String>();
                propertyList.add(askPropertyName.nextLine()); // Going to create a for loop that asks for each property individually
                System.out.print("Package from " + propertyList + " has been received by " + userName + ".\n");
                System.out.println("Have a nice day!");
            }
            else if (packageNumber >= 2){
                System.out.print("You have received " + packageNumber + " packages today.\n");

                //Ask the user for the names of the packages
                Scanner askPropertyName = new Scanner(System.in);
                System.out.println("Which properties are the packages for?");


                //Confirm  the packages have been received by the user.
                ArrayList<String> propertyList = new ArrayList<String>();
                propertyList.add(askPropertyName.nextLine()); // Going to create a for loop that asks for each property individually
                System.out.print("Packages from " + propertyList + " have been received by " + userName + ".\n");
                System.out.println("Have a nice day!");
            }
            else {
                System.out.println("Please enter a positive integer.");
            }
        }
        else if (packageInput.equals("No")) {
            System.out.println("You have not received any packages. Have a nice day!\n");
        }
        else {
            System.out.println("Invalid Response. Please answer using either Yes or No.\n");
        }

        /* Practice with objects - will expand on
        Package insertName = new Package(true, 1, 3);
        System.out.printf("Property has %d item(s) in %d box(es) and %s been shipped",
                insertName.getNumberOfItems(),
                insertName.getNumberOfBoxes(),
                (insertName.getHasShipped() )?"has":"has not");
        */
    }
}
