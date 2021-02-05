import java.util.Scanner;

public class User {
    public static void username() {

        // Ask the user to create a username
        System.out.println("You will now be asked to create a username and password.");
        Scanner loginUser = new Scanner(System.in);
        System.out.println("Please create a username: ");

        // Print out username
        String userName = loginUser.nextLine();
        System.out.print("Your username is: " + userName + ".\n");
    }

    public static void password() {
        // Ask the user to create a password
        Scanner loginPassword = new Scanner(System.in);
        System.out.println("Please create a password: ");
        String password = loginPassword.nextLine();
        Scanner loginPasswordConfirmed = new Scanner(System.in);
        System.out.println("Please re-enter your password to confirm: ");
        String confirmedPassword = loginPasswordConfirmed.nextLine();


        int i = 0;
        while (i < 3) {
            if (password.equals(confirmedPassword)) {
                System.out.print("Password has been created.\n");
                break;
            } else {
                System.out.println("Passwords did not match. Please try again.");
                System.out.println("Please re-enter your password to confirm: ");
                confirmedPassword = loginPassword.nextLine();
                i++;
            }
        }
    }

    public static void main (String[]args){
        username();
        password();
    }
}
