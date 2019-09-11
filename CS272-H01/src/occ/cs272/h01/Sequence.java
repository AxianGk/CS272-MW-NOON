/**
 * CS 272 - Fall 2019
 * H01-Sequence.java
 */
package occ.cs272.h01;

import java.util.Scanner;

/**
 * @author <xzhao4>
 * @version <09/09/2019>
 *
 */
public class Sequence
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "xzhao4";
    public static final String ASSIGNMENT = "H01-D";
    
    private int[] array;
	private static Scanner in;
    
    
    /**
     * Constructs a sequence of integers.
     * @param array the array to initialize the sequence.
     */
    public Sequence(int[] array)
    {
        this.array = array.clone();
    }
    
    // TODO: Write the three versions of slice() here
    public Sequence slice(int start)
    {
    	int inc = 0;
    	int[] a = new int[array.length];
    	if(Math.abs(start) <= array.length)
    	{
    		if(start < 0)
    		{
    			for(int i = array.length + start; i < array.length; i++)
    			{
    				a[inc] = array[i];
    				inc++;
    			}
    		}
    		else if (start >= 0)
    		{
        			for(int i = start; i < start; i++)
        			{
        				a[inc] = array[i];
        				inc++;
        			}
    		}
    	}
    	return new Sequence(a);
    }
    public Sequence slice(int start, int end)
    {
    	int inc = 0;
    	int[] a = new int[array.length];
    	if(start < 0)
    	{
    		for(int i = array.length + start; i < end; i++)
    		{
    			a[inc] = array[i];
    			inc++;
    		}
    	}
    	else if(start >= 0)
    	{
    		if(Math.abs(end) >= Math.abs(start))
    		{
    			for(int i = start; i < end; i++)
    			{
    				a[inc] = array[i];
    				inc++;
    			}
    		}
    	}
    	return new Sequence(a);
    }
    //public Sequence slice(int[] a, int[] b, int[] c)
    //{
    //	return new Sequence(a);
    //}
    
    
    
    
    
    @Override
    public String toString()
    {
        String result = "{";
        if (array.length > 0)
        {
            result += array[0];
            for (int i = 1; i < array.length; i++)
            {
                result += ", " + array[i];
            }
        }
        return result + "}";
    }
    
    public static void main(String[] args)
    {
    	in = new Scanner(System.in);
        Sequence array = new Sequence(new int[]{1, 2, 3, 4, 5});
        
        int start = in.nextInt();
        array.slice(start);
        
        // some informal testing
//        System.out.println("a.slice(0)->" + a.slice(0));
//        System.out.println("a.slice(1)->" + a.slice(1));
//        System.out.println("a.slice(-1)->" + a.slice(-1));
//        System.out.println("a.slice(-2)->" + a.slice(-2));
//        System.out.println("a.slice(5)->" + a.slice(5));
//        System.out.println("a.slice(-5)->" + a.slice(-5));
//        System.out.println("a.slice(0, 5, 2)->" + a.slice(0, 5, 2));
//        System.out.println("a.slice(1, 5, 2)->" + a.slice(1, 5, 2));
//        System.out.println("a.slice(1, 5, 3)->" + a.slice(1, 5, 3));
//        System.out.println("a.slice(2, 5, 3)->" + a.slice(2, 5, 3));
//        System.out.println("a.slice(-1, -6, -1)->" + a.slice(-1, -6, -1));
    }
}
