import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=s.nextInt();
        int i;
        float sum=0;

        for(i=1;i<=n;i++) {
            sum=sum+(1/i);

        }
        System.out.println("the sum is" + sum);

    }
}
