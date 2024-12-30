import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int n) {
        // 배열의 크기를 n으로 제한하여 부분 배열 생성
        return Arrays.copyOfRange(numbers, 0, n);
    }
}
