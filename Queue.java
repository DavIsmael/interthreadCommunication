public class Queue {
    int number;
    boolean wait;
    synchronized public void getNumber(){
        if(!wait){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Getting number " + this.number);
        wait = false;
        notify();
    }
    synchronized public void setNumber(int number){
        if(wait){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        this.number = number;
        System.out.println("Setting number to " + this.number);
        wait = true;
        notify();
    }
}