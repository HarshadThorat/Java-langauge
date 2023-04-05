//write a Recursive program which display below pattern?
// output : 1   2   3   4   5


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
            System.out.print(i+"\t");
            i--;
            DisplayR();
        } 
    } 
}


class program8
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