package com.piobro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array =  {1, 5, 3, 7, 11, 9, 15};
        reverse(array);

    }

    public  static void reverse( int[] array ){
        int [] reversedArray = new int[array.length];
        int j=0;

        for (int i = reversedArray.length-1; i>=0;i-- ){
            reversedArray[j]= array[i];
            j++;

        }

        System.out.println("Reversed array is: " + Arrays.toString(reversedArray));

    }
}
