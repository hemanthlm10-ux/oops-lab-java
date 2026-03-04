import java.util.*;
public class Swap{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("a :");
int a= input.nextInt();
System.out.print("b :");
int b= input.nextInt();
int t=a;
a=b;
 
b=t;
System.out.println(a);
System.out.print(b);

}

}