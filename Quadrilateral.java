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
public class Quadrilateral {
    //Establish all of the private instance variables
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    
    //Default constructor
    public Quadrilateral(){
        this.p1 = new Point(0,5);
        this.p2 = new Point(0,8);
        this.p3 = new Point(5,8);
        this.p4 = new Point(5,3);
    }
    
    //Constructor that takes four point objects
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    
    //Method to get sides
    public double getSide1(){
        //Instance variables for each side
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()),2)
                    + Math.pow((p2.getY() - p1.getY()), 2));
    }
    
    public double getSide2(){
        //Instance variables for each side
        return Math.sqrt(Math.pow((p3.getX() - p2.getX()),2)
                    + Math.pow((p3.getY() - p2.getY()), 2));
    }
    
    public double getSide3(){
        //Instance variables for each side
        return Math.sqrt(Math.pow((p4.getX() - p3.getX()),2)
                    + Math.pow((p4.getY() - p3.getY()), 2));
    }
    
    public double getSide4(){
        //Instance variables for each side
        return Math.sqrt(Math.pow((p1.getX() - p4.getX()),2)
                    + Math.pow((p1.getY() - p4.getY()), 2));
    }
    
    public double getX(int pointNum){
        switch (pointNum){
            case 1:
                return p1.getX();
            case 2:
                return p2.getX();
            case 3:
                return p3.getX();
            case 4:
                return p4.getX();
        }
        return 0;
    }
    
        public double getY(int pointNum){
        switch (pointNum){
            case 1:
                return p1.getY();
            case 2:
                return p2.getY();
            case 3:
                return p3.getY();
            case 4:
                return p4.getY();
        }
        return 0;
    }
        
    //Get point method. This sets one point out of the four point objects
    public Point getPoint(int pointNum){
        switch (pointNum) {
            case 1:
                return p1;
            case 2:
                return p2;
            case 3:
                return p3;
            case 4:
                return p4;
            default:
                return null;
        }  
    }
    
    //Set point method. This sets one point out of the four point objects
    public void setPoint(int pointNum, Point point){
        switch (pointNum) {
            case 1:
                this.p1 = point;
            case 2:
                this.p2 = point;
            case 3:
                this.p3 = point;
            case 4:
                this.p4 = point;
        }
    }
    
    //area method (overloaded with each subclass)
    public double getArea(){
        //Get the distance between point 1 and point 3
        double  commonBase = Math.sqrt(Math.pow((p3.getX() - p1.getX()),2)
                    + Math.pow((p3.getY() - p1.getY()), 2));
        
        //find h1
        double h1 = (this.getSide1() + this.getSide2() + commonBase)/2;
        //find h2
        double h2 = (this.getSide3() + this.getSide4() + commonBase)/2; 
        
        return .5 * commonBase * (h1 + h2);
    }
    
    //perimeter method (same formula for each subclass)
    public double getPerimeter(){
        return this.getSide1() + this.getSide2() + this.getSide3() 
                + this.getSide4();
    }
    
     //toString method
    @Override
    public String toString(){
        return "The points in this shape:\n"
                + "Point 1 = (" + p1.getX() + ", " + p1.getY()
                + ")\nPoint 2 = (" + p2.getX() + ", " + p2.getY()
                + ")\nPoint 3 = (" + p3.getX() + ", " + p3.getY()
                + ")\nPoint 4 = (" + p4.getX() + ", " + p4.getY() + ")";
    }
    
}