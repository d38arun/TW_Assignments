public class FizzBuzz {
    public void fizzBuzz() {
        for (int counter = 1; counter <= 100; counter++) {
            if ((counter % 3 == 0) && (counter % 5 == 0)) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (counter % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            if (counter % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            System.out.println(counter);
        }
    }
    public static void main(String [] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz();
    }
}


