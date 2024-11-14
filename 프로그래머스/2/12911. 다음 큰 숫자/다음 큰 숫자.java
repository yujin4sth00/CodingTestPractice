class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n); // n의 '1' 개수 구함
        int answer = n + 1;

        // answer의 '1' 개수가 count와 같아질 때까지 증가
        while (Integer.bitCount(answer) != count) {
            answer++;
        }

        return answer;
    }
}
