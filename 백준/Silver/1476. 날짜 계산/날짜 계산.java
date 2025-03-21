import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();  
        int B = sc.nextInt();
        int C = sc.nextInt();
        // 순서대로 A,B,C로 입력받는다. 
        // 처음 문제를 풀었을 때 A,B,C가 익숙해서 이렇게 써뒀는데 E,S,M으로 받으면 더 좋지 않았을까? 하는 생각이 든다. 물론 문제에 큰 영향은 없다. 
        
        int year = 0;  //연도를 year=0으로 선언하고, 
        while(true){
            year++;  //year을 1씩 더해가면서 0,1,2,3... 해가면서 적절한 year을 찾는다. 
            if((year-A)%15==0 && (year-B)%28==0 && (year-C)%19==0){  
            	//year-A, year-B, year-C 값이 각각 15,28,19로 나누었을 때 0을 만족한다는 것은 
                //year 값을 15,28,19로 나누었을 때 나머지 값이 각각 A,B,C인 것과 같은 의미이다. 
                break;
            }
        }
        
        System.out.println(year);
    }
}