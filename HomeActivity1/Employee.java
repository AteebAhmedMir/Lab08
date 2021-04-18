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
public class Employee extends Person {
    protected String office;
    protected int salary;
    protected java.util.Date date_hired = new java.util.Date();
    public Employee(){
        super();
        office = "Islamabad outlet";
        salary = 50000;
        
    }
    public Employee(String a, String b, String c, int d, String e, int f, java.util.Date g){
        super(a,b,c,d);
        office = e;
        salary = f;
        date_hired = g;
    }
    public void setOffice(String e){
        office = e;
    }
    public String getOffice(){
        return office;
    }
    public void setSalary(String f){
        office = f;
    }
    public int getSalary(){
        return salary;
    }
    public void setDate(java.util.Date g){
        date_hired = g;
    }
    public java.util.Date getDate(){
        return date_hired;
    }
    public void DisplayEmp(){
        super.Display();
        System.out.println("\nOffice: "+office+"\nSalary: "+salary+"\nDate Hired: "+date_hired);
    }   
    
}
