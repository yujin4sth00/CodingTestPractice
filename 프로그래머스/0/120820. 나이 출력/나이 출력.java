class Solution {
    public int solution(int age) {
        int answer = 0;
        if(age <= 23){
            answer = 2022 - (age - 1);
        } else {
            answer = 2022 - age + 1;
        }
        return answer;
    }
}