// Write a Program which accept radius of circle from user and calculate its area. 
// Consider value of PI as 3.14. (Area = PI * Radius * Radius)
// Input: 5.3
//Output: 88.2026

import java.util.*;
 
class Numbers
{
    public float Radius;
    public float PI = 3.14f;

    public Numbers(float i)
    {
        Radius = i;
    }

    public double CircleArea()
    {
        double Area= 0.0;

        Area = PI * Radius * Radius;
        return Area;
    }

}


class Program39
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the radius");
        float No = sobj.nextFloat();

        Numbers obj = new Numbers(No);

        double ret = obj.CircleArea();
        System.out.println("Circle area is : "+ret);
    }
}
