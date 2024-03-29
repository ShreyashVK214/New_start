import java.util.Scanner;
public class kiran {
    public int sum(int a,int b){
        int c = a+b;
        return c;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("take user input");
        int a = sc.nextInt();
        int b = sc.nextInt();
        kiran obj = new kiran();
        int ans = obj.sum(a,b);
        System.out.println(ans);

    }
    
}
