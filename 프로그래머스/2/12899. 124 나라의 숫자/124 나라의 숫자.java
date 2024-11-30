class Solution {
    public String solution(int n) {
    	// 124 나라의 숫자로 변환하기 위한 배열
        String[] num = {"4", "1", "2"};
        String answer = "";
        
        while(n > 0) {
        	// 인덱스를 통해서 값을 변환
            answer = num[n % 3] + answer;
            // 숫자 n을 조정
            n = (n-1) / 3;
        }
        
        return answer;
    }
}