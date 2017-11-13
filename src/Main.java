import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int c=1;
        System.out.printf("N 10*N 100*N 1000*N\n");
        while (c<=n)
        {
            System.out.printf("%d %d %d %d\n",c,c*10,c*100,c*1000);
            c=c+1;
        }
    }
}
