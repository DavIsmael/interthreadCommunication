/* Interthread Communication in Java */

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to produce and consume? ");
        int index = scanner.nextInt();
        int[] amountOfNumbers = new int[index];
        for(int i = 0; i < amountOfNumbers.length; ++i){
            System.out.print("Select a number: ");
            amountOfNumbers[i] = scanner.nextInt();
        }
        Queue q = new Queue();
        Producer producer = new Producer(q, amountOfNumbers);
        Consumer consumer = new Consumer(q, amountOfNumbers);
        producer.t.start();
        consumer.t.start();
    }
}