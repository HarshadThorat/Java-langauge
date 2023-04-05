//write a program which display product of all element from SLLL.
//input : 11 -> 20 -> 32 -> 41
//output : 1    2      6     4    


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

    public int Product(int No)
    {
        int Mult = 1;
        int iDigit = 0;
        
        while(No != 0)
        {
            iDigit = No % 10;
            Mult = Mult * iDigit;
            No = No / 10;
        }
        return Mult;
    }
    
    public void DisplayProduct()
    {
        int ret = 0;

        while(First != null)
        {
            ret = Product(First.data);
            System.out.println(First.data+" Product of the Digit is : "+ret);
            First = First.next;
        }
    }
}


class program13
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(41);
        obj.InsertFirst(32);
        obj.InsertFirst(20);
        obj.InsertFirst(11);

        obj.Display();

        obj.DisplayProduct();
    
    }
}