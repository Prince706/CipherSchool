package Lecture16_CipherSchool;
public class MultiDimArrays{
    public static void main(String[] args){
      int row=5;
      int cols=3;
      int arr[][]=new int[row][cols];//Array creation Expression
  
      for(int i=0;i<arr.length;i++)//i->for rows
        {
          for(int j=0;j<arr[0].length;j++)//leaving fine as one row printing completed here
            {
              System.out.print(arr[i][j]+" ");
            }
          System.out.println();//leaving fine as one row printing here
        }
      System.out.println("********************************");
      //Array initializers list
      //we wnat to create the following array
      // 1 2 3
      // 4 5 6
      // 7 8 9
      int arr2[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };
       for(int i=0;i<arr2.length;i++)//i->for rows
        {
          for(int j=0;j<arr2[0].length;j++)//leaving fine as one row printing completed here
            {
              System.out.print(arr2[i][j]+" ");
            }
          System.out.println();//leaving fine as one row printing here
        }
    }
  }