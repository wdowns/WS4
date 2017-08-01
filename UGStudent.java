/**
 * Write an abstract method passedSWS(double examination, double cA, double team) 
 * of an appropriate type and write concrete methods in the two subclasses, which 
 * compute the final mark of a student on a module as a  weighted average of 70% 
 * of the examination, 20% of the continuous assessment, and 10% of the team 
 * project mark. A UG student passes the module if their overall mark is equal
 * to or greater than 40.
 * 
 * @author William Downs
 * @version 18/11/15
 */
public class UGStudent extends Student {
	
	String name;
	String registrationNumber;
	
	public UGStudent(String name, String registrationNumber) {
		super(name, registrationNumber);
		this.name = name;
		this.registrationNumber = registrationNumber;
	}
	// Calculate result
		public boolean passedSWS (double examination, double cA, double team) {
		 
			double result = (0.7 * examination) + (0.2 * cA) + (0.1 * team);
	// A UG student passes the module if their overall mark is equal
	// to or greater than 40.	 			
		 
		 		if (result  >= 40){
				return true;
		 		}
				else 
				return false;
			}
	}	
	
	
	
	
	
	
	
	
	
	
