public class Main{
    public static void main(String[] args){
        Queue queue = new Queue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        producer.t.start();
        consumer.t.start();
    }
}