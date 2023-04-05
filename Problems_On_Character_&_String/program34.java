//write java program which accept  arrays of character from user and replace each capital character with its corresponding small character 
//Input :  b  N   j  B  R  b  A  d  G   G
//Outut :  b  n   j  b  r  b  a  d  g   g
//          


import java.util.*;

class Alphabate
{
    public void LowerCase(char Arr[],int Size)
    {
        int i = 0;

        System.out.println("UpperCase Elements converted into LowerCase : ");
        for(int iCnt = 0; iCnt < Size; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
            System.out.print(Arr[iCnt]+"\t");
        }        
        
    } 
        
}


class program34
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Size of character Array");
        int size1 = sobj.nextInt();

        System.out.println("Enter the Elements of array");
        char Arr1[] = new char[size1];
        for(int iCnt = 0; iCnt < size1; iCnt++)
        {
            Arr1[iCnt] = sobj.next().charAt(0);
        }

        Alphabate obj = new Alphabate();
        obj.LowerCase(Arr1,size1);


    }
}
