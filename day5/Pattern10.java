public class Pattern10 {
    public static void main(String[] args) {
        int count=1;
        int n=5;
        for(int var1 = 1; var1 <= n; ++var1) {
            for(int var2 = 1; var2 <= var1; ++var2) {
               System.out.print(count+ " ");
               count++;
            }
   
            System.out.println();
    }
}
}
