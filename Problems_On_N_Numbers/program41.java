//write java program which accept two arrays from user and display Minimum Element of each array
//Input : 2  9  6  5  2  3
//        9  3  5  5

//Outut : 2  
//        3
          


import java.util.*;

class Number
{
    public void MinElementDisplay(int Arr1[],int Size1, int Arr2[], int Size2)
    {
        int Min1 = Arr1[0];
        int Min2 = Arr2[0];

        for(int iCnt = 0; iCnt < Size1; iCnt++)
        {
            if(Arr1[iCnt] < Min1)
            {
                Min1 = Arr1[iCnt];
            } 
        }
        System.out.println();
        System.out.println("Minimun Elements of the First array is : "+Min1);
        
        for(int iCnt = 0; iCnt < Size2; iCnt++)
        {
            if(Arr2[iCnt] < Min2)
            {
                Min2 = Arr2[iCnt];
            }
        }
        System.out.println("Minimun Elements of the Second array is : "+Min2);
        
    } 
}


class program41
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
        obj.MinElementDisplay(Arr1,size1,Arr2,size2); 
    }
}
