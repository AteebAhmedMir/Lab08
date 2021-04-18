/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

/**
 *
 * @author Rizwan Ali
 */
public class Laptop extends Computer{
    public double length, width, height, weight;
    public Laptop(){
        super();
        length = 1.0;
        width = 1.0;
        height = 1.0;
        weight = 1.0;
    }
    public Laptop(int a, int b, int c, int d,double length,double width,double height,double weight ){
        super(a,b,c,d);
        this.length = length ;
        this.width = width ;
        this.height = height ;
        this.weight = weight ;
    }
    public void diplayLaptop(){
        super.Display();
        System.out.println("The dimensions of the Laptop are as follows: ");
        System.out.println("Length:\t"+length+"inches"+"\nWidth:\t"+width+"inches"+"\nHeight:\t"+height+"inches"+"\nWeight\t"+weight+"kg");
    }
        
        
       

    
}
