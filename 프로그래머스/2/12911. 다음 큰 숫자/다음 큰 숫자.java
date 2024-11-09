class Solution {
    public int solution(int n) {  // 메서드 이름을 solution으로 변경
        // Step 1: 가장 오른쪽 1 비트를 찾습니다.
        int lowestOneBit = n & -n;
        
        // Step 2: n에 가장 오른쪽 1 비트를 더하여, 오른쪽부터 '1'의 자리 교체
        int nextHigherOneBit = n + lowestOneBit;
        
        // Step 3: 작은 패턴을 계산하여, 남은 비트들을 오른쪽으로 이동시켜 자리 맞춤
        int rightOnesPattern = (n ^ nextHigherOneBit) / lowestOneBit >> 2;
        
        // Step 4: 다음 큰 숫자 생성
        return nextHigherOneBit | rightOnesPattern;
    }

    public static void main(String[] args) {
        int n = 78;
        System.out.println(new Solution().solution(n)); // 호출 부분에서도 solution 사용
    }
}
