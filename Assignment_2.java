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
    public static void displayMenu(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Find minimum");
            System.out.println("2. Find maximum");
            System.out.println("3. Find average and differences from average");
            System.out.println("4. Sum of elements with odd- and even-numbered indexes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) 
            {
                System.out.println("Minimum: " + findMin(arr));
            } 
            else if (choice == 2) 
            {
                System.out.println("Maximum: " + findMax(arr));
            } 
            else if (choice == 3) 
            {
                double average = findAverage(arr);
                System.out.println("Average: " + average);
                double[] differences = diffFromAverage(arr);
            } 
            else if (choice == 4) 
            {
                System.out.println("Sum of elements with odd indexes: " + sumOddIndexes(arr));
                System.out.println("Sum of elements with even indexes: " + sumEvenIndexes(arr));
            } 
            else if (choice == 5) 
            {
                System.out.println("Exiting the program.");
            } 
            else 
            {
                System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
        scanner.close();

        
    }

    public static int sumOddIndexes(int[] arr){

        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] % 2 == 1){
                sum += arr[i];
            }
        }

        return sum;
    }

    public static int sumEvenIndexes(int[] arr){

        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        Random random = new Random ();
        boolean valid = false;
        int userInput = 0;

        System.out.print("Please enter a positive integer for the size of the array: ");

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
        displayMenu(randomizedArray);

    }
}
