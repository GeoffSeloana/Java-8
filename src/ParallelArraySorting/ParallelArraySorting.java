package ParallelArraySorting;

import java.util.Arrays;

public class ParallelArraySorting {

    public static void main(String[] args){

        int[] array = {9,4,5,3,1,7,2};

        //Arrays.parallelSort(array);

//        for(int i: array){
//            System.out.print(i + " ");
//        }

        Arrays.parallelSort(array, 0, 3);

        for(int i : array){
            System.out.print(i + " ");
        }



    }

}
