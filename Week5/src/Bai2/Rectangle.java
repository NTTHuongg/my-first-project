/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author hp
 */
public class Rectangle extends Shape{
    
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    } 
    
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
        
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return this.length*2+this.width*2;
    }
    
    @Override
    public String toString(){
        return this.getColor()+" "+this.isFilled()+" "+this.getArea()+" "+this.getPerimeter();
    }
}
