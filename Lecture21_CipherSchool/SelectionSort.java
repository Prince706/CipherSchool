package Lecture21_CipherSchool;


public class SelectionSort{
    public static void main(String[] args){
      int arr[]={3,7,10,11,4,1};
      int n=arr.length;
      for(int i=0;i<n-1;i++)
        {
          int minIndex=i;
          for(int j=i+1;j<n;j++)
            {
              if(arr[j]<arr[minIndex])
              {
                minIndex = j;
              }
            }
          //this index of min elemnt is found in minIndex
          //now we will swap the min element andbring it in its plaxe,
          //i.e. swap elements at minIndex and i.
          int temp =arr[i];
          arr[i]=arr[minIndex];
          arr[minIndex]=temp;
        }
      //Here our array should be sorted
      for(int i=0;i<n;i++)
        {
          System.out.print(arr[i]+"");
        }
      System.out.println();
    }
  }