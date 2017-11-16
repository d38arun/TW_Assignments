import java.util.Scanner;

public class IsocelesTriangle {
    public static void main(String [] args){
        DrawIsocelesTriangle drawIsocelesTriangle = new DrawIsocelesTriangle();
        drawIsocelesTriangle.inputWidth();
        drawIsocelesTriangle.drawTriangle();
    }
}
class DrawIsocelesTriangle{
    private int triangleWidth;
    public void inputWidth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter triangle width");
        int width = in.nextInt();
        this.triangleWidth = width;
    }
    public void drawTriangle()
    {
        for(int index = 0; index < triangleWidth; index++)
        {
            drawSpaces(index);
            drawStars(index);
            System.out.println();
        }

    }
    public  void drawSpaces(int index){
        for(int inner_index = index; inner_index < triangleWidth - 1; inner_index++)
        {
            System.out.print(" ");
        }
    }
    public  void drawStars(int index){
        for (int inner_index = 0; inner_index <= index; inner_index++)
        {
            System.out.print(" * ");
        }
    }
}
