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
public class book extends Publications{
    private int page_count;
    public book(){
        super();
        page_count = 1;
    }
    public book(String t, double p, int page_count){
        super(t, p);
        this.page_count = page_count;
    }
    public void setPC(int pc){
        page_count = pc;
    }
    public int getPC(){
        return page_count;
    }
    public void DiplayBook(){
        super.Display();
        System.out.println("\nPage Count of the book is:\t"+page_count);
    }
    
}
