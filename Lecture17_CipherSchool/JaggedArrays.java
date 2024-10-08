package Lecture17_CipherSchool;

public class JaggedArrays {
    static void printJaggedArray(int arr[][]) {
        // printing jagged array properly
        // All rows in separated lines
        for (int i = 0; i < arr.length; i++)// rows
        {
            for (int j = 0; j < arr[i].length; j++)// columns
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];

        printJaggedArray(arr);

        int arr2[][] = new int[3][];
        // arr2[0]={1,2,3};
        // arr2[1]={2,3}
        // arr2[2]={4,5,6}

        arr2[0] = new int[] { 1, 2, 3 };
        arr2[1] = new int[] { 2, 3 };
        arr2[2] = new int[] { 4, 5, 6 };
        System.out.println("********______*******_______******");
        printJaggedArray(arr2);
    }
}