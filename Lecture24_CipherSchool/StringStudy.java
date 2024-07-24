package Lecture24_CipherSchool;

import java.util.Scanner;
public class StringStudy{
  public static void main(String[] args){
    String name= "CipherSchools";
    String name2="CipherSchools";
    String name3= new String("CipherSchools");
    String name4= new String("cipherSchools");
    System.out.println(name==name2);
    System.out.println(name3==name4);
    System.out.println(name==name3);
    System.out.println("===============================");
    System.out.println("1.CONCATENATION");
    String s1="hello";
    s1=s1+ "peeps";
    System.out.println(s1);
    System.out.println(s1+",How're you doing");
    System.out.println(s1);
    String s2= new String("Hello");
    String s3=new String (" people");
    String s4=s2.concat(s3);
    System.out.println(s4);
    System.out.println(s2);
     System.out.println("===============================");
    System.out.println("2 CHECKING IF STRIGS ARE EQUAL IN VALUE");
    System.out.println(name.equals(name2));
    System.out.println(name.equals(name3));
    System.out.println("==============================");
    System.out.println("3) Creating new String object from character array");
    char arr[]={'C','I','P','H','E','R'};
    String strFromArr = new String(arr);
    System.out.println(strFromArr);

    System.out.println("========================================");
    System.out.println("4.Creating partial String object from character array");
    String partialStrFromArr= new String(arr, 1,3);
    System.out.println(partialStrFromArr);

    String partialStrFromArr2= new String(arr,2,3);
    System.out.println(partialStrFromArr2);

    System.out.println("=========================================");
    System.out.println("5. Changing the case");
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    //name=name.toUpperCase();
    System.out.println(name);//remain same

    System.out.println("============================================");
    System.out.println("6. Splitting");
    System.out.println("Please enter your full name: ");
    Scanner sc= new Scanner(System.in);
    String fullName=sc.nextLine();
    String strArr[] =fullName.split(" ");
    for(int i=0;i<strArr.length;i++)
      {
        System.out.println(strArr[i]);
      }
    System.out.println("Please enter somthing separated by comes: ");
    String csvText=sc.nextLine();
    String csvArr[] =csvText.split(",");
    for(int i=0;i<strArr.length;i++)
      {
        System.out.println(csvArr[i]);
      }
    System.out.println("Please enter somthing separated by dots: ");
    String dotText=sc.nextLine();
    String dotArr[] =dotText.split(",");
    for(int i=0;i<strArr.length;i++)
      {
        System.out.println(dotArr[i]);
      }
    String backSlashText = "hello, I attend \"java\"class";
    String backSlashArr[] = backSlashText.split("/");
    for(int i=0;i<backSlashArr.length;i++)
      {
        System.out.println(backSlashArr[i]);
      }
    System.out.println("============================================");
    System.out.println("7.Length of a String");
    int len = name.length();
    System.out.println("Length of: " +name+"is: "+len);
     
    System.out.println("============================================");
    System.out.println("8.Finding index of a char in a String");
    int index = name.indexOf('e');
    System.out.println("Index of 'e' in : " +name+"is: "+index);
      
    int index2 = name.indexOf('E');
    System.out.println("Index of 'E' in : " +name+"is: "+index2);

    int index3 = name.indexOf("'School'");
    System.out.println("Index of School in : " +name+"is: "+index3);

    int index4 = name.indexOf('o',10);
    System.out.println("Index of 'o' in : " +name+"is: "+index4);
    int indexOfo=0;

    //while(indexOfo != -1)
    while(true)
      {
        indexOfo = name.indexOf('o',indexOfo +1);
        if(indexOfo == -1) break;
        System.out.println("O found at: " +indexOfo);
      }
    System.out.println("==========================================");
    System.out.println("9. Extract a Substring");
    String wf = "Wakanda Forever";
    String subString = wf.substring(3);
    System.out.println(subString);

    String subString2 = wf.substring(3,7);
    System.out.println(subString2);

    System.out.println("=============================");
    System.out.println("10.Findidng a character at a given index");
    System.out.println(name.charAt(4));
    char charAtIndex = name.charAt(6);
    System.out.println(charAtIndex);

    System.out.println("===============================");
    System.out.println("11.char Array from a String");
    char arr2[]=name.toCharArray();
    for(int i=0;i<arr2.length;i++){
      System.out.println(arr2[i]);
    }
    System.out.println("===================================");
    System.out.println("12. Char Array from a String");
    String emptyString = new String();
    String emptyString2 ="";
    String blankString= "       ";
    System.out.println(emptyString);
    System.out.println(emptyString2);
    System.out.println(emptyString.equals(""));
    System.out.println(emptyString2.equals(""));
    System.out.println(emptyString.isEmpty());
    System.out.println(emptyString2.isEmpty());
    System.out.println(blankString.isEmpty());
    System.out.println(emptyString.isBlank());

    System.out.println("=====================================");
    System.out.println("13. Comparing string lexicongraphically -> alphabetically");
    String textOne ="QHey!";
    String textTwo ="QBye";
    System.out.println(textOne.compareTo(textTwo));
    System.out.println(textTwo.compareTo(textOne));
    System.out.println(textOne.compareTo(textOne));
    
    System.out.println("===========================");
    System.out.println("14. Trimming white spaces from front and end");
    String s5 = new String("Hello            ");
    String s6 = new String("          Hello             ");
    String s7= new String("               Hello      prople           ");
    System.out.println("*" + s5.trim() +"*");
    System.out.println("*" + s6.trim() +"*");
    System.out.println("*" + s7.trim() +"*");

    System.out.println("==================");
    System.out.println(name.replace('o','O'));
    System.out.println(name.replace("oo", "oooo"));
  }
}