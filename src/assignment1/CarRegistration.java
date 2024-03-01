package assignment1;

/*
 * This class extends the base class CarSelection.
 */
public class CarRegistration extends CarSelection {
    // variable to hold the buyer's first name
    private double basePrice;
    private double upgradeCoefficient; // value range: 1(no upgrade) to 2 (highest level upgrade)
    private double colorIndex; // value range: 0 (default color) to 5000
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private String occupation;
    private double yearlyIncome;
    // The approved variable stores true/false depending on whether a customer is approved or not for a loan, respectively
    private boolean approved;

    private int customerAge;


    public static int currentYear = 2024;

    /*
     * Constructor to instantiate a car registration object of the class
     *
     * @param basePrice the base price of the car
     * @param upgradeCoefficient the upgrade coefficient of the car
     * @param colorIndex the color index of the car
     * @param firstName the first name of the buyer
     * @param lastName the last name of the buyer
     * @param gender the gender of the buyer
     * @param birthYear the birth year of the buyer
     * @param occupation the occupation of the buyer
     * @param yearlyIncome the yearly income of the buyer
     */
    public CarRegistration(double basePrice, double upgradeCoefficient,
                           double colorIndex, String firstName, String lastName, String gender, int birthYear, String
                                   occupation, double yearlyIncome) {
        // To Do: complete the constructor
        super();
        this.basePrice = basePrice;
        this.upgradeCoefficient = upgradeCoefficient;
        this.colorIndex = colorIndex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.setOccupation(occupation);
        this.yearlyIncome = yearlyIncome;

    }

    // To Do: add appropriate setter and getter methods

    /**
     * Getter method to retrieve the buyer's first name
     *
     * @return the buyer's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter method to set the buyer's first name
     *
     * @param firstName the buyer's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter method to retrieve the buyer's last name
     *
     * @return the buyer's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method to set the buyer's last name
     *
     * @param lastName the buyer's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Getter method to retrieve the buyer's gender
     *
     * @return the buyer's gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter method to set the buyer's gender
     *
     * @param gender the buyer's gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter method to retrieve the buyer's birth year
     *
     * @return the buyer's birth year
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Setter method to set the buyer's birth year
     *
     * @param birthYear the buyer's birth year
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * Getter method to retrieve the buyer's yearly income
     *
     * @return the buyer's yearly income
     */
    public double getYearlyIncome() {
        return yearlyIncome;
    }

    /**
     * Setter method to set the buyer's yearly income
     *
     * @param yearlyIncome the buyer's yearly income
     */
    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    /*
     * This method calculates a customer's age
     */
    public int getCustomerAge() {
        int currentYear = 2024;
        int customerAge = currentYear - birthYear;
        return customerAge;
    }

    /*
     * This function checks whether a customer is eligible to purchase the car
     * and prints out a message about it.
     * To Do: a car's price should not be more than 20% of the customer's yearly
     * salary. Implement the method below accordingly.
     */

    /**
     * Checks if the customer is pre-approved to purchase the car based on their yearly income.
     *
     * @return true if pre-approved, false otherwise
     */
    public boolean isPreApproved() {

        double maxPrice = yearlyIncome * 0.20;
        double totalPrice = calculateCarPrice(basePrice, upgradeCoefficient, colorIndex);

        boolean preApproved = totalPrice <= maxPrice;
        if (preApproved) {
            System.out.println("Congratulations! You are pre-approved to purchase the car.");

        } else {
            System.out.println("Unfortunately you did not qualify to purchase the car.");
        }
        return preApproved;
    }

    /*
     * This function check if a customer is eligible to drive and prints a relevant message.
     * To Do: a customer's age should be at least 16 years to be eligible to drive.
     */

    /**
     * Checks if the customer is eligible to drive based on their age.
     */
    public void isEligibleToDrive() {
        if (customerAge >= 16) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("Unfortunately, You are ineligible to drive.");
        }
    }

    /*
     * This function prints the customer’s information
     */

    /**
     * Displays the customer's information including name, gender, birth year, and eligibility to drive and purchase the car.
     */
    public void displayCustomerInfo() {
        /*
         * print out the customer's following information
         * first name, last name
         * gender
         * age
         * birth year
         * eligibility to drive
         * eligibility to purchase the car
         */

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender:  " + gender);
        System.out.println("Birth Year: " + birthYear);

        isEligibleToDrive();
        isPreApproved();
    }

    /**
     * Getter method to retrieve the buyer's occupation
     *
     * @return the buyer's occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Setter method to set the buyer's occupation
     *
     * @param occupation the buyer's occupation
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


    /**
     * Getter method to retrieve the approval status of the buyer
     *
     * @return true if approved, false otherwise
     */
    public boolean isApproved() {
        return approved;
    }
}