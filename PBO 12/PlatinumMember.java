package rentalconsole;

/**
 *
 * @author Predator
 */
public class PlatinumMember extends GoldMember{
    
    int bonus;
    
    PlatinumMember() {
        rentCost = 45000;
        point = 10;
        disc = 3;
        cashback = 10000;
    }
    
    protected int getBonus(int rentalDuration) {
        
        bonus = rentalDuration * 5000;
        return bonus;
    }
}