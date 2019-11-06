/**
 * This program experiments with the String hashing function
 * and distributes 5757 5-letter words into 5749 buckets.
 * Stats are collected and displayed.
 * 
 * @author your name here
 * @version date here
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashRunner
{
    public static final int SIZE = 5749;
    public static void main(String[] args)
    {

        int[] x = new int[SIZE];

        try
        {
            File words = new File("sgb-words.txt");
            Scanner in = new Scanner(words);

            // TODO: Complete program . . .
            
            
            
            System.out.println("The number of empty buckets is " /*here*/);
            System.out.println("The longest chain in a bucket is " /*here*/);
            System.out.println("The average length of a chain is " /*here*/);
            in.close();   
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}
