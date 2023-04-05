//write a Recursive program which accept number from user and return the summation of its digit?
//Input : 879
// output : 24


import java.util.*;

class Recursion
{
    static int Mult = 1;

    public int ProductR(int No)
    {
        int iDigit = 0;

        if(No != 0)
        {
            iDigit = No % 10;
            Mult = Mult * iDigit;
            No = No / 10;
            ProductR(No);
        } 
        return Mult;
    } 
}


class program15
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int no = sobj.nextInt();

        Recursion obj = new Recursion();
        int ret = obj.ProductR(no);

        System.out.println("Product is : "+ret);
    }

}