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
public class Square extends Quadrilateral{
    //Establish all of the private instance variables
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    
    //Default constructor
    public Square(){
        super(new Point(2,2), new Point(2,6), new Point(6,6), new Point(6,2));
    }
    
    //Constructor that takes four point objects
    public Square(Point p1, Point p2, Point p3, Point p4){
        super(p1,p2,p3,p4);
    }
    
    //Override the area method in quadrilateral
    @Override
    public double getArea(){
        return this.getSide1() * this.getSide2();
    }
}

    

