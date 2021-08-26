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
public class Trapezoid extends Quadrilateral{
    //Establish all of the private instance variables
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    
    //Default constructor
    public Trapezoid(){
        super(new Point(0,0), new Point(2,5), new Point(5,5), new Point(8,0));
    }
    
    //Constructor that takes four point objects
    public Trapezoid(Point p1, Point p2, Point p3, Point p4){
        super(p1,p2,p3,p4);
    }
    
    //Override the area method in quadrilateral
    @Override
    public double getArea(){
        return ((this.getSide2()+this.getSide4())/2) * 
                (this.getY(2) - this.getY(1));
    }
}
