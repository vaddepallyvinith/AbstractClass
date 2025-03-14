import java.util.*;
public class UseShape
{
    public static void getAreaPerimeter(Shape sh)
    {
       
       System.out.printf("Area:%.5f\n",sh.getArea());
       System.out.printf("Perimeter:%.5f\n",sh.getPerimeter());
       
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
         int choice = 0;
        while(choice !=-1)
        {
            System.out.println("PRESS    1.For Triangle  2.For Circle  3.For Paralellogram  4.For Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    double arr[][]=new double[3][2];
                    System.out.println("Enter Coordinates of Triangle");
                    for(int i=0; i<3;i++)
                    {
                        for(int j=0;j<2;j++)
                        {
                            arr[i][j]=sc.nextInt();
                        }
                    }
                    Triangle t1 =new Triangle(arr);
                    getAreaPerimeter(t1);
                    
                    if(t1.isRightAngleTriangle())
                    {
                        System.out.println("It is a Right Angled Triangle");                        
                    }
                    if(t1.isEquilateralTriangle())
                    {
                        System.out.println("It is a Equilateral Triangle");
                    }
                    if(t1.isIsoscelesTriangle())
                    {
                        System.out.println("It is a Isoceles Triangle");
                    }
                    break;
                case 2:
                    System.out.println("Enter radius of the circle");
                    double radius=sc.nextDouble();
                    System.out.println("Enter X coordinate of the circle");
                    double X=sc.nextDouble();
                    System.out.println("Enter Y coordinate of the circle");
                    double Y=sc.nextDouble();
                    Circle c1= new Circle(radius,X,Y);
                    getAreaPerimeter(c1);
                    
                    System.out.println("Enter X and Y coordinates to check is it inside or outside the circle");
                    double x=sc.nextDouble();
                    double y=sc.nextDouble();
                    if(c1.isPointInside(x,y))
                    {
                        System.out.println("Point is inside the circle");
                    }
                    else
                    {
                        System.out.println("Point is outside the circle");
                    }
                    
                    break;
                case 3:
                     System.out.println("Enter base of the parallellogram");
                    double base=sc.nextDouble();
                     System.out.println("Enter height of the parallellogram");
                    double height=sc.nextDouble();
                     System.out.println("Enter side1 of the parallellogram");
                    double side1=sc.nextDouble();
                     System.out.println("Enter side2 of the parallellogram");
                    double side2=sc.nextDouble();
                     System.out.println("Enter angle of the parallellogram");
                    double angle=sc.nextDouble();
                   Paralellogram p1=new Paralellogram(base,height,side1,side2,angle);
                    getAreaPerimeter(p1);
                    if(p1.isRectangle())
                    {
                        System.out.println("It is a Rectangle");
                    }
                    else if (p1.isSquare())
                    {
                        System.out.println("It is a Square");
                    }
                    else
                    {
                        System.out.println("It is a Parallellogram");
                    }
                    break;
                case 4:
                    
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    
}
