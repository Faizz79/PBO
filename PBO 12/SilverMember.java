package rentalconsole;

/**
 *
 * @author Predator
 */
public class SilverMember extends Others {
    
    // atribut
    protected int rentCost, point, disc, tempCost, discountAmount, totalCost;
    
    
    // constructor
    SilverMember() {
        this.rentCost = 25000;
        this.point = 1;
        this.disc = 1;
    }
    
    protected int costAmount(int rentalDuration) {
        
        tempCost = rentalDuration * rentCost;
        discountAmount = (tempCost * disc) / 100;
        totalCost = tempCost - discountAmount;
        
        return totalCost;
    }
    
    protected int getPoint(int rentalDuration) {
        
        int totalPoint = rentalDuration * point;
        return totalPoint;
    }
    
}