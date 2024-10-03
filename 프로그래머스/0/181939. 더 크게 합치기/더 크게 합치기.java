class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String a2 = Integer.toString(b);
        int sum1 = Integer.parseInt(a1+a2);
        int sum2 = Integer.parseInt(a2+a1);
        
        if(sum1 >= sum2){
            answer = sum1;
        }
        else {
            answer = sum2;
        }
        return answer;
    }
}