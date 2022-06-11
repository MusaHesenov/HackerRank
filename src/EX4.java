import java.util.*;
//Loops 1
public class EX4 {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=1;

        while(i<=10){
            System.out.println(n+" x "+i+" = "+(n*i));
            i++;
        }
    }
}
