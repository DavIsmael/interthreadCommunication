public class Consumer implements Runnable{
    Thread t;
    Queue q;
    int[] amountOfNumbers;
    public Consumer(Queue q, int[] amountOfNumbers){
        this.q = q;
        t = new Thread(this, "Consumer Thread");
        this.amountOfNumbers = amountOfNumbers;
    }
    @Override
    public void run(){
        for(int i = 0; i < amountOfNumbers.length; ++i){
            q.getNumber();
        }
    }
}
