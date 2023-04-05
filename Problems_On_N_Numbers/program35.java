//write java program which accept two arrays from user and display contents of each array
//Input : 2 9 7 5 2 3
//        9 3 5 5  

//Outut : 2 9 7 5 2 3
//        9 3 5 5  


import java.util.*;

class Number
{
    public void Display(int Arr1[],int Size1, int Arr2[], int Size2)
    {
        System.out.println("Elements of the first Array");
        for(int iCnt = 0; iCnt < Size1; iCnt++)
        {
            System.out.print(Arr1[iCnt]+"\t");
        }
        System.out.println();
        
        System.out.println("Elements of the Second Array");
        for(int iCnt = 0; iCnt < Size2; iCnt++)
        {
            System.out.print(Arr2[iCnt]+"\t");
        }
    } 
}


class program35
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
        obj.Display(Arr1,size1,Arr2,size2); 
    }
}
