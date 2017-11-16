public class Diamond {
    public static void main(String [] args){
        DrawDiamond drawDiamond = new DrawDiamond();
        drawDiamond.inputWidth();
        drawDiamond.drawTriangle();
        drawDiamond.drawLowerHalfDiamond(drawDiamond.getTriangleWidth());
    }
}

class DrawDiamond extends DrawIsocelesTriangle{
    public void drawLowerHalfDiamond(int trianglewidth){
        for(int index = 1; index < trianglewidth; index++)
        {
            drawLowerSpaces(index);
            drawLowerStars(trianglewidth - index);
            System.out.println();
        }

    }
    public void drawLowerSpaces(int numSpaces)
    {
        for(int inner_index = 0; inner_index < numSpaces; inner_index++)
        {
            System.out.print(" ");
        }
    }
    public void drawLowerStars(int numStars)
    {
        for(int inner_index = 0; inner_index < numStars; inner_index++)
        {
            System.out.print(" * ");
        }
    }
}
