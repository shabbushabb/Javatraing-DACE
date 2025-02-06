import java.util.Scanner;
public class Foctors {
    public static void main(String[] args) {
        //for(i=1;i<=60;i++){
           // if(60%i==0){
            //  System.out.println(i);
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 2; i<= n/2 ;i++){
                if(n%i==0){
                    System.out.println(i+" ");
                }
            }
        }
    }

  
    

