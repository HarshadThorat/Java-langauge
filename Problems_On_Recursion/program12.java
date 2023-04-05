//write a Recursive program which accept number from user and return the summation of its digit?
//Input : 879
// output : 24


import java.util.*;

class Recursion
{
    static int Sum = 0;

    public int AdditionR(int No)
    {
        int iDigit = 0;

        if(No != 0)
        {
            iDigit = No % 10;
            Sum = Sum + iDigit;
            No = No / 10;
            AdditionR(No);
        } 
        return Sum;
    } 
}


class program12
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int no = sobj.nextInt();

        Recursion obj = new Recursion();
        int ret = obj.AdditionR(no);

        System.out.println("Addition is : "+ret);
    }

}