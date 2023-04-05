//write a Recursive program which accept number from user and return the Maximun digit?
//Input : 523
// output : 5


import java.util.*;

class Recursion
{
    static int Rev = 0;

    public int ReverseR(int No)
    {
        int iDigit = 0;

        if(No != 0)
        {
            iDigit = No % 10;
            Rev = (Rev * 10) + iDigit;
            No = No / 10;
            ReverseR(No);
        } 
        return Rev;
    } 
}


class program18
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int no = sobj.nextInt();

        Recursion obj = new Recursion();
        int ret = obj.ReverseR(no);

        System.out.println("Reverse digit is : "+ret);
    }

}