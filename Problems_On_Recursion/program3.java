//write a Recursive program which display below pattern?
// output : 5  4  3  2  1


import java.util.*;

class Recursion
{
    static int i = 5;

    public void DisplayR()
    {
        if(i  > 0)
        {
            System.out.print(i+"\t");
            i--;
            DisplayR();
        } 
    } 
}


class program3
{
    public static void main(String arg[])
    {
        Recursion obj = new Recursion();
        obj.DisplayR();
    }

}