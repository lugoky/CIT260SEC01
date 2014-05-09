/*
 * Try This 1-1
 * This program converts gallons to liters.
 * Call this program GalToLit.
 */

package galtolit;

/**
 *
 * @author kylugo
 */
public class GalToLit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons;
        double liters;
        
        gallons = 10;
        liters = gallons * 3.7854;
        
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
    
}
