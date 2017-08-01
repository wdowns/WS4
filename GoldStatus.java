/**
 * Some Customers have "goldStatus", since they have a turnover of more than
 * 2000 pounds. They receive a 5% discount on all prices. Implement a method
 * public double toPay (int price) which applies the discount to the price if
 * appropriate.
 * 
 * @author William Downs
 * @version 20/11/15
 */
public class GoldStatus extends Customers {

	public GoldStatus(String name, String address, int turnOver) {
		super(name, address, turnOver);

	}

	public double toPay(int price) { 

		if (getTurnOver() >= 2000) {// Find out if Customer is eligible
			                        // for GoldStatus.

		}
		return price / 100 * 5; // The discount % for GoldStatus Customers.
	}

	@Override
	public String toString() {
		return "GoldStatus []";
	}

}