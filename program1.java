import java.util.*;
public class program1 {
    public static int checkNumber(int n) {
        if(n<0 && n%2==0 || n==0 || n>0 && n%2==0){
            return 2;
        } else if (n<0 && n%2==1 || n>0 && n%2==1){
            return 1;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println(checkNumber(n));
    }
}