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
public class Rectangle extends Quadrilateral{
    //Establish all of the private instance variables
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    
    //Default constructor
    public Rectangle(){
        super(new Point(1,1), new Point(1,6), new Point(10,6), new Point(10,1));
    }
    
    //Constructor that takes four point objects
    public Rectangle(Point p1, Point p2, Point p3, Point p4){
        super(p1,p2,p3,p4);
    }
    
        //Override the area method in quadrilateral
    @Override
    public double getArea(){
        return this.getSide1() * this.getSide2();
    }
}
