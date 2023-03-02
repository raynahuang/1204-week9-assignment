import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        
        try {
            long factorial = calculateFactorial(n);
            System.out.printf("%d! = %d\n", n, factorial);
        } catch (NegativeException e) {
            System.err.println(e.getMessage());
        }
    }

    public static long calculateFactorial(int n) throws NegativeException {
        if (n < 0) {
            throw new NegativeException("Negative numbers are not allowed!");
        }

        long factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}

class NegativeException extends Exception {
    public NegativeException(String message) {
        super(message);
    }
}
