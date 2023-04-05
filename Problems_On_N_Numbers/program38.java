//write java program which accept two arrays from user and form new array which is combination of first and second array
//Input : 12  57  28  3 
//        99 23  54 58 6 67 

//Outut : 12  57  28  3 99 23  54 58 6 67
//          


import java.util.*;

class Number
{
    public void ArrayConcate(int Arr1[],int Size1, int Arr2[], int Size2)
    {
        int length = Size1 + Size2;

        int Arr3[] = new int[length];

        for(int iCnt = 0; iCnt < Size1; iCnt++)
        {
            Arr3[iCnt] = Arr1[iCnt];
        }
        
        for(int iCnt = 0; iCnt < Size2; iCnt++)
        {
            Arr3[iCnt + Size1] = Arr2[iCnt];
        }

        System.out.println("Elements of the NEW ARRAY");
        for(int iCnt = 0; iCnt < length; iCnt++)
        {
            System.out.print(Arr3[iCnt]+"\t");
        }
        System.out.println();
        
    } 
}


class program38
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
        obj.ArrayConcate(Arr1,size1,Arr2,size2); 
    }
}
