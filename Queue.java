public class Queue {
    int number;
    boolean wait = false;
    synchronized public void getNumber(){
        if(!wait){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Getting number " + this.number);
        notify();
        wait = false;
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
        notify();
        wait = true;
    }

}