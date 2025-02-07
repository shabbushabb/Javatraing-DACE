public class Swap {
    public static void main(String[] args) {
        int a=5,b=7;

        // int c=a;             // int temp=a;
         //a=b;                 //a=b;
         //b=c;                 //b=tem;

         a=a+b;
         b=a-b;
         a=a-b;

         System.out.println(a+" "+b);
    }
}
