package com.louay.projects.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = arrayInitialize(input);
        Arrays.parallelSort(arr);
        System.out.printf("minimum sum is : %d \nmaximum sum is %d",miniSum(arr),maxSum(arr));
    }

    public static int[] arrayInitialize(Scanner input) {
        int length = arrayLengthInput(input);
        int[] arr = new int[length];
        System.out.println("please fill an array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("please input " + (i+1) + " element");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static int arrayLengthInput(Scanner input) {
        System.out.print("please input number of element: ");
        int length = input.nextInt();
        if (length < 4) {
            System.out.println("number of element must be greater than 4 ");
            length = arrayLengthInput(input);
        }
        return length;
    }

    public static long miniSum(int [] arr){
        long result = 0;
        for (int i = 0; i < arr.length ; i++) {
            result += arr[i];
            if (i == 3){
                break;
            }
        }
        return result;
    }

    public static long maxSum(int [] arr){
        long result = 0;
        int counter = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            result += arr[i];
            counter++;
            if (counter == 4){
                break;
            }
        }
        return result;
    }

}
