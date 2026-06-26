
import java.util.*;

public class numpattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            //to print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            //to print the des number
            for (int j = i; j >= 1; j--) {

                System.out.print(j + " ");
            }

            //to print ascending number
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
