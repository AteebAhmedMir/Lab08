
package Assignment_1;

import java.util.*;

public class RunnerP {
    public static void main(String[] args) {
        
        Scanner Obj = new Scanner(System.in);
        
        
        System.out.println("Please enter the name of the book: ");
        String bookName = Obj.next();
        System.out.println("Enter the price of the book: ");
        double priceBook  = Obj.nextDouble();        
        System.out.println("Please enter the page number of the book and press enter: ");
        int page_count = Obj.nextInt();
        book b1 = new book(bookName, priceBook, page_count);
        b1.DiplayBook();
        
        
        System.out.println("Plese enter the name of the tape: ");
        String Tapename = Obj.next();
        System.out.println("Please Enter the price of the tape: ");
        double priceTape = Obj.nextDouble();
        System.out.println("Please enter the playing time of the tape in minutes and press enter: ");
        int playing_time = Obj.nextInt();
        tape t1 = new tape(Tapename, priceTape, playing_time);
        t1.DiplayTapes();
        
        
    }
    
}
