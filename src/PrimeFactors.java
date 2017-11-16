import java.util.Scanner;

public class PrimeFactors {
    private int number;
    public void setNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        this.number = in.nextInt();
    }
    public void getPrimeFactors(){
        if(number < 2)
        {
            System.out.println("Nil");
        }
        int divisor = 2;
        while(number > 1)
        {
            if(number % divisor == 0)
            {
                System.out.print(divisor + " ");
                number = number / divisor;
                continue;
            }

            divisor++;
        }
    }
    public static void main(String [] args){
        PrimeFactors primeFactors = new PrimeFactors();
        primeFactors.setNumber();
        primeFactors.getPrimeFactors();
    }
}
