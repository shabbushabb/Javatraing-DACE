import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int a=Scanner.nextInt();
        if(a>=90&&a<100){
            System.out.println("you grade is A");
        }
        else if(a>80&&a<70){
        System.out.println("your grade is B");
        }
        else if(a>70&&a<60){
            System.out.println("your grade is C");
        }
        else if(a>70&&a<60){
            System.out.println("your grade is C");
        }

        else{

        System.out.println("you are failed");

       }
    }
}
    
