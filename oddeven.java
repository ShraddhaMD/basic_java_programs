import java.util.Scanner;
public class oddeven {
	 public static void main(String args[]){
	      int num;
	      System.out.println("Enter a number ::");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();

	      if (num %2== 0){
	         System.out.println("Given number is a even");
	      } else {
	         System.out.println("Given number is odd");
	      } 
	   }
}


