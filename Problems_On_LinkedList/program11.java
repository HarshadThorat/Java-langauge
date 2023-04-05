//write a program which reverse each element from SLLL.
//input : 11 -> 28 -> 17 -> 41 -> 6 -> 89
//output : 11   82    71    14    6    98


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

    public int Reverse(int no)
    {
        int Rev = 0;
        int iDigit = 0;

        while(no != 0)
        {
            iDigit = no % 10;
            Rev = (Rev * 10) + iDigit;
            no = no / 10;
        }
        return Rev;
    }
    
    public void DisplayReverse()
    {
        int ret = 0;

        while(First != null)
        {
            ret = Reverse(First.data);
            System.out.println("Reverse Digit "+First.data+" is "+ret);
            First = First.next;
        }
    }
}


class program11
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(89);
        obj.InsertFirst(6);
        obj.InsertFirst(41);
        obj.InsertFirst(17);
        obj.InsertFirst(28);
        obj.InsertFirst(11);

        obj.Display();

        obj.DisplayReverse();
    
    }
}