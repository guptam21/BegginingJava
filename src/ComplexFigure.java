/*
complex figure homework
Mahek Gupta
9/16/19
version 1
 */

public class ComplexFigure
{
    public static final int COUNT=4;
    public static void main (String [] args)
    {
        line();
        top();
        bot();
        line2();
    }
    public static void line()
    {
        dash();
    }
    public static void top()
    {
        for ( int line = 1; line<=COUNT; line++)
        {
            System.out.print("|");
            space(line);
            System.out.print("<>");

            for (int dot = 0; dot<4*line-COUNT; dot++)
            {
                System.out.print(".");
            }
            System.out.print("<>");
            space(line);
            System.out.println("|");
        }

    }
    public static void bot()
    {
        for ( int line2 = 1; line2<=COUNT; line2++)
        {
            System.out.print("|");
            space2(line2);
            System.out.print("<>");

            for (int dot = 0; dot<-4*line2+COUNT*4; dot++)
            {
                System.out.print(".");
            }
            System.out.print("<>");
            space2(line2);
            System.out.println("|");
        }
    }
    public static void line2()
    {
        dash();
    }
    public static void dash()
    {
        System.out.print("#");
        for (int dash = 0; dash< COUNT * 4; dash++)
        {
            System.out.print("=");
        }
        System.out.println("#");
    }
    public static void space(int line)
    {
        for (int space = 1; space <= line * -2 + COUNT * 2; space++)
        {
            System.out.print(" ");
        }
    }
    public static void space2(int line2)
    {
        for (int space = 1; space <= line2 * 2- COUNT /2; space++)
        {
            System.out.print(" ");
        }
    }
}
