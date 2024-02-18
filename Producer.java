public class Producer implements Runnable{
    Queue q;
    Thread t;
    public Producer(Queue q){
        this.q = q;
        t = new Thread(this, "Producer Thread");
    }
    @Override
    public void run(){
        int i = 0;
        while(true){
            q.setNumber(i++);
        }
    }
}