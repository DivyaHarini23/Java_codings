public class Recursion {
    public static void main(String[] args) {
        int a=10;
        print(a);
    }
    static void print(int n){
        if(n<=0)
        {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    
}
