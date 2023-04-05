//write a Recursive program which accept number from user and return the Maximun digit?
//Input : 523
// output : 5


import java.util.*;

class Recursion
{
    static int Max = 0;

    public int MaximumR(int No)
    {
        int iDigit = 0;

        if(No != 0)
        {
            iDigit = No % 10;
            if(iDigit > Max)
            {
                Max = iDigit;
            }
            No = No / 10;
            MaximumR(No);
        } 
        return Max;
    } 
}


class program16
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int no = sobj.nextInt();

        Recursion obj = new Recursion();
        int ret = obj.MaximumR(no);

        System.out.println("Maximum digit is : "+ret);
    }

}