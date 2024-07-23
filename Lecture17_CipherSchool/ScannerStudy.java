package Lecture17_CipherSchool;


import java.util.Scanner;

public class ScannerStudy{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter your First Name: ");
    String firstName=sc.nextLine();//It will input till a space occurs
    System.out.println("please enter your Last Name: ");
    String lastName=sc.nextLine();
    System.out.println("please enter your profession: ");
    String profession = sc.nextLine();
    System.out.println("please enter your address: ");
    String address=sc.nextLine();
    System.out.println("please enter house number: ");
    int number =sc.nextInt();


    System.out.println("First Name: "+firstName);
    System.out.println("Last Name: "+ lastName);
    System.out.println("Profession: "+profession);
    System.out.println("Address: "+address);
    System.out.println("House Number: "+number);
    
    //Whenever we need to take mixed inputs like:
    // 1. Number and Strings both are there
    // 2. words from a single line then complete next line or something like that
  }
}