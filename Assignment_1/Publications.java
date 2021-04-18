/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

/**
 *
 * @author Rizwan Ali
 */
public class Publications {
    protected String title;
    protected double price;
    public Publications(){
        title = "Bum Bum Chao Chao";
        price = 499.99;
    }
    public Publications(String title, double price){
        this.title = title;
        this.price = price;
    }
    public void setTitle(String t){
        title = t;
    }
    public String getTitle(){
        return title;
    }
    public void setPrice(double p){
        price = p;
    }
    public double getPrice(){
        return price;
    }
    public void Display(){
        System.out.println("Book Details"+"\nTitle:\t\t"+title+"\nPrice:\t\t"+price+" RS." );
    }
    
}
