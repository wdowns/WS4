import java.util.Calendar;
import java.util.Date;
/**
 * Some goods are perishable, they go in addition with a bestBeforeDay in form of 
 * a single int standing for the day of the year until they are fine.
 * According to company policy such goods must not be shipped out after 14 days
 * before the bestBeforeDay. For perishable goods you should write a method
 * public boolean sellable() that checks whether the good can still be sold today.
 * 
 * @author William Downs
 * @version 20/11/15
 */
public class PerishableGoods extends CompanyGoods {

	PerishableGoods(String orderCode, int price, boolean availability) {
		super(orderCode, price, availability);
		
	}

	public static int today() { // A calendar instance which returns todays date.

		Date today = Calendar.getInstance().getTime();

		System.out.println(today); // Print out today's date.
		return 0;
	}

	public int bestBeforeDay() { // Find best before day
		return (PerishableGoods.today());
	}

	public boolean sellable() { // Checks whether goods can still be sold today.
        if (bestBeforeDay() >= today() + 14)
		return true;
        else
        	return false;
	}

@Override
	public String toString() {
		return "PerishableGoods []";
	}

}
