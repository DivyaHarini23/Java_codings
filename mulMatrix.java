import java.util.*;
public class mulMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter A matrix row and col size");
int rowA=sc.nextInt();
int colA=sc.nextInt();

int[][] arrA=new int[rowA][colA];
for(int i=0;i<rowA;i++){
    for(int j=0;j<colA;j++){
        arrA[i][j]=sc.nextInt();
    }

}
System.out.println("Matrix A");
for(int i=0;i<rowA;i++){
    for(int j=0;j<colA;j++){
        System.out.println(arrA[i][j]);
    }
}

System.out.println("Enter B matrix row and col size");
int rowB=sc.nextInt();
int colB=sc.nextInt();

int[][] arrB=new int[rowB][colB];
for(int i=0;i<rowB;i++){
    for(int j=0;j<colB;j++){
        arrB[i][j]=sc.nextInt();
    }

}
System.out.println("Matrix B");
for(int i=0;i<rowB;i++){
    for(int j=0;j<colB;j++){
        System.out.println(arrB[i][j]);
    }
} 
int[][] res=new int[rowA][colB];
if(rowA==colB){

    for(int i=0;i<rowA;i++){
        for(int j=0;j<colB;j++){
            for(int k=0;k<colA;k++){
res[i][j]+=arrA[i][k]*arrB[k][j];
            }
        }
    }

    System.out.println("Result");
    for(int i=0;i<rowA;i++){
        for(int j=0;j<colB;j++){
            System.out.print(res[i][j]+" ");
        }
        System.out.println();
    }
}
}
}
