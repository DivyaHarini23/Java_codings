import java.util.Scanner;

public class Sortascdesc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int evenCount = 0, oddCount = 0;

        // Input and count even/odd
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        int e = 0, o = 0;

        // Store into separate arrays
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                even[e++] = arr[i];
            else
                odd[o++] = arr[i];
        }

        // Sort even array (Ascending)
        for (int i = 0; i < even.length - 1; i++) {
            for (int j = i + 1; j < even.length; j++) {
                if (even[i] > even[j]) {
                    int temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
        }

        // Sort odd array (Descending)
        for (int i = 0; i < odd.length - 1; i++) {
            for (int j = i + 1; j < odd.length; j++) {
                if (odd[i] < odd[j]) {
                    int temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }

        // Print even array
        for (int i = 0; i < even.length; i++)
            System.out.print(even[i] + " ");

        // Print odd array
        for (int i = 0; i < odd.length; i++)
            System.out.print(odd[i] + " ");
    }
}