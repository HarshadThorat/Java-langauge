//write java program which accept two arrays from user and display Even contents of each array
//Input : 2  9  6  5  2  3
//        45 6  12 18 23 4 

//Outut : 2 6 2 
//        6 12 18 4  


import java.util.*;

class Number
{
    public void EvenDisplay(int Arr1[],int Size1, int Arr2[], int Size2)
    {
        System.out.println("Even Elements of the first Array");
        for(int iCnt = 0; iCnt < Size1; iCnt++)
        {
            if(Arr1[iCnt] % 2 == 0)
            {
                System.out.print(Arr1[iCnt]+"\t");
            }
        }
        System.out.println();
        
        System.out.println("Even Elements of the Second Array");
        for(int iCnt = 0; iCnt < Size2; iCnt++)
        {
            if(Arr2[iCnt] % 2 == 0)
            {
                System.out.print(Arr2[iCnt]+"\t");
            }
        }
    } 
}


class program36
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Size of first Array");
        int size1 = sobj.nextInt();

        System.out.println("Enter the Elements of array");
        int Arr1[] = new int[size1];
        for(int iCnt = 0; iCnt < size1; iCnt++)
        {
            Arr1[iCnt] = sobj.nextInt();
        }

        
        System.out.println("Enter the Size of Second Array");
        int size2 = sobj.nextInt();

        System.out.println("Enter the Elements of array");
        int Arr2[] = new int[size2];
        for(int iCnt = 0; iCnt < size2; iCnt++)
        {
            Arr2[iCnt] = sobj.nextInt();
        }

        Number obj = new Number();
        obj.EvenDisplay(Arr1,size1,Arr2,size2); 
    }
}
