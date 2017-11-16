import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String [] args){
        PrintRightAngleTriangle triangle = new PrintRightAngleTriangle();
        triangle.inputLength();
        triangle.drawRightTriangle();
    }
}
class PrintRightAngleTriangle{
    private int stepLength;
    public void inputLength(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter step length");
        int length = in.nextInt();
        stepLength = length;
    }
    public void drawRightTriangle(){
        for(int index = 0; index < stepLength; index++)
        {
            drawStep(index);
        }
    }
    public void drawStep(int stepValue){
        for(int index = 0; index <= stepValue; index++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}