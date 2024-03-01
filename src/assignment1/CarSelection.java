package assignment1;

/**
 * CarSelection is a base class to be extended for a vehicle purchase
 * process, which is also named as Assignment 1. It contains a method to to calculate
 * a vehicle price. It also contains a function that uses a wrong formula
 * to calculate a vehicle's price.
 * 
 * @version 1.0
 */
public class CarSelection {
    
    /**
     * This method returns the price of a vehicle of a particular model based on
     * its base price, upgrade coefficient, and color choice.
     * 
     * @param basePrice the base price of the vehicle
     * @param upgradeCoefficient the upgrade coefficient of the vehicle
     * @param colorIndex the color index of the vehicle
     * @return the calculated price of the vehicle
     */
    public double calculateCarPrice(double basePrice, double upgradeCoefficient, double colorIndex) {
        return basePrice * upgradeCoefficient + colorIndex;
    }
    
    /**
     * This method incorrectly calculates the price of a vehicle using an incorrect formula.
     * 
     * @param basePrice the base price of the vehicle
     * @param upgradeCoefficient the upgrade coefficient of the vehicle
     * @param colorIndex the color index of the vehicle
     * @return the incorrectly calculated price of the vehicle
     */
    public double incorrectCarPrice(double basePrice, double upgradeCoefficient, double colorIndex) {
        return basePrice + upgradeCoefficient + colorIndex;
    }

}
