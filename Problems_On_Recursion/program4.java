//write a Recursive program which display below pattern?
// output : A  B  C  D  E  F


import java.util.*;

class Recursion
{
    static int i = 1;
    static char ch = 'A';

    public void DisplayR()
    {
        if(i <= 6)
        {
            System.out.print(ch+"\t");
            ch++;
            i++;
            DisplayR();
        } 
    } 
}


class program4
{
    public static void main(String arg[])
    {
        Recursion obj = new Recursion();
        obj.DisplayR();
    }

}