import java.util.Arrays;
import java.util.Scanner;

//Prints the Fibonacci Sequence up to n elements

public class FibonacciSeq {

    public static void main(String[] args) {
        //asking the user how many elements they want printed
        System.out.println("How many elements of the Fibonacci Sequence would you like me to print?");
        Scanner input = new Scanner(System.in);
        //setting n to the number of elements requested
        int n = input.nextInt();
        //intializing the first two values of the FibSeq
        int x0 = 0;
        int x1 = 1;
        //new empty integer arrray of length n
        int[] fibSeq = new int[n];
        //for loop to add values to the array
        for (int i = 0; i < n; i++)
            //first index is 0
            if (i == 0) {
                fibSeq[i] = x0;
                // second index is 1
            } else if (i == 1) {
                fibSeq[i] = x1;
            } else {
                //otherwise the next index is the sum of the previous two
                int sum = x1 + x0;
                //adding on next index value
                fibSeq[i] = sum;
                //changing values of previous indexs
                x0 = x1;
                x1 = sum;
            }
        //printing the sequence to n elements
        System.out.println(Arrays.toString(fibSeq));
    }
    }

