/*
Hourly Class which is a subclass of Employee
 */
package testcompany;

/**
 * James Fleming
 * @author x00149830
 */
public class Hourly extends Employee{
    //variables
    private int hoursWorked;
    
    //overloaded constructor
    public Hourly(String nameIN, String addressIN, String phoneNoIN, String rsiNumberIN, double rateOfPayIN)
    {
        super(nameIN, addressIN, phoneNoIN, rsiNumberIN, rateOfPayIN);
        this.hoursWorked = 0;
    }
    
    public void addHours(int hoursIN)
    {
        this.hoursWorked += hoursIN;
    }
    
    //overridden methods
    //overriding pay method
    @Override
    public double pay()
    {
        double wage = 0.0;
        if(hoursWorked <= 40)
        {
            wage = this.hoursWorked * this.rateOfPay;
        }
        else if (hoursWorked > 40)
        {
            wage = 40*(this.hoursWorked * this.rateOfPay) + (hoursWorked - 40)*((this.hoursWorked * this.rateOfPay)*1.5);
        }
        return wage;
    }
    
    //overriding toString method
    @Override
    public String toString()
    {
       return super.toString();
    }
    
            
    
}
