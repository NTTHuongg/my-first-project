/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import static java.lang.Math.PI;

/**
 *
 * @author hp
 */
public class Circle extends Shape {
    
    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
        
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    
    private double radius;    
    private final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return PI*this.radius*this.radius;
    }
    
    public double getPerimeter(){
        return 2*PI*this.radius;
    }
    
    @Override
    public String toString(){
        return this.getColor()+" "+this.isFilled()+" "+this.getArea()+" "+this.getPerimeter();
    }
}
