//write a program which return second Largest element from SLLL.
//input : 110 -> 230 -> 320 -> 240
//output : 240   incomplete
 

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

    public int EvenAddition()
    {
        int Sum = 0;

        while(First != null)
        {
            if(First.data % 2 == 0)
            {
                Sum = Sum + First.data;
            }    
            First = First.next;
        }
        return Sum;
    }
}


class program9
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(41);
        obj.InsertFirst(32);
        obj.InsertFirst(20);
        obj.InsertFirst(11);

        obj.Display();

        int ret = obj.EvenAddition();
        System.out.println("Addition of all Even nodes are : "+ret);
    }
}