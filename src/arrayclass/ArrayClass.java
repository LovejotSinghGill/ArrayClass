
package arrayclass;
import java.util.Scanner;
public class ArrayClass {

    
    public static void main(String[] args) {
       /* 
        
       myLetters[0] ='L';
       myLetters[1] ='O';
       myLetters[2] ='V';
       myLetters[3] ='E';
       myLetters[4] ='1';
       
       for(int i=0; i<myLetters.length; i++){
           System.out.println(myLetters[i]);
       }*/
        System.out.println("Enter a word");
        Scanner input=new Scanner(System.in);
        String myWord= input.nextLine();
        char[] myLetters= new char[myWord.length()];
        
        for(int i=0; i<myLetters.length; i++){
            myLetters[i]=myWord.charAt(i);
           System.out.print(myLetters[i]);
        }
        System.out.println("Printing in reverse");
        for(int i=myLetters.length-1; i>=0; i--)
            System.out.print(myLetters[i]);
    }
    
    
}
