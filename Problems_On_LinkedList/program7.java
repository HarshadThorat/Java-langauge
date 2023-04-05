//write a program which display all elements which are Prime from SLLL.
//input : 11 -> 20 -> 17 -> 41 -> 22 -> 89
//output : 11   17   41   89


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

    public int IsPrime(int No)
    {
        int iCnt = 0;
        int i = 0;

        for(iCnt = 1; iCnt <= No ; iCnt++)
        {
            if(No % iCnt == 0)
            {
                i++;
            }
        }
        return i;
    }

    public void Prime()
    {
        int ret = 0;

        while(First != null)
        {
            ret = IsPrime(First.data);
            if(ret == 2)
            {
                System.out.println("Prime number is : "+First.data);
            }
            First = First.next;
        }
    }
}


class program7
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(89);
        obj.InsertFirst(22);
        obj.InsertFirst(41);
        obj.InsertFirst(17);
        obj.InsertFirst(20);
        obj.InsertFirst(11);

        obj.Display();

        obj.Prime();
        
    }
}