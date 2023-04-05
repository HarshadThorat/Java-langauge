//write a program which display all elements which are prefect  from SLLL.
//input : 11 -> 28 -> 17 -> 41 -> 6 -> 89
//output : 6  28


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

    public boolean CheckPerfect(int No)
    {
        int Sum = 0, iCnt = 0;
        int Temp = No;

        for(iCnt = 1; iCnt <= No/2 ; iCnt++)
        {
            if(No % iCnt == 0)
            {
                Sum = Sum + iCnt;
            }
        }
        return(Sum == Temp);
    }

    public void DisplayPerfect()
    {
        while(First != null)
        {
            if(CheckPerfect(First.data) == true)
            {
                System.out.println("Prefect number is : "+First.data);
            }
            First = First.next;
        }
    }
}


class program6
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

        obj.DisplayPerfect();
        
    }
}