package collections.sortingCollections;

import java.util.Arrays;

public class SortingCollectionsExample {
    public static void main(String[] args) {

        // quicksort - to sort primitive types
        //mergesort - to sort reference types

        int[] num={2,3,1,10,7,-1,4,8,34};

        Arrays.sort(num);

        for(int n:num){
            System.out.println(n);
        }
    }
}
