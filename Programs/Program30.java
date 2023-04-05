// Accept single digit number from user and print it into word
// Input: 7 
// Output: Seven


import java.util.*;

class Number
{
    public void Display(int iNo)
    {
        if(iNo == 0)
        {
            System.out.println("Zero");
        }    
        else if(iNo == 1)
        {
            System.out.println("One");
        }
        else if(iNo == 2)
        {
            System.out.println("Two");
        }   
        else if(iNo == 3)
        {
            System.out.println("Three");
        }
        else if(iNo == 4)
        {
            System.out.println("Four");
        }
        else if(iNo == 5)
        {
            System.out.println("Five");
        }
        else if(iNo == 6)
        {
            System.out.println("Six");
        }
        else if(iNo == 7)
        {
            System.out.println("Seven");
        }
        else if(iNo == 8)
        {
            System.out.println("Eight");
        }
        else if(iNo == 9)
        {
            System.out.println("Nine");
        }
        else
        {
            System.out.println("Invalid Word");
        }
                
    }
}

class Program30
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
