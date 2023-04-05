//write a Recursive program which display below pattern?
// output : A  B  C  D  E  F


import java.util.*;

class Recursion
{
    static int i = 1;
    static char ch = 'A';

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


class program9
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