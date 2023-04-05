//write a Recursive program which display below pattern?
// output : * * * * *

import java.util.*;

class Recursion
{
    static int i = 0;

    public void DisplayR()
    {
        if(i < 5)
        {
            System.out.print("*\t");
            i++;
            DisplayR();
        } 
    } 
}


class program1
{
    public static void main(String arg[])
    {
        Recursion obj = new Recursion();
        obj.DisplayR();
    }

}