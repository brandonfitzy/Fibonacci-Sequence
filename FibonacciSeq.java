import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeq {

    public static void main(String[] args) {
        System.out.println("How many elements of the Fibonacci Sequence would you like me to print?");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x0 = 0;
        int x1 = 1;
        int[] fibSeq = new int[n];
        for (int i = 0; i < n; i++)
            if (i == 0) {
                fibSeq[i] = x0;
            } else if (i == 1) {
                fibSeq[i] = x1;
            } else {
                int sum = x1 + x0;
                fibSeq[i] = sum;
                x0 = x1;
                x1 = sum;
            }

        System.out.println(Arrays.toString(fibSeq));
    }
    }

