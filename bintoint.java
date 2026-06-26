
public class bintoint{

    public static void main(String[] args) {
        String a="101";
        int count=0;
for(int i=0;i<a.length();i++){

if(a.charAt(i)=='1'){
      count+=Math.pow(2,a.length()-i-1);
}
}
System.out.print(count);
    }
}