/**
 * Ex2. Assume an abstract class Student with two subclasses UGStudent and PGStudent. 
 * All the classes have the field variables String name and String registrationNumber.
 * 
 * @author William Downs
 * @version 18/11/15
 */
public abstract class Student {

	String name;
    String registrationNumber;
	
    public Student (String name, String registrationNumber){
    	this.name = name;
    	this.registrationNumber = registrationNumber;
    }  
}
    
