//write a Recursive program which accept number from user and return the Maximun digit?
//Input : 523
// output : 5


import java.util.*;

class Recursion
{
    static int Min = 9;

    public int MinimumR(int No)
    {
        int iDigit = 0;

        if(No != 0)
        {
            iDigit = No % 10;
            if(iDigit < Min)
            {
                Min = iDigit;
            }
            No = No / 10;
            MinimumR(No);
        } 
        return Min;
    } 
}


class program17
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int no = sobj.nextInt();

        Recursion obj = new Recursion();
        int ret = obj.MinimumR(no);

        System.out.println("Minimum digit is : "+ret);
    }

}