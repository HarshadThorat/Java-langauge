//write a java program which accept N from user and display all such elements which are divisible by 5?
// input  :  N = 6
//           Elements  = 85 66 3 80 93 88
// output :  85 80              


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

    public void DivBy5()
    {
        System.out.println("Elements divisible by 5");
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] % 5 == 0)
            {
                System.out.print(Arr[i]+"\t");
            }
        }
    }
}


class program22
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of array");
        int No = sobj.nextInt();

        Numbers obj = new Numbers(No);
        
        obj.Accept();
        obj.Display();

        obj.DivBy5();
        
    }
}