//write a program which search Last occurance of particular element fom SLLL.
// 10 -> 20 -> 30 -> 40 -> 50 -> 30 -> 70
// input : 30
//output : 6


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

    public int LastOccurance(int no)
    {
        int iCnt = 1;
        int ipos = -1;

        while(First != null)
        {
            if(First.data == no)
            {
                ipos = iCnt;
            }
            First = First.next;
            iCnt++;
        }
        return ipos;
    }
}


class program2
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(70);
        obj.InsertFirst(30);
        obj.InsertFirst(50);
        obj.InsertFirst(40);
        obj.InsertFirst(30);
        obj.InsertFirst(20);
        obj.InsertFirst(10);

        obj.Display();

        int ret = obj.LastOccurance(30);
        System.out.println("Element Occurs at Index : "+ret);

    }
}