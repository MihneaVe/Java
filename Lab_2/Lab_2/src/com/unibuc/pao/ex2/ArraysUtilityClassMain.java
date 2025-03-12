package com.unibuc.pao.ex2;

import java.util.Arrays;

public class ArraysUtilityClassMain {
    public static void main(String[] args){
        int[] unidimensional = new int[] {1,2,3,4,5};
        System.out.println("Unidimensional " + Arrays.toString(unidimensional));

        int [] unidimensional2 = unidimensional.clone();
        System.out.println(unidimensional2 == unidimensional); // false
        System.out.println(unidimensional.equals(unidimensional2)); // false
        System.out.println(Arrays.equals(unidimensional, unidimensional2)); // true


        int[][] bidimensional = new int[][] { {1, 2, 3}, {4, 5} };
        System.out.println("Bidimensional " + Arrays.deepToString(bidimensional));

        int [][] bidimensional2 = bidimensional.clone();
        System.out.println(bidimensional2 == bidimensional); // false
        System.out.println(bidimensional.equals(bidimensional2)); // false
        System.out.println(Arrays.deepEquals(bidimensional, bidimensional2)); // true

        
        long[] longs = new long[]{1, -2, 17, 4, 0};
        Arrays.sort(longs);
        System.out.println("Sorted longs " + Arrays.toString(longs));

        String[] myArray = {"1", "2", "3", "4", "5"};
        String[] myArray2 = Arrays.copyOf(myArray, myArray.length);

        System.out.println("MyArray = Myarray2 (==) " + (myArray == myArray2)); // false
        System.out.println("MyArray = MyArray2 (.equals)" + Arrays.equals(myArray, myArray2)); // true


    }
};
