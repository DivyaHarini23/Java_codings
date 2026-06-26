public class midThree {
    public static void main(String[]args){

        int[] arr={1,4,5,7,1,3,7};
int n=arr.length;
int mid=n/2;
int[] res= new int[3];
int a=arr[mid-1];
int b=arr[mid];
int c=arr[mid+1];

System.out.println("Mid three is"+" "+a+" "+b+" "+c);


    }
    
}
