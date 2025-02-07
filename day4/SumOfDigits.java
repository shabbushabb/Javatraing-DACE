public class SumOfDigits {
    public static void main(String[] args) {  
      rem=n%10;
     int n=1234;
  int sum=0;
  int rem=0;
  while(n!=0)
  {
    sum=sum+rem;
      n=n/10;
  }
  System.out.println(sum);
}
}

    
