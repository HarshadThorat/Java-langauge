//write a program which display Smallest digit of all element from SLLL.
//input : 11 -> 250 -> 532 -> 415
//output : 1     0      2       1    


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

    public int SmallestDigit(int No)
    {
        int Min = 9;
        int iDigit = 0;
        
        while(No != 0)
        {
            iDigit = No % 10;
            if(iDigit < Min)
            {
                Min = iDigit;
            }
            No = No / 10;
        }
        return Min;
    }
    
    public void DisplaySmallestDigit()
    {
        int ret = 0;

        while(First != null)
        {
            ret = SmallestDigit(First.data);
            System.out.println(First.data+" Smallest Digit is : "+ret);
            First = First.next;
        }
    }
}


class program14
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(415);
        obj.InsertFirst(532);
        obj.InsertFirst(250);
        obj.InsertFirst(11);

        obj.Display();

        obj.DisplaySmallestDigit();
    
    }
}