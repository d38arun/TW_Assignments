import java.util.Scanner;

public class VerticalLine {
    public static void main(String [] args)
    {
        PrintVerticalLine draw = new PrintVerticalLine();
        draw.lengthInput();
        draw.drawVerticalLine();
    }
}

class PrintVerticalLine{
    private int length;
    public void lengthInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        int length= in.nextInt();
        this.length = length;
    }
    public void drawVerticalLine(){
        for(int index = 0; index < this.length; index++)
        {
            System.out.println("*");
        }
    }
}