//Q->Write a program  of stack using a singly linked list which contains prime number's only

import java.util.*;

class Nod
{
    int head;
    Nod next;
}

public class SinglyLinkedList_OnlyPrimeNumbers
{
    Nod head;
    SinglyLinkedList_OnlyPrimeNumbers()
    {
        head = null;
    }

    //    This Code will check is Number is prime or not
    static int isPrime(int n){

        int i,m=0,Counter=0;

        m = n/2;

        if(n==0 || n==1){
            return m;
        }else{
            for(i=2; i<=m; i++){
                if(n%i == 0){
                    Counter=1;
                    break;
                }
            }
            if(Counter==0)  { return n; }
        }//end of else
        return m;
    }

    void traverse(){
        if (head == null){
            System.out.println("List is Empty");
        }
        else{
            Nod curr;
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
        if(isPrime(rn) == rn){
            // creating a new node
            Nod newNode = new Nod();
            newNode.head=rn;
            newNode.next=null;
            if (head==null)
            {
                head=newNode;
            }
            else
            {
                Nod current = head;
                while (current.next!=null)
                {
                    current=current.next;
                } current.next=newNode;
            }
            System.out.println("Data inserted...");
        }
        else{
            System.out.println("Sorry "+ rn + " is not a Prime Number");
        }

    }

    public static void main(String[] args)
    {
        SinglyLinkedList_OnlyPrimeNumbers obj = new SinglyLinkedList_OnlyPrimeNumbers();

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