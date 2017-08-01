/**
 * (Ex.3) A manufacturing company produces
 * several types of goods. Each good goes with an orderCode, a price, and its 
 * availability (of types String, int, and boolean, respectively). Some goods 
 * are perishable, they go in addition with a bestBeforeDay in form of a single 
 * int standing for the day of the year until they are fine.
 * According to company policy such goods must not be shipped out after 14 days
 * before the bestBeforeDay. For perishable goods you should write a method
 * public boolean sellable() that checks whether the good can still be sold today.
 * 
 * @author William Downs
 * @version 19/11/15
 */
public class CompanyGoods {

	    private String orderCode; 
	    private int price;
	    private boolean availability;
    
	CompanyGoods (String orderCode,int price, boolean availability ) {
		this.orderCode = orderCode;
		this.price = price;
		this.availability = availability;
	}

    public String getOrderCode() {
		return orderCode;
	}



	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public boolean isAvailability() {
		return availability;
	}



	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "CompanyGoods [orderCode=" + orderCode + ", price=" + price
				+ ", availability=" + availability + "]";
	}
	
}
