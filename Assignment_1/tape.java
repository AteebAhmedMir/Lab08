
package Assignment_1;


public class tape extends Publications{
    private int playing_time;
    public tape(){
        super();
        playing_time = 01;
    }
    public tape(String t, double p, int playing_time){
        super(t, p);
        this.playing_time = playing_time;
    }
    public void setPT(int pt){
        playing_time = pt;
    }
    public int getPT(){
        return playing_time;
    }
    public void DiplayTapes(){
        super.Display();
        System.out.println("\nPlaying Time of the tape is:\t\t"+playing_time+" min");
    } 
    
}
