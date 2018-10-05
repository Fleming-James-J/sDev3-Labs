/*
Employee Class subclass of StaffMember
 */
package testcompany;

/**
 * James Fleming
 * @author x00149830
 */
public class Employee extends StaffMember {
    //Variables
    private String rsiNumber;
    protected double rateOfPay;
    
    //Overloaded Constructor
    public Employee(String nameIN, String addressIN, String phoneNoIN, String rsiNumberIN, double rateOfPayIN)
    {
        super(nameIN,addressIN,phoneNoIN);
        this.rsiNumber = rsiNumberIN;
        this.rateOfPay = rateOfPayIN;
    }
    
    //Overridden methods
    @Override
    public String toString()
    {
       return ("Name: "+this.name+"\nAddress: "+this.address+"\nPhone: "+this.phoneNo+"\nRSI Number: "+this.rsiNumber+"\n");
    }
    
    //pay method overwritten
    @Override
    public double pay()
    {
        return this.rateOfPay;
    }
}
