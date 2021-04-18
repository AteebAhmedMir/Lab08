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
public class Faculty extends Employee {
    private String office_hours;
    private String rank;
    public Faculty(){
        super();
        office_hours = "eight";
        rank = "rookie";
    }
    public Faculty(String a, String b, String c, int d, String e, int f, java.util.Date g, String h, String i){
        super(a, b, c, d, e, f, g);
        office_hours = h;
        rank = i;
        
    }
    public void setOfficeHours(String h){
        office_hours = h;
    }
    public String getOfficeHours(){
        return office_hours;
    }
    public void setRank(String i){
        rank = i;
    }
    public String getRank(){
        return rank;
    }
    public void DiplayFac(){
        super.DisplayEmp();
        System.out.println("\nOffice Hours: "+office_hours+"\nEmployee Rank: "+rank);
    }
}
