//write a java program which accept N from user and return difference between summation of Even elements and summation of Odd elements
// input  :  N = 6
//           Elements  = 85 66 3 80 93 88
// output :  53 (234-181)              


import java.util.*;

class Numbers
{
    public int Arr[];

    public Numbers(int Size)
    {
        Arr = new int[Size];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of the array are");
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public int Difference()
    {
        int iEvenSum = 0;
        int iOddSum = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iEvenSum = iEvenSum + Arr[i];
            }
            else
            {
                iOddSum = iOddSum + Arr[i];
            }
        }
        return iEvenSum - iOddSum;
    }
}


class program21
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of array");
        int No = sobj.nextInt();

        Numbers obj = new Numbers(No);
        
        obj.Accept();
        obj.Display();

        int ret = obj.Difference();
 
        System.out.println("Difference is : "+ret);
        
    }
}