package org.example.problemsolving;

public class InsertionSort {

    void sort (int[] arr) {
        int temp, j;
        for(int i = 1; i < arr.length; i++){
             j = i -1;
             temp = arr[i];
             while (j >= 0 && arr[j] > temp){
                arr[j +1] = arr[j];
                --j;
            }
            arr[j + 1] = temp;
        }
    }


    public static void main(String[] args) {

        /**
         * 5 4 2 5 3 1
         * 3 11 4 200
         * */
        int [] arr = {5 ,4 ,2 ,5 ,3 ,1};

        new InsertionSort().sort(arr);
        for (int i : arr) {
            System.out.printf("%s ", i);
        }
    }
}
