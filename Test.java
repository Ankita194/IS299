/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questiong8;
import java.awt.Point;

/**
 *
 * @author ankitamaharjan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
           
        //Test for the Rectangle class
        Rectangle shape1 = new Rectangle(new Point(1,1), new Point(1,6),
                           new Point(11,6), new Point(11,1));
        System.out.println(shape1.getPoint(3));
        System.out.println("Area of Rectangle: " + shape1.getArea());
        System.out.println("Perimeter of Rectangle: " + shape1.getPerimeter());
        System.out.println(shape1.toString() + "\n\n");
        
        //Test for the Parallelogram class 
        Parallelogram shape2 = new Parallelogram();
        System.out.println(shape2.getPoint(3));
        System.out.println("Area of Parallelogram: " + shape2.getArea());
        System.out.println("Perimeter of Parallelogram: " + shape2.getPerimeter());
        System.out.println(shape2.toString() + "\n\n");
        
        //Test for the Square class
        Square shape3 = new Square(new Point(0,0), new Point(0,10),
                           new Point(10,10), new Point(10,0));
        System.out.println(shape3.getPoint(3));
        System.out.println("Area of Square: " + shape3.getArea());
        System.out.println("Perimeter of Square: " + shape3.getPerimeter());
        System.out.println(shape3.toString() + "\n\n");
        
        
        //Test for the Trapezoid class 
        Trapezoid shape4 = new Trapezoid();
        System.out.println(shape4.getPoint(3));
        System.out.println("Area of Trapezoid: " + shape4.getArea());
        System.out.println("Perimeter of Trapezoid: " + shape4.getPerimeter());
        System.out.println(shape4.toString());
    }
    
}
