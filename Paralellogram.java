
/**
 * Write a description of class Paralellogram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Paralellogram extends Shape
{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double angle;
    
    Paralellogram(double base,double height,double side1,double side2,double angle)
    {
        this.base=base;
        this.height=height;
        this.side1=side1;
        this.side2=side2;
        this.angle=angle;
        
    }
    public double getArea()
    {   
        return base*height;
    }
    public double getPerimeter()
    {
        return 2*(side1+side2);
    }
     public boolean isRectangle()
     {
         return angle==90;
        }
    public boolean isSquare()
    {
        return (angle==90 && side1==side2);
    }
}
