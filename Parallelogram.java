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

public class Parallelogram extends Quadrilateral{
    //Establish all of the private instance variables
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    
    //Default constructor
    public Parallelogram(){
        super(new Point(0,0), new Point(2,6), new Point(8,5), new Point(5,0));
    }
    
    //Constructor that takes four point objects
    public Parallelogram(Point p1, Point p2, Point p3, Point p4){
        super(p1, p2, p3, p4);
    }
    
    //Override the area method in quadrilateral
    @Override
    public double getArea(){
        return (this.getSide4()) * (this.getY(2) - this.getY(1));
    }
}
