import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //(1)
        if(a>b){
            System.out.println(">");
        }
        //(2)
        if(a<b){
            System.out.println("<");
        }
        //(3)
        if(a==b){
            System.out.println("==");
        }
        //(4)

    }
}