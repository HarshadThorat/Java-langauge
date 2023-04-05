//write a program which display Largeest digit of all element from SLLL.
//input : 11 -> 250 -> 532 -> 419
//output : 1     5      5      9    


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

    public int LargestDigit(int No)
    {
        int Min = 0;
        int iDigit = 0;
        
        while(No != 0)
        {
            iDigit = No % 10;
            if(iDigit > Min)
            {
                Min = iDigit;
            }
            No = No / 10;
        }
        return Min;
    }
    
    public void DisplayLargestDigit()
    {
        int ret = 0;

        while(First != null)
        {
            ret = LargestDigit(First.data);
            System.out.println(First.data+" Largest Digit is : "+ret);
            First = First.next;
        }
    }
}


class program15
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(419);
        obj.InsertFirst(532);
        obj.InsertFirst(250);
        obj.InsertFirst(11);

        obj.Display();

        obj.DisplayLargestDigit();
    
    }
}