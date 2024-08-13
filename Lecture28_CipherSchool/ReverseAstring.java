package Lecture28_CipherSchool;

public class ReverseAstring{
    public static void main(String[] args){
      String s1="CipherSchools";
      int n=s1.length();
      char arr[]=new char[n];
      for(int i=0;i<n;i++){
        arr[i]=s1.charAt(n-1-i);
      }
      String rev= new String(arr);
      System.out.println(rev);
      String res= new String();
      for(int i=n-1;i>=0;i--){
        res=res+s1.charAt(i);
      }
      System.out.println(res);
      char StrArr[] =  s1.toCharArray();
      int l=0;
      int r=n-1;
      while(l<r){
        char temp=StrArr[l];
        StrArr[l] =StrArr[r];
        StrArr[r]=temp;
        l++;
        r--;
      }
      String result = new String(StrArr);
      System.out.println(result);
    }
  }
