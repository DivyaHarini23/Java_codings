public class missingval {
    public static void main(String[] args) {
        int num=5;
        int[] binary=new int[32];
        int i=0;
        while(num>0){
            binary[i]=num%2;
            num=num/2;
            i++;

        }

        System.out.println("Binary num is");
        while(i>0){
            i--;
            System.out.print(binary[i]);
        }
    }
}
