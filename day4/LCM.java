public class LCM {
    puublic static int findGCD(int a,int b){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
}
public ststic int findLCM(int a,int b){
    return(a*b) / findGCD(a,b);
}
public static void main(Strinf[] args){
    int num1 = 30, num = 60;
    int lcm=findLCM(num1,num2);
    System.out.println("The LCM of " +num1 + " and " + num2 + "is: " + lcm);
}
