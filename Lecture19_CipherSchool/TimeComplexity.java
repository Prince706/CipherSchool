package Lecture19_CipherSchool;

public class TimeComplexity{
    static boolean isPrimeRam(int n){
      if(n<=1) return false;
      if(n==2) return true;
      for(int i=2;i<n;i++)
        {
          if(n%i==0) return false;
        }
      return true;
    }
    static boolean isPrimeSham(int n){
      if(n<=1) return false;
      if(n==2) return true;
      for(int i=2;i<Math.sqrt(n);i++)
        {
          if(n%i==0) return false;
        }
      return true;
    }
    
    public static void main(String[] args){
      int n=100;
      long start = System.currentTimeMillis();
      System.out.println(isPrimeRam(n));
      long end = System.currentTimeMillis();
      System.out.println("Time by RAM's approach: "+ (end-start));
      
      start = System.currentTimeMillis();
      System.out.println(isPrimeSham(n));
       System.out.println(isPrimeSham(n));
      System.out.println("Time by SHAM's approach: "+(end-start));
    }
  }