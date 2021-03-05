//Q-Find, How many even and odd no's in a stack by using linked list 

import java.util.*;

class Node2
{
    int head;
    Node2 next;
}

public class SinglyLinkedList_CountEvenOdd
{
    //    Creating Even Odd Counter
    int oddCounter = 0;
    int evenCounter = 0;

    Node2 head;
    SinglyLinkedList_CountEvenOdd()
    {
        head = null;
    }

    void counterIncrement(int data){
        if(data % 2 == 0){
            evenCounter += 1;
        }
        else {
            oddCounter += 1;
        }
    }

    void traverse(){
        if (head == null){
            System.out.println("List is Empty");
        }
        else{
            Node2 curr;
            for(curr = head; curr != null; curr = curr.next){
                System.out.println(" "+ curr.head);
            }
        }
    }

    void countEvenOdd(){
        System.out.println("\nTotal Even Values Are: " + evenCounter);
        System.out.println("Total Odd Values Are: " + oddCounter);
        System.out.println();
    }

    void addNode()
    {
        System.out.println("Enter your roll no.");
        Scanner sc2 = new Scanner(System.in);
        int rn = sc2.nextInt();
        counterIncrement(rn);
        // creating a new node
        Node2 newNode = new Node2();
        newNode.head=rn;
        newNode.next=null;
        if (head==null)
        {
            head=newNode;
        }
        else
        {
            Node2 current = head;
            while (current.next!=null)
            {
                current=current.next;
            } current.next=newNode;
        }
        System.out.println("Data inserted...");
    }

    public static void main(String[] args)
    {
        SinglyLinkedList_CountEvenOdd obj = new SinglyLinkedList_CountEvenOdd();

        while (true)
        {
            System.out.println("Press 1 to insert");
            System.out.println("Press 2 to traverse");
            System.out.println("Press 3 to print Count Of Even & Odd Nums");
            System.out.println("Press 4 to exit");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch (ch)
            {
                case 1:
                    obj.addNode();
                    break;
                case 2:
                    obj.traverse();
                    break;
                case 3:
                    obj.countEvenOdd();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}