package rentalconsole;

/**
 *
 * @author Predator
 */
public class GoldMember extends SilverMember {
    
    int cashback;
    
    GoldMember() {
        rentCost = 30000;
        point = 5;
        disc = 2;
        cashback = 5000;
    }
}