/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity1;

/**
 *
 * @author Rizwan Ali
 */
public class Staff extends Employee{
    private String title;
    
    public Staff(){
        super();
        title = "Senior Staff";
        
    }
    public Staff(String a, String b, String c, int d, String e, int f, java.util.Date g, String h){
        super(a, b, c, d, e, f, g);
        title = h;
        
        
    }
    public void setTitle(String h){
        title = h;
    }
    public String getTitle(){
        return title;
    }
   
    public void DiplaySta(){
        super.DisplayEmp();
        System.out.println("\nTitle: "+title);
    }
}
    

