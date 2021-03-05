import static java.lang.System.exit;

// Create Stack Using Linked list
class StackUsingLinkedlist {

    // A linked list node
    private class Node {

        int data; // integer data
        Node link; // reference variable Node type
    }

    // create global top reference variable global
    Node top;
    int oddCounter = 0;
    int evenCounter = 0;

    // Constructor
    StackUsingLinkedlist()
    {
        this.top = null;
    }

    void counterIncrement(int data){
        if(data % 2 == 0){
            evenCounter += 1;
        }
        else {
            oddCounter += 1;
        }
    }

    // Utility function to add an element x in the stack
    public void push(int x) // insert at the beginning
    {
        counterIncrement(x);
        // create new node temp and allocate memory
        Node temp = new Node();

        // check if stack (heap) is full. Then inserting an
        // element would lead to stack overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        // initialize data into temp data field
        temp.data = x;

        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        if(top.data % 2 == 0){
            evenCounter -= 1;
        }
        else{
            oddCounter -= 1;
        }
        top = (top).link;
    }

    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.println("\nTotal Even Values Are: " + evenCounter);
                System.out.println("Total Odd Values Are: " + oddCounter);
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.link;
            }
        }
    }
}
// main class
public class SULL {

    public static void main(String[] args)
    {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();

        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());

        obj.pop();
        obj.pop();

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}
