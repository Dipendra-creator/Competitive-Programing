//Write a program to transfer even data from singly linked list to doubly linked list

import java.util.*;

class Node
{
    int head;
    Node next;
}

public class SinglyLinkedList_OnlyEven
{
    Node head;

    SinglyLinkedList_OnlyEven()
    {
        head = null;
    }

    static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }

    void traverse(){
        if (head == null){
            System.out.println("List is Empty");
        }
        else{
            Node curr;
            for(curr = head; curr != null; curr = curr.next){
                System.out.println(" "+ curr.head);
            }
        }
    }

    void addNode()
    {

        System.out.println("Enter your roll no.");
        Scanner sc2 = new Scanner(System.in);
        int rn = sc2.nextInt();
        if(isEven(rn) == true){
            // creating a new node
            Node newNode = new Node();
            newNode.head=rn;
            newNode.next=null;
            if (head==null)
            {
                head=newNode;
            }
            else
            {
                Node current = head;
                while (current.next!=null)
                {
                    current=current.next;
                } current.next=newNode;
            }
            System.out.println("Data inserted...");
        }
        else{
            System.out.println("Sorry "+ rn + " is not a Even Number");
        }

    }

    public static void main(String[] args)
    {
        SinglyLinkedList_OnlyEven obj = new SinglyLinkedList_OnlyEven();

        while (true)
        {
            System.out.println("Press 1 to insert");
            System.out.println("Press 2 to traverse");
            System.out.println("Press 3 to exit");
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
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}