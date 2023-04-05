//write a program which display all Pallindrome element from SLLL.
//input : 11 -> 28 -> 17 -> 414 -> 6 -> 89
//output : 11   6   414


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

    public Boolean Pallindrome(int no)
    {
        int Rev = 0;
        int iDigit = 0;
        int temp = no;
        Boolean flag = false;

        while(no != 0)
        {
            iDigit = no % 10;
            Rev = (Rev * 10) + iDigit;
            no = no / 10;
        }
        
        if(temp == Rev)
        {
            flag = true;
        }
        return flag;
    }
    
    public void DisplayPallindrome()
    {
        Boolean ret = false;

        while(First != null)
        {
            ret = Pallindrome(First.data);
            if(ret == true)
            {
                System.out.println("Pallindrome Digit : "+First.data);
            }
            First = First.next;
        }
    }
}


class program12
{
    public static void main(String arg[])
    {
        LinkList obj = new LinkList();

        obj.InsertFirst(89);
        obj.InsertFirst(6);
        obj.InsertFirst(414);
        obj.InsertFirst(17);
        obj.InsertFirst(28);
        obj.InsertFirst(11);

        obj.Display();

        obj.DisplayPallindrome();
    
    }
}