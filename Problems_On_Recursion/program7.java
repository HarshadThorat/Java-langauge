//write a Recursive program which display below pattern?
// output : 1   2   3   4   5


import java.util.*;

class Recursion
{
    static int i = 1;

    public void DisplayR(int No)
    {
        if(i <= No)
        {
            System.out.print(i+"\t");
            i++;
            DisplayR(No);
        } 
    } 
}


class program7
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int no = sobj.nextInt();

        Recursion obj = new Recursion();
        obj.DisplayR(no);
    }

}