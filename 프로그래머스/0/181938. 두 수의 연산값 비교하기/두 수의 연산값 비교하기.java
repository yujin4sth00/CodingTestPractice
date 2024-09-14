class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum = (a+"") + (b+"");
        int isum = Integer.parseInt(sum);
        if(isum >= 2*a*b){
           answer = isum;
} else {
            answer = 2*a*b;
        }
        return answer;
    }
}