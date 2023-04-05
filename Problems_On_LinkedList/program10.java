//write a program which display addition of digit of element from SLLL.
//input : 110 -> 230 -> 20 -> 240 -> 640
//output : 2      5      2     6      10


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

    public int SumDigit(int no)
    {
        int Sum = 0;
        int iDigit = 0;

        while(no != 0)
        {
            iDigit = no % 10;
            Sum = Sum + iDigit;
            no = no / 10;
        }
        return Sum;
    }
    
    public void DisplayDigitSum()
    {
        int ret = 0;

        while(First != null)
        {
            ret = SumDigit(First.data);
            System.out.println("Addition of Digit of number "+ret);
            First = First.next;
        }
    }
}

class program10
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(640);
        obj.InsertFirst(240);
        obj.InsertFirst(20);
        obj.InsertFirst(230);
        obj.InsertFirst(110);

        obj.Display();

        obj.DisplayDigitSum();
    
    }
}