//write a program which return Largest element from SLLL.
//input : 110 -> 230 -> 320 -> 240
//output : 320

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

    public int Maximum()
    {
        int Max = First.data;

        while(First != null)
        {
            if(First.data > Max)
            {
                Max = First.data;
            }
            First = First.next;
        }
        return Max;
    }
}


class program4
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(240);
        obj.InsertFirst(320);
        obj.InsertFirst(230);
        obj.InsertFirst(110);

        obj.Display();

        int ret = obj.Maximum();
        System.out.println("Maximum node is : "+ret);

    }
}