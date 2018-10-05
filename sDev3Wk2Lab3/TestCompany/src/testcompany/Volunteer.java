/*
Volunteer class that is a subclass of StaffMember
 */
package testcompany;

/**
 * James Fleming
 * @author x00149830
 */
public class Volunteer extends StaffMember {
    
    //Overloaded constructor
    public Volunteer(String nameIN, String addressIN, String phoneNoIN)
    {
       super(nameIN,addressIN,phoneNoIN);
    }
    
    //Overriding the pay method
    @Override
    public double pay()
    {
       return 0.0; 
    }
    
}
