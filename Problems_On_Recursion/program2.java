//write a Recursive program which display below pattern?
// output : 1   2   3   4   5


import java.util.*;

class Recursion
{
    static int i = 1;

    public void DisplayR()
    {
        if(i <= 5)
        {
            System.out.print(i+"\t");
            i++;
            DisplayR();
        } 
    } 
}


class program2
{
    public static void main(String arg[])
    {
        Recursion obj = new Recursion();
        obj.DisplayR();
    }

}