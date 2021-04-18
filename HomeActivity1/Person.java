
package HomeActivity1;


public class Person {
    protected String name;
    protected String address;
    protected String email;
    protected int phone;
    public Person(){
        name = "Ateeb Ahmed";
        address = "House#1, Street#1, Islamabad";
        email = "xyz@gmail.com";
        phone = 1234;
    }
    public Person(String a, String b, String c, int d){
        name = a;
        address = b;
        email = c;
        phone = d;
    }
    public void setName(String a){
        name = a;
    }
    public String getName(){
        return name;
    }
    public void setaddress(String b){
        address = b;
    }
    public String getaddress(){
        return address;
    }
    public void setemail(String c){
        email = c;
    }
    public String getemail(){
        return email;
    }
    public void setphone(int d){
        phone = d;
    }
    public int getphone(){
        return phone;
    }
    public void Display(){
        System.out.println("\nName: "+name+"\nAddress:"+address+"\nE-mail: "+email+"\nPhone Number: "+phone);
    }
}
