/**
 * CS 272 - Fall 2019
 * H01-IceCreamCone.java
 */
package occ.cs272.h01;

import java.util.Scanner;

public class IceCreamCone
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "xzhao4";
    public static final String ASSIGNMENT = "H01-B";

    // TODO: Complete this class
    private double radius;
    private double height;
	private static Scanner in;
    
    public IceCreamCone(double height, double radius)
    {
    	this.height = height;
    	this.radius = radius;
    }
    
    public double getVolume()
    {
    	double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    	return volume;
    }
    
    public double getSurfaceArea()
    {
    	double area = Math.PI * radius * Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    	return area;
    }
    
    public static void main(String[] args)
    {
    	in = new Scanner(System.in);
    	double height = in.nextDouble();
    	double radius = in.nextDouble();
    	IceCreamCone I = new IceCreamCone(height, radius);
    	I.getSurfaceArea();
    	I.getVolume();
    }
    
    
    
}
