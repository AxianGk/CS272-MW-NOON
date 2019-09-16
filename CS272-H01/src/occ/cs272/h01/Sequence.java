/**
 * CS 272 - Fall 2019
 * H01-Sequence.java
 */
package occ.cs272.h01;

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
    	//if(Math.abs(start) <= array.length)
    	//{
    	    if(start >= 0)
    	    {
    	        for(int i = start; i < array.length; i++)
    	        {
    	            a[inc] = array[i];
                    inc++;
    	        }
    	    }
    	    else
    	    {
    	        for(int i = array.length + start; i < array.length; i++)
    	        {
    	            a[inc] = array[i];
    	            inc++;
    	        }
    	    }
    	//}
    	return new Sequence(a);
    }
    public Sequence slice(int start, int end)
    {
    	int inc = 0;
    	int[] a = new int[array.length];
    	if(Math.abs(start) <= array.length)
    	{
    	    for(int i = Math.abs(start); i < end; i++)
            {
                a[inc] = array[i];
                inc++;
            }
    	}
    	return new Sequence(a);
    }
    public Sequence slice(int start, int end, int step)
    {
        int inc = 0;
        int[] a = new int[array.length];
        if(Math.abs(start) <= array.length)
        {
            if(start < 0 || end < 0 || step < 0)
            {
                for(int i = array.length + start; i > array.length + end; i += step)
                {
                    a[inc] = array[i];
                    inc++;
                }
            }
            else
            {
                for(int i = start; i < end; i += step)
                {
                    a[inc] = array[i];
                    inc++;
                }
            }
        }
    	return new Sequence(a);
    }
    
    
    
    
    
    @Override
    public String toString()
    {
       String result = "{";
        if (array.length > 0 && array[0] != 0)
        {
            result += array[0];
            for (int i = 1; i < array.length; i++)
            {
                if(array[i] != 0)
                {
                    result += ", " + array[i];
                }
            }
        }
        return result + "}";
    }
    
    public static void main(String[] args)
    {
        Sequence a = new Sequence(new int[]{1, 2, 3, 4, 5});      
        // some informal testing
        //System.out.println("a.slice(0)->" + a.slice(0));
        //System.out.println("a.slice(1)->" + a.slice(1));
        //System.out.println("a.slice(-1)->" + a.slice(-1));
        //System.out.println("a.slice(-2)->" + a.slice(-2));
        //System.out.println("a.slice(5)->" + a.slice(5));
        //System.out.println("a.slice(-5)->" + a.slice(-5));
        //System.out.println("a.slice(0, 5, 2)->" + a.slice(0, 5, 2));
        //System.out.println("a.slice(1, 5, 2)->" + a.slice(1, 5, 2));
        //System.out.println("a.slice(1, 5, 3)->" + a.slice(1, 5, 3));
        //System.out.println("a.slice(2, 5, 3)->" + a.slice(2, 5, 3));
        //System.out.println("a.slice(-1, -6, -1)->" + a.slice(-1, -6, -1));
    }
}
