//Q-> Complete a program of Singly Queue ------ using linkedlist

import java.util.Scanner;

interface ADTQueues{
    abstract void insert(int data);
    abstract int delete();
    abstract boolean isEmpty();
    abstract  void traverse();
    abstract boolean search(int sea);
}

class Queueexample implements ADTQueues {
    int ar[];
    int Front,Rear;
    Queueexample(){
        ar = new int[5];
        Front = Rear = -1;
    }

    @Override
    public void insert(int data) {
        if (Rear==4)
        {
            System.out.println("Queue is full");
        }
        else
        {
            if (Front==-1)
            {
                Front=0;
            }
            Rear=Rear+1;
            ar[Rear]=data;
            System.out.println("Data Inserted...");
        }
    }

    @Override
    public int delete() {
        if (Front==-1 && Rear==-1)
        {
            System.out.println("Queue is empty!!!");
        }
        else
        {
            if (Front==Rear)
            {
                System.out.println("Deleted: " + ar[Front]);
                Front=Rear=-1;
                return Front;
            }
            else
            {
                System.out.println("Deleted: " + ar[Front]);
                Front+=1;
                return Front;
            }
        }
        return Front;
    }

    @Override
    public boolean isEmpty() {
        if (Front==-1 && Rear==-1)
        {
            return true;
        }
        return false;
    }

    @Override
    public void traverse() {
        if (Front == -1 || Rear == -1)
        {
            System.out.println("Queue is empty!!!");
        }
        else
        {
            for (int i = Front; i<=Rear;i++)
            {
                System.out.print(" "+ ar[i]);
            }
        }
    }

    @Override
    public boolean search(int sea) {
        return false;
    }

    public static void main(String[] args) {
        Queueexample obj = new Queueexample();

        while (true)
        {
            System.out.println("Press 1 for insert!");
            System.out.println("Press 2 for delete!");
            System.out.println("Press 3 for traverse!");
            System.out.println("Press 4 for Search!");
            System.out.println("Press 5 for isEmpty!");
            System.out.println("Press 6 for Exit!");

            System.out.println("Enter your choice....");
            Scanner sc2 = new Scanner(System.in);
            int ch = sc2.nextInt();

            switch (ch) {
                case 1: {
                    System.out.println("Enter data!!!");
                    int data = sc2.nextInt();
                    obj.insert(data);
                }
                case 2: {
                    obj.delete();
                }
                case 3: {
                    obj.traverse();
                }
                case 4: {
                    obj.search(5);
                }
                case 5: {
                    obj.isEmpty();
                }
                case 6: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid Choice!!!");
                }
            }
        }
    }
}
