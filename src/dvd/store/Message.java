/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd.store;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jaco
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    private ArrayList<Customer> Customers;
    private ArrayList<DVD> DVDs;
    private ArrayList<Rental> Rentals;
    private Customer Customer;
    private DVD DVD;
    private Rental Rental;
    private Action ActionToPerform;
    private Target TargetToPerformActionTo;
    private String Statement;   
    
    public enum Action {
        Update,
        Insert,
        Get
    }
    
    public enum Target {
        Customer,
        DVD,
        Rental
    }
    
    
    public <E> Message(ArrayList<E> list, Action action, Target target, String statement ){
        
        if(target == Target.Customer)
           this.Customers = (ArrayList<Customer>)list;
        if(target == Target.DVD)
           this.DVDs = (ArrayList<DVD>)list; 
        if(target == Target.Rental)
           this.Rentals = (ArrayList<Rental>)list; 

        this.ActionToPerform = action;
        this.TargetToPerformActionTo = target;
        this.Statement = statement;
    }
    
    public Message(Customer customer, Action action, Target target, String statement ){
        this.Customer = customer; 
        this.ActionToPerform = action;
        this.TargetToPerformActionTo = target;
        this.Statement = statement;
    }
    
    public Message(DVD dvd, Action action, Target target, String statement ){
        this.DVD = dvd; 
        this.ActionToPerform = action;
        this.TargetToPerformActionTo = target;
        this.Statement = statement;
    }
    
    public Message(Rental rental, Action action, Target target, String statement ){
        this.Rental = rental; 
        this.ActionToPerform = action;
        this.TargetToPerformActionTo = target;
        this.Statement = statement;
    }    

    public ArrayList<Customer> getCustomers() { return Customers;};
    public ArrayList<DVD> getDVDs() { return DVDs;};
    public ArrayList<Rental> getRentals() { return Rentals;};
    public Customer getCustomer() { return Customer; }
    public DVD getDVD() { return DVD; }
    public Rental getRental() { return Rental; }
    public Action getAction() { return ActionToPerform; }
    public Target getTarget() { return TargetToPerformActionTo; }
    public String getStatement() { return Statement; }
    
    public void setCustomers(ArrayList<Customer> customers) { this.Customers = customers;};
    public void setDVDs(ArrayList<DVD> dVDs) { this.DVDs = dVDs;};
    public void setRentals(ArrayList<Rental> rentals) { this.Rentals = rentals;};
    public void setCustomer(Customer customer) { this.Customer = customer; }
    public void setDVD(DVD dVD) { this.DVD = dVD ; }
    public void setRental(Rental rental) { this.Rental = rental; }
    public void setAction(Action action) { this.ActionToPerform = action; }
    public void setTarget(Target target) { this.TargetToPerformActionTo = target; }
    public void setStatement(String statement) { this.Statement = statement; }

}
