// Find the Highest value in a Circular Queue

import java.util.*;
public class CircularQueue_FindHighest {

    int ar[];
    int front,rear;
    int high = 0;

    CircularQueue_FindHighest() {
        ar = new int [5];
        front=rear=-1;
    }

    int checkHighest(int data){
        int def = high;
        if(data > def){
            def = data;
        }
        return def;
    }

    void insert() {
        if ((front==0 && rear==4) || (rear==front-1)){
            System.out.println("Circular Queue is full!!!");
        }
        else{
            System.out.println("Enter data...");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            if (front==-1) { front=0; }
            if (rear<4) { rear+=1; }
            else if (rear==4 && front!=0) { rear=0; }
            ar[rear]=data;
            high = checkHighest(data);
            System.out.println("data inserted...");
        }
    }
    void checkBecauseOfDeletion(){
        try {
            if(high == ar[front]){
                high = ar[front+1];
            }
        }
        catch (Exception e){
            high = 0;
        }

    }

    void delete() {
        if (front==-1 || rear==-1)
            System.out.println("Circular Queue is empty!!!");
        else {
            if (front==rear){
                System.out.println(" deleted : " + ar[front]);
                checkBecauseOfDeletion();
                front=rear=-1;
            }
            else if (front<rear){
                System.out.println("deleted : " + ar[front]);
                checkBecauseOfDeletion();
                front+=1;
            }
            else if(front==4){
                System.out.println("deleted : " + ar[front]);
                checkBecauseOfDeletion();
                front=0;
            }
            else if (rear<front){
                System.out.println("deleted : " + ar[front] );
                checkBecauseOfDeletion();
                front+=1;
            }
        }
    }

    void findHighest(){
        System.out.println("\nHighest Value is: " + high);
        System.out.println();
    }

    void traverse() {
        if (front==-1 || rear==-1){
            System.out.println("Circular Queue is empty!!!");
        }
        else {
            if (front<=rear){
                for (int i = front; i<=rear; i++){
                    System.out.print(" "+ar[i]);
                }
            }
            else {
                for (int i=front;i<=4;i++)
                {
                    System.out.print(" "+ar[i]);
                }
                for (int i=0;i<=rear;i++){
                    System.out.print(" "+ar[i]);
                }
            }
        }

    }

    public static void main(String[] args) {
        CircularQueue_FindHighest obj = new CircularQueue_FindHighest();
        while (true) {
            System.out.println("\nPress 1 for insert!");
            System.out.println("Press 2 for delete!");
            System.out.println("Press 3 for traverse!");
            System.out.println("Press 4 for Find Highest!");
            System.out.println("Press 5 for exit!");

            System.out.println("Enter your choice....");
            Scanner sc2 = new Scanner(System.in);
            int ch = sc2.nextInt();

            switch (ch) {
                case 1 -> obj.insert();
                case 2 -> obj.delete();
                case 3 -> obj.traverse();
                case 4 -> obj.findHighest();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid Choice!!!");
            }
        }
    }
}
