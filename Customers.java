/**
 * The customers of the company are to be represented in a Customer class, consisting of
 * the field variables name, address and turnOver 
 * of types String, String and int, respectively. Some Customers have "goldStatus", 
 * since they have a turnover of more than 2000 pounds. They receive a 5% discount
 * on all prices. Implement a method public double toPay (int price) which applies
 * the discount to the price if appropriate.
 * 
 * @author William Downs
 * @version 19/11/15
 */
public class Customers {

	    
		private String name;
	    private String address;
	    private int turnOver;

	    /**
	     *  Constructor for Customers setting the three field variables.
	     *  @param name The name of the customers as a String.
	     *  @param address The postal address of the customer.
	     *  @param turnOver A turnOver of more than 2000 pounds.
	     */
	    public Customers (String name, String address,
	                     int turnOver){
	        this.name = name;
	        this.address = address;
	        this.turnOver = turnOver;
	    }

	   
	    public String getName(){
	        return name;
	    }

	   
	    public String getAddress(){
	        return address;
	    }

	    
	    public int getTurnOver(){
	        return turnOver;
	    }
	    public void setName(String name) {
			this.name = name;
		}


		public void setAddress(String address) {
			this.address = address;
		}

		public void setTurnOver(int turnOver) {
			this.turnOver = turnOver;
		}


		@Override
		public String toString() {
			return "Customers [name=" + name + ", address=" + address
					+ ", turnOver=" + turnOver + "]";
		}



}


