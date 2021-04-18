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
public class Computer {
    public int wordsize, memorysize, storagesize, speed;
    public Computer(){
        wordsize = 8;
        memorysize = 4069;
        storagesize = 131072;
        speed = 2400;
    }
    public Computer(int a, int b, int c, int d){
        wordsize = a;
        memorysize = b;
        storagesize = c;
        speed = d;
    }
    public void Display(){
        
        System.out.println("Word-Size:\t"+wordsize+" bits"+"\nMemory:\t"+memorysize+" MBs"+"\nStorage Size:\t"+storagesize+" MBs"+"\nClock Speed:\t"+speed+" MHz");
        
    }
}
