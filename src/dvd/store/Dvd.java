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
public class Dvd {
    
    private String title;
    private String category;
    private boolean newRelease;
    private double price;
    private boolean availableForRent;
    
    
    public Dvd(){

    }
    
    public Dvd(String newTitle, String newCategory, boolean newNewRelease, double newPrice, boolean newAvailableForRent){
        
    title = newTitle;
    category = newCategory;
    newRelease = newNewRelease;
    price = newPrice;
    availableForRent = newAvailableForRent;
        
    }
    
    public void setTitle(String newTitle){
        title = newTitle;
    }
    
    public void setCategory(String newCategory){
        category = newCategory;
    }
    
    public void setNewRelease(boolean newNewRelease){
        newRelease = newNewRelease;
    }
    
    private void setPrice(double newPrice){
        price = newPrice;
    }
    
    public void setAvailableForRent(boolean newAvailableForRent){
        availableForRent = newAvailableForRent;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getCategory(){
        return category;
    }
    
    public boolean isNewRelease(){
        return newRelease;
    }
    
    public double getPrice(){
        return price;
    }
    
    public boolean isAvailableForRent(){
        return availableForRent;
    }
    
    @Override
    public String toString(){
    return "Title: " + title + "\nCategory: " + category + "\nNew Release: " + newRelease + "\nPrice: " + price + "\nAvailable For Rent: " + availableForRent;
    }
    
}
