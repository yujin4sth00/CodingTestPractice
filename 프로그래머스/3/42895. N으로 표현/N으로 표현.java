import java.util.*;
 
class Solution {
    public int solution(int N, int number) {
        if (N == number) {
            return 1;
        }
 
        // 가능한 숫자들의 집합을 담을 리스트 초기화
        List<Set<Integer>> dp = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            dp.add(new HashSet<>());
        }
 
        // 숫자 N을 이용하여 만들 수 있는 숫자들 초기화
        dp.get(1).add(N);
 
        // 숫자를 더하거나 빼는 연산을 적용하여 가능한 숫자들 생성
        for (int i = 2; i <= 8; i++) {
            // 현재 i에 해당하는 숫자를 만들기 위해 N을 사용하는 경우의 수를 고려합니다.
 
            // N을 i번 사용하여 숫자를 만듭니다.
            // StringBuilder를 사용하여 N을 i번 반복하여 숫자를 생성합니다.
            StringBuilder sb = new StringBuilder().append(N);
            for (int j = 1; j < i; j++) {
                sb.append(N);
            }
            dp.get(i).add(Integer.parseInt(sb.toString()));
 
            // 숫자를 더하거나 빼는 연산을 적용하여 가능한 숫자들을 생성합니다.
            // dp 리스트를 이용하여 가능한 숫자들을 구합니다.
            // dp[j]와 dp[i-j]에 저장된 숫자들을 이용하여 i에 해당하는 숫자를 만듭니다.
            // 연산 결과를 dp[i]에 추가합니다.
            for (int j = 1; j < i; j++) {
                int k = i - j;
                for (int num1 : dp.get(j)) {
                    for (int num2 : dp.get(k)) {
                        dp.get(i).add(num1 + num2);
                        dp.get(i).add(num1 - num2);
                        dp.get(i).add(num1 * num2);
                        if (num2 != 0) {
                            dp.get(i).add(num1 / num2);
                        }
                    }
                }
            }
 
            // number가 가능한 숫자들 중에 포함되는지 확인합니다.
            // 만약 number가 포함되어 있다면 i를 반환합니다.
            if (dp.get(i).contains(number)) {
                return i;
            }
        }
 
        // number를 표현할 수 없는 경우
        return -1;
    }
}
 