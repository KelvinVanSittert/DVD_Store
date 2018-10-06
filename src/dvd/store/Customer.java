/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd.store;

/**
 *
 * @author Kelvin
 */
public class Customer {
    
    private String firstName;
    private String surname;
    private String phoneNumber;
    private double credit;
    private boolean canRent;
    private String movieRented;
    
    public Customer(){
        
    }
    
    public Customer(String newFirstName, String newSurname, String newPhoneNumber, double newCredit, boolean newCanRent){
        
    firstName = newFirstName;
    surname = newSurname;
    phoneNumber = newPhoneNumber;
    credit = newCredit;
    canRent = newCanRent;
        
    }
    
    public void setMovieRented(String newMovieRented){
        movieRented = newMovieRented;
    }
    
    public void setFirstName(String newFirstName){
    firstName = newFirstName;
    
    }
    
    public void setSurname(String newSurname){
    surname = newSurname;
    
    }
    
    public void setPhoneNumber(String newPhoneNumber){
    phoneNumber = newPhoneNumber;
    
    }
    
    public void setCredit(double newCredit){
    credit = newCredit;
    
    }
    
    public void setCanRent(boolean newCanRent){
    canRent = newCanRent;
    
    }
    
    public String getMovieRented(){
        return movieRented;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public double getCredit(){
        return credit;
    }
    
    public boolean canRent(){
        return canRent;
    }
    
    
    
    @Override
    public String toString(){
        return "First Name: " + firstName + "\nSurname: " + surname + "\nPhone Number: " + phoneNumber + "\nCredit: " + credit + "\nCan Rent: " + canRent;
    }
    
    public void addCredit(double newCredit){
        credit = credit + newCredit;
    }
    
}
