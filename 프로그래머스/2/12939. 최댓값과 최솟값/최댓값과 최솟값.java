class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            int ans = Integer.parseInt(array[i]);
            if(ans > max) {
                max = ans;
            } 
            if(min > ans){
                min = ans;
            }
        }
        answer = String.format("%d %d", min, max);
        return answer;
    }
}