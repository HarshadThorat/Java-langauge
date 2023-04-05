//write java program which accept two arrays from user and display Summation of each array
//Input : 2  9  6  5  2  3
//        9  3  5  5

//Outut : 27
//        22
          


import java.util.*;

class Number
{
    public void AddDisplay(int Arr1[],int Size1, int Arr2[], int Size2)
    {
        int Sum1 = 0;
        int Sum2 = 0;

        for(int iCnt = 0; iCnt < Size1; iCnt++)
        {
            Sum1 = Sum1 + Arr1[iCnt];     
        }
        System.out.println();
        System.out.println("Addition of first Array : "+Sum1);
        
        for(int iCnt = 0; iCnt < Size2; iCnt++)
        {
            Sum2 = Sum2 + Arr2[iCnt];
        }
        System.out.println("Addition of Second Array : "+Sum2);
        
    } 
}


class program39
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
        obj.AddDisplay(Arr1,size1,Arr2,size2); 
    }
}
