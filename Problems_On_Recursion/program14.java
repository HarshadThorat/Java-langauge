//write a Recursive program which accept number from user and return its Factorial?
// Input :  5
// output :  120


import java.util.*;

class Recursion
{
    static int i = 1;
    static int Mult = 1;

    public int FactorialR(int No)
    {
        
        if(i <= No)
        {
            Mult = Mult * i;
            i++;
            FactorialR(No);
        } 
        return Mult;
    } 
}


class program14
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int no = sobj.nextInt();

        Recursion obj = new Recursion();
        int ret = obj.FactorialR(no);

        System.out.println("Factorial is : "+ret);
    }

}