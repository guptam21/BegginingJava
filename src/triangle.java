/*
making a triangle
Mahek Gupta
9/13/19
version 1
 */

public class triangle
{
public static final int COUNT=10;
    public static void main (String [] args)
    {
        for(int line=1; line <=COUNT; line++)
        {
            for (int counter = 0; counter < -line + COUNT; counter++)
            {
                System.out.print("*");

            }
            for (int space = 0; space< -line + COUNT; space++)
            {
                System.out.print(" ");
            }
            for (int counter = 0; counter < line; counter++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
