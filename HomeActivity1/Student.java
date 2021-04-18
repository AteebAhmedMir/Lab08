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
public class Student extends Person {
    private String status;
    public Student(){
        super();
        status = "you teasing me you naughty naughty";
    }
    public Student(String a, String b, String c, int d, String e){
        super(a, b, c, d);
        status = e;
    }
    public void setStatus(String e){
        status = e;
        
    }
    public String getStatus(){
        return status;
    }
    public void DisplayStu(){
        super.Display();
        System.out.println("\nThe status of the person is: "+status);
    }
    
}
