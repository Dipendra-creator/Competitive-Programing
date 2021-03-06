import java.util.Scanner;

interface ADTStackDem {
    abstract void push(int data);
    abstract void pop();
    abstract void peek();
    abstract boolean isEmpty();
    abstract void traverse();
}

class StackExample implements ADTStackDem{

    int[] arr;
    int top;
    StackExample()
    {
        arr = new int[5];
        top=-1;
    }

    @Override
    public void push(int data) {
        if (top==4)
        {
            System.out.println("Stack is full!");
        }
        else
        {
            top=top+1;
            arr[top]=data;
            System.out.println("Data inserted!!!");
        }
    }

    @Override
    public void pop() {
        if (isEmpty()==true)
        {
            System.out.println("Stack is empty!!!");
        }
        else
        {
            System.out.println("Deleted element...");
            top=top-1;
        }
    }

    @Override
    public void peek() {
        if (isEmpty()==true)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println(arr[top]);
        }
    }

    @Override
    public boolean isEmpty() {
        if (top == -1){
            return true;
        }
        return false;
    }

    @Override
    public void traverse() {
        if (isEmpty()==true)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for (int i=top;i>=0;i--)
            {
                System.out.print(arr[i]);
                System.out.print(" \n");
            }
        }
    }

    public static void main(String[] args) {
        StackExample obj =new StackExample();
        while (true)
        {
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for peek");
            System.out.println("Press 5 for isEmpty");
            System.out.println("Press 6 for exit");
            System.out.println();
            System.out.println("Enter your choice...");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter any data");
                    Scanner sc2 = new Scanner(System.in);
                    int data = sc2.nextInt();
                    obj.push(data);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    obj.peek();
                    break;
                case 5:
                    obj.isEmpty();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}