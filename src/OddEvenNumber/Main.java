
package OddEvenNumber;

import java.util.Scanner;

public class Main {
    
    private static int number ;
    
    public static void main(String[] args) {
     

        Scanner sc = new Scanner(System.in);
        
       
        while(true){
        try{
            System.out.print("Enter the numeber : ");
            number = sc.nextInt();
         
        }catch(Exception e)
        {
            
           System.out.println("You must enter the number without a comma"); 
           break;
        }
         // with this equation we fixing the number is even or odd
        if(number %2 == 0)  
          System.out.println("The number " + number + " is even");                     
        else 
          System.out.println("The number " + number + " is odd");   
        break;
        }
                   
    
    }
    }   
    

