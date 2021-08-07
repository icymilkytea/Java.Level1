import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main (String[] args) {
        //Task1
        int[] arr1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        zeroToOneOneToZero(arr1);
        System.out.println(Arrays.toString(arr1));
        //Task2
        int[] arr2 = new int[100];
        fromOneToHundred(arr2);
        System.out.println(Arrays.toString(arr2));
        //Task3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        lessSixMultiplyByTwo(arr3);
        System.out.println(Arrays.toString(arr3));
        //Task4
        int[][] table = new int[3][3];
        diagonalWithOne(table);
        printArr((table));
        //Task5
        int len = 5;
        int initialValue = 6;
        int[] arr5 = createArr(len, initialValue);
        System.out.println(Arrays.toString(arr5));
        //Task6*
        int[] arr6 = { 11, 2, 3, 7, 15, 0, -1, 0 };
        findMinAndMax(arr6);

    }
    //Task1
    public static void zeroToOneOneToZero(int[] arr1) {
       for (int i = 0; i < arr1.length; i++){
           if (arr1[i] == 1){
               arr1[i] = 0;
           }
           else {
               arr1[i] = 1;
           }
       }
    }
    //Task2
    public static void fromOneToHundred(int[] arr2) {
        int num = 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = num++;
        }
    }
    //Task3
    public static void lessSixMultiplyByTwo(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
    }
    //Task4
    public static void diagonalWithOne(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
        }
    }
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    //Task5
    public static int[] createArr(int len, int initialValue) {
        int[] newArr = new int[len];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = initialValue;
        }
        return newArr;
    }
    //Task6*
    public static void findMinAndMax(int[] arr6){
        int min = arr6[0];
        int max = arr6[0];
        for (int i = 1; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i];
            }
            else if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
