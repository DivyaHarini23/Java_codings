import java.util.*;

public class ReverseString {
    public static void main(String[] args) {

        String str="This is world";
        char[] arr=str.toCharArray();

        int left=0;
        int right=arr.length-1;

        while(left<right){

            if(arr[right]==' '||arr[right]==','||arr[right] == '-') {
                right--;
            }
            else if (arr[left] == ' ' || arr[left] == ',' || arr[left] == '-') {
                left++;
            }
            else {
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                right--;
                left++;
            }
        }

        System.out.println(new String(arr));
    }
}