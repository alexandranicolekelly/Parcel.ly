/**
 * <h1>Parcel.ly</h1>
 * A test program for the Parcel.ly project
 *
 * @author  Alexandra Kelly
 * @version 1.0
 * @since 12/17/2020
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Parcel.ly!");
        System.out.println("You will now be asked to create a username and password.");

        // Ask the user to create a username
        Scanner loginUser = new Scanner(System.in);
        System.out.println("Please create a username: ");

        // Print out username
        String userName = loginUser.nextLine();
        System.out.printf("Your username is: " + userName + ".\n");

        // Ask the user to create a password
        Scanner loginPassword = new Scanner(System.in);
        System.out.println("Please create a password: ");
        String password = loginPassword.nextLine();
        System.out.println("Please re-enter your password to confirm: ");
        String confirmedPassword = loginPassword.nextLine();

        // Confirm password was entered correctly and created
        if (password.equals(confirmedPassword)) {
            System.out.printf("Password for " + userName + " has been created.\n");
        }
        else{
            System.out.println("Passwords did not match. Please try again.");
        }

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
                System.out.printf("You have received " + packageNumber + " package today.\n");

                //Ask the user for the package name
                Scanner askPackageName = new Scanner(System.in);
                System.out.println("What is the name of the package?");

                //Confirm package has been received by the user
                String packageName = askPackageName.nextLine();
                System.out.printf("Package " + packageName + " has been received by " + userName + ".\n");
                System.out.println("Have a nice day!");
            }
            else if (packageNumber >= 2){
                System.out.printf("You have received " + packageNumber + " packages today.\n");

                //Ask the user for the names of the packages
                Scanner askPackageName = new Scanner(System.in);
                System.out.println("What are the names of the packages?");

                //Confirm  the packages have been received by the user.
                String packageName = askPackageName.nextLine();
                System.out.printf("Packages " + packageName + " have been received by " + userName + ".\n");
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

    }
}
