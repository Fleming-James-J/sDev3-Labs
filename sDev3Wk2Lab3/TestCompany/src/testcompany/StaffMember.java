/*
Staff Memeber Class
 */
package testcompany;

/**
 * James Fleming
 * @author x00149830
 */
public abstract class StaffMember {
    //Variables
    protected String name;
    protected String address;
    protected String phoneNo;
    
    //overloaded Constructor
    public StaffMember(String nameIN, String addressIN, String phoneNoIN)
    {
        this.name = nameIN;
        this.address = addressIN;
        this.phoneNo = phoneNoIN;
    }
    
    //Overriden methods
    @Override
    public String toString()
    {
        return ("Name: "+this.name+"\nAddress: "+this.address+"\nPhone: "+this.phoneNo+"\n");// not sure if another backslash n needed
    }
    
    //abstract pay method
    public abstract double pay();
}
