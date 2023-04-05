// Accept number from user and display below pattern
// input : 5
// output :  #   1  #   2   #   3   #   4   #   5  


import java.util.*;

class NumberX
{
    public int No;

    public NumberX(int A)
    {
        No = A;
    }

    public void Pattern()
    {
        for(int iCnt = 1; iCnt <= No; iCnt++)
        {
            System.out.print("#"+"\t"+iCnt+"\t");
        }
    }
}

class program4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int value = sobj.nextInt();

        NumberX obj = new NumberX(value);

        obj.Pattern();
    
    }
}