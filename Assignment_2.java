import java.util.Scanner;
import java.util.Random;

public class Assignment_2 {
    public static int findSum (int[] arr){
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double findAverage (int[] arr){
        return (double)findSum(arr) / arr.length;
    }

    public static double[] diffFromAverage (int[] arr){
        double[] diffArray = new double[arr.length];
        double average = findAverage(arr);
        for (int i = 0; i < arr.length; i++) {
            diffArray[i] = arr[i] - average;
        }
        return diffArray;
    }

    public static int findMin(int[] arr){

        int min = 101;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        return min ;
    }

    public static int findMax(int[] arr){

        int max = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        return max ;
    }

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        Random random = new Random ();
        boolean valid = false;
        int userInput = 0;

        System.out.println ("Please enter a positive integer for the size of the array: ");

        //Checking for valid inputs for the size of the array
        do { 
            if (!in.hasNextInt ()) {
                System.out.println ("Invalid input, please enter a positive integer.");
            } 
            else {
                userInput = in.nextInt ();

                if (userInput <= 0) {
                    System.out.println ("Invalid input, please enter a positive integer.");
                } 
                else {
                    valid = true;
                }
            }
        } while (!valid);

        //Creating and displaying the array
        int [] randomizedArray = new int [userInput];

        for (int i = 0; i < userInput; i++) {
            randomizedArray [i] = random.nextInt (101);
        }

        System.out.println ("The array containing random integers at first: ");

        for (int i = 0; i < randomizedArray.length; i++) {
            System.out.print (randomizedArray[i] + " ");
        }

        System.out.println ();

    }

}
