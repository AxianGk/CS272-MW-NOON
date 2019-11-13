package occ.cs272.h07.src;

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
            String word;
            while(in.hasNext())
            {
                word = in.next();
                int h = word.hashCode();
                if(h < 0) { h = -h; }
                int i = h % SIZE;
                x[i] += 1;;
            }
            int num = 0;
            int a = 0;
            double avg = 0;
            for(int i = 0; i < SIZE; i++)
            {
                if(x[i] == 0) num++;
                else
                {
                    if(x[i] > x[a]) a = i;
                    avg += x[i];
                }
            }
            avg = avg / (SIZE - num);
            
            
            System.out.println("The number of empty buckets is " + num);
            System.out.println("The longest chain in a bucket is " + a);
            System.out.println("The average length of a chain is " + avg);
            in.close();   
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}
