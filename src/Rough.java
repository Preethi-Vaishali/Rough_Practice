import java.util.Scanner;

public class Rough {
	 public static int focal_length(int R , char Mirror) {

	     int r=0;
	     double r1=0;
	         if(Mirror == '(' ){
	         r1 = Math.floor(R/2);
	         
	         }
	        else if(Mirror == ')' ){
	         r1= -(Math.round(R/2));
	         
	        }
	       System.out.println(r1);
	       r = (int)r1;
	         return r;
	      }
	      

	      public static void main(String[] args) {

	          Scanner scanner = new Scanner(System.in);
	          int R = scanner.nextInt();
	          char Mirror = scanner.next().charAt(0);

	         System.out.println(focal_length(R,Mirror));

	        }
}
