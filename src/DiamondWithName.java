import java.util.Scanner;

public class DiamondWithName {
    public static void main(String [] args){
        DrawDiamondWithName drawDiamondWithName = new DrawDiamondWithName();
        drawDiamondWithName.inputWidth();
        drawDiamondWithName.drawUpperDiamond();
        drawDiamondWithName.writeName();
        drawDiamondWithName.drawLowerDiamond();
    }
}
class DrawDiamondWithName{
    private int baseWidth;
    public void inputWidth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base width");
        this.baseWidth = in.nextInt();

    }
    public void drawUpperDiamond(){
        for(int index = 0; index < baseWidth - 1; index++)
        {
            drawSpaces(baseWidth - index - 1);
            drawStars(index + 1);
            System.out.println();
        }
    }
    public void drawSpaces(int numSpaces){
        for(int inner_index = 0; inner_index < numSpaces; inner_index++)
        {
            System.out.print(" ");
        }
    }
    public void drawStars(int numStars){
        for(int inner_index = 0; inner_index < numStars; inner_index++)
        {
            System.out.print(" * ");
        }
    }
    public void writeName(){
        System.out.print("Debarun");
        System.out.println();
    }
    public void drawLowerDiamond(){
        for(int index = baseWidth - 1; index > 0; index--)
        {
            drawSpaces(baseWidth - index);
            drawStars(index);
            System.out.println();
        }
    }
}