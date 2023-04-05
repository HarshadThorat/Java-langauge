//write a program which return addition of all element from SLLL.
//input : 10 -> 20 -> 30 -> 40
//output : 100


import java.util.*;

class Node
{
    public int data;
    public Node next;

    public Node(int no)
    {
        data = no;
        next = null;
    }
}


class LinkList
{
    public Node First;

    public LinkList()
    {
        First = null;
    } 

    public void InsertFirst(int no)
    {
        Node newn = new Node(no);
        
        if(First == null)
        {
            First = newn;
        }
        else
        {
            newn.next = First;
            First = newn;
        }
    }

    public void Display()
    {
        Node temp = First;

        System.out.println("Elements of the linked list are : ");

        while(temp != null)
        {
            System.out.print(" | "+temp.data+" |-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Addition()
    {
        int Sum = 0;

        while(First != null)
        {
            Sum = Sum + First.data;
            First = First.next;
        }
        return Sum;
    }
}


class program3
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(40);
        obj.InsertFirst(30);
        obj.InsertFirst(20);
        obj.InsertFirst(10);

        obj.Display();

        int ret = obj.Addition();
        System.out.println("Addition is : "+ret);

    }
}