//Write a program to print first 100 odd numbers.
 
public class OddNumber {
    public static void main(String[] args) {
        
         int count = 0;
       
        int number = 1;

        
        while (count < 100) {
            
            System.out.println(number);
            
            number += 2;

            count++;
        }
    }
}