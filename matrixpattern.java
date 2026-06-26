public class matrixpattern{
    public static void main(String[]args){
        int n=4;
        int temp=1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(temp+" ");
                    temp++;
                }
            }
            else{
                int start=temp+n-1;
                for(int j=0;j<n;j++){
                    System.out.print(start+" ");
                    start--;
                }
                temp+=n;
            }
            System.out.println();
        }
    }
}