public class Producer implements Runnable{
    Thread t;
    Queue q;
    int[] amountOfNumbers;
    public Producer(Queue q, int[] amountOfNumbers){
        this.q = q;
        t = new Thread(this, "Producer Thread");
        this.amountOfNumbers = amountOfNumbers;
    }
    @Override
    public void run(){
        for(int i = 0; i < amountOfNumbers.length; ++i){
            q.setNumber(amountOfNumbers[i]);
        }
    }
}
