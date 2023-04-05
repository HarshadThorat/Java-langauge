//write a Recursive program which display below pattern?
// output : a  b  c  d  e


import java.util.*;

class Recursion
{
    static int i = 1;
    static char ch = 'a';

    public void DisplayR(int No)
    {
        if(i <= No)
        {
            System.out.print(ch+"\t");
            ch++;
            i++;
            DisplayR(No);
        } 
    } 
}


class program10
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