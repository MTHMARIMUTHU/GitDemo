

import java.util.Scanner;

public class IntNext {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int count=1;
     int sum=0;
     while (count <11) {
     	
     	 System.out.println("Enter the no " +count +" : ");
          boolean hasNext = scanner.hasNextInt();
     	 if(hasNext)
     	{
         int nosOfSum = scanner.nextInt();
     	scanner.nextLine();
     	count ++;
     	sum =sum+nosOfSum;        	
          // handle next line character (enter key)
        
     }
     	 else {
              System.out.println("it is not valid no");
              break;
     
     }
     	
     
     
     }
     System.out.println("Total Sum: "+sum);
     scanner.close();
 }
    
}


