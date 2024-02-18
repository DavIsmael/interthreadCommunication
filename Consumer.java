public class Consumer implements Runnable{
    Queue q;
    Thread t;
    public Consumer(Queue q){
        this.q = q;
        t = new Thread(this, "Consumer Thread");
    }
    @Override
    public void run(){
        while(true){
            q.getNumber();
        }
    }
}