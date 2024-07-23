package Lecture15_CipherSchool;


public class ArrayStudy {
    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int size = 5;
        int arr[] = new int[size];//combination of 19 and 20
        //int arr[],int [] arr, int []arr => all are same
        // int arr[] -> Array Decalartion expression
        //arr = new int[size]; ->creation of object
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        print(arr);

        for (int i = 0; i < size; i++) {
            arr[i] = i+1;
        }
        print(arr);

        int arr2[] = {1,2,3};
        print(arr2);

        int copyArray[] = new int[2*size];
        for (int i = 0; i < size; i++) {
            copyArray[i] = arr[i];
        }
        copyArray[5] = 6;
        copyArray[6] = 7;
        print(copyArray);
    }
}