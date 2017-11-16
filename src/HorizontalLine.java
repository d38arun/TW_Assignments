import java.util.Scanner;

public class HorizontalLine {
    public static void main(String [] args)
    {
        PrintHorizontalLine draw = new PrintHorizontalLine();
        draw.lengthInput();
        draw.drawHorizontalLine();
    }
}

class PrintHorizontalLine{
    private int length;
    public void lengthInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        int length= in.nextInt();
        this.length = length;
    }
    public void drawHorizontalLine(){
        for(int index = 0; index < this.length; index++)
        {
            System.out.print("*");
        }
    }
}
