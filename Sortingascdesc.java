public class Sortingascdesc {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 1, 0, 5 };

        for (int i=0;i<arr.length;i++) {
            if(i%2==0){
                int min=i;
                for(int j=i+2;j<arr.length;j+=2) {
                    if(arr[j]<arr[min]) {
                        min=j;
                    }

                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            if (i%2!=0){
                int max = i;
                for (int j = i + 2; j < arr.length; j += 2) {
                    if (arr[j] > arr[max]) {
                        max = j;
                    }

                    int temp = arr[max];
                    arr[max] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}