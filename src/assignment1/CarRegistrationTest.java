package assignment1;

import java.util.Scanner;

/**
 * This class is used to test the functionality of the CarRegistration class.
 */
public class CarRegistrationTest {

    /**
     * The main method for testing the CarRegistration class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName  =  scanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println ("What is your gender?");
        String gender = scanner.nextLine();

        System.out.println("What's your year of birth? " );
        int birthYear = scanner.nextInt();

        System.out.println("What is your yearly income? " );
        double yearlyIncome =  scanner.nextDouble();


        CarRegistration c = new CarRegistration(0, 0, 0, firstName, lastName, gender, birthYear, "", yearlyIncome);

        System.out.println ("Custoemr Info :");

        System.out.println ("First Name: " + c.getFirstName());

        System.out.println ("Last Name: " + c.getLastName());

        System.out.println ("Gender:" + c.getGender());

        System.out.println ("Gender:" + c.getBirthYear());

        System.out.println ("Gender:" + c.getYearlyIncome());

        c.isEligibleToDrive();
        c.isPreApproved();
        scanner.close();
    }
}
