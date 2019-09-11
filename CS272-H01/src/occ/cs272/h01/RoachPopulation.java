/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author <xzhao4>
 * @version <09/09/2019>
 *
 */
public class RoachPopulation
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "xzhao4";
    public static final String ASSIGNMENT = "H01-A";

    // TODO: Complete the RoachPopulation class
    private int population;
    
    
    public RoachPopulation(int Population)
    {
    	this.population = Population;
    }
    
    public void breed()
    {
    	population *= 2;
    }
    public void spray()
    {
    	population *= 0.9;
    	if(population*10%9 > 0)
    	{
    		population++;
    	}
    }
    public int getRoaches()
    {
    	return population;
    }
    
    public static void main(String[] args)
    {
    	RoachPopulation r = new RoachPopulation(10);
    	for(int i = 0; i < 3; i++)
    	{
    		r.breed();
    		r.spray();
    	}
    }
    
}
