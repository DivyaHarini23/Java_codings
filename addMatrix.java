
import java.util.Scanner;
public class addMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A matrix size");
        int row=sc.nextInt();
int col=sc.nextInt();
int[][] arrA=new int[row][col];

System.out.println("Enter A matrix");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        arrA[i][j]=sc.nextInt();
    }
}
System.out.println("A Matrix");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        System.out.print(arrA[i][j]+" ");
    }
System.out.println();

}
System.out.println("Enter B Matrix size");
 row=sc.nextInt();
col=sc.nextInt();
int[][] arrB=new int[row][col];

System.out.println("Enter B matrix");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        arrB[i][j]=sc.nextInt();
    }
}
System.out.println("B Matrix");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        System.out.print(arrB[i][j]+" ");
    }
System.out.println();

}
//Addition
int[][] sum=new int[row][col];
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
       sum[i][j]=arrA[i][j]+arrB[i][j];
    }


for(i=0;i<row;i++){
    for(int j=0;j<col;j++){
        System.out.print(sum[i][j]+" ");

    }
    System.out.println();
}
}
}
}
