import java.util.*; 
public class Prime {

  public static void main(String[] args) {

    Scanner a= new Scanner(System.in);     
    System.out.print("Please insert any number: ");  
    int num= a.nextInt();  
    
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
     
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (flag == true)
       System.out.println(num + " is not a prime number.");
    else
       System.out.println(num + " is a prime number.");
      
  }
}
