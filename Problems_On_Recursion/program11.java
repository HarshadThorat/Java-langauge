//write a Recursive program which accept number from user and display below pattern?
// output : 5  *  4  *  3  *  2  *  1  *

import java.util.*;

class Recursion
{
    public static int i;

    public Recursion(int a)
    {
        i = a;
    }

    public void DisplayR()
    {
        if(i > 0)
        {
            System.out.print(i+"\t"+"*\t");
            i--;
            DisplayR();
        } 
    } 
}


class program11
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int no = sobj.nextInt();

        Recursion obj = new Recursion(no);
        obj.DisplayR();
    }

}