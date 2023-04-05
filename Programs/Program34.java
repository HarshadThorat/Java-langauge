// write a Program which accept number from user and display below pattern.
// input : 5
// output : *  *  *  *  * #  #  #  #  # 


import java.util.*;

class Number
{
    public void Display(int No)
    {
        for(int iCnt = 1; iCnt <= No; iCnt++)
        {
            System.out.print("*"+"\t");
        } 
        
        for(int iCnt = 1; iCnt <= No; iCnt++)
        {
            System.out.print("#"+"\t");
        }       
    }
}

class Program34
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int iValue1 = sobj.nextInt();

        Number obj = new Number();

        obj.Display(iValue1);
        
    }   
}
