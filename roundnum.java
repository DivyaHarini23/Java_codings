import java.util.*;
public class roundnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int rem= n%10;
        if(rem<=4){
            System.out.println(n-rem);
        }
        else if(rem>5){
System.out.println(n+10-rem);
        }
        else{
            System.out.println(n);
        }
    }
}
