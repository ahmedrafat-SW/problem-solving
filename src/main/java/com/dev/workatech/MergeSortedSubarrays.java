package com.dev.workatech;

public class MergeSortedSubarrays {

    void merge (int[] arr, int endIndex) {

        int i = 0, j = endIndex +1, k = 0;
        int [] tempArr = new int[arr.length];

        while (i <= endIndex && j < arr.length){
            if (arr[i] >= arr[j]){
                tempArr[k++] = arr[j++];
            } else {
                tempArr[k++] = arr[i++];
            }
        }

        while (i <= endIndex){
            tempArr[k++] = arr[i++];
        }

        while (j < arr.length){
            tempArr[k++] = arr[j++];
        }

        printArrayElements(tempArr);
        arr = tempArr;
        printArrayElements(arr);
    }


    public void mergeSubarrays(int[] array, int endIndex) {
        int start1 = 0, end1 = endIndex;
        int start2 = endIndex + 1, end2 = array.length - 1;

        while (start1 <= end1 && start2 <= end2) {
            if (array[start1] <= array[start2]) {
                start1++;
            } else {
                int value = array[start2];
                System.arraycopy(array, start1, array, start1 + 1, start2 - start1);
                array[start1] = value;

                start1++;
                end1++;
                start2++;
            }
        }
    }

    private static void printArrayElements(int[] res) {
        System.out.println("array = ");
        for (int i : res){
            System.out.printf("%s ", i);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        /**
         * Array: [1, 3, 5, 7, 9, 11, 0, 4, 6, 8]
         * End Index: 5
         * Array after merging: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11]
         * */
        int [] arr = {1, 3, 5, 7, 9, 11, 0, 4, 6, 8};
        int endIndex = 5;
//        new MergeSortedSubarrays().merge(arr, endIndex);
        new MergeSortedSubarrays().mergeSubarrays(arr, endIndex);
        printArrayElements(arr);
    }
}
