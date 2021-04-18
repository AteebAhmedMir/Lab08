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
public class Runner {
    public static void main(String[] args) {
        Student s1 = new Student("Ahmed", "House#70, Street 3", "gamerboy1997@gmail.com", 0321, "Bachelours");
        s1.DisplayStu();
        
        Employee e1 = new Employee();
        e1.DisplayEmp();
        
        Faculty f1 = new Faculty();
        f1.DiplayFac();
        
        Staff st1 = new Staff();
        st1.DiplaySta();
    }
    
}
