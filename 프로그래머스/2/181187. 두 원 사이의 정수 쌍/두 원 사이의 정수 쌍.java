class Solution {
    public long solution(int r1, int r2) {
        long count = 0;

        for (int x = 1; x < r2; x++) {
            long maxY_r2 = (long) Math.floor(Math.sqrt((long) r2 * r2 - (long) x * x)); // 바깥 원의 최대 y
            long minY_r1 = 0;

            // 내곽 원의 범위 내에 있는 경우에만 최소 y 계산
            if (x < r1) {
                minY_r1 = (long) Math.ceil(Math.sqrt((long) r1 * r1 - (long) x * x)); // 안쪽 원의 최소 y
            }

            count += (maxY_r2 - minY_r1 + 1); // 두 원 사이에 있는 y 좌표 수
        }

        // 사분면 전체를 고려하여 4배, 그리고 원 위의 8개 좌표 추가
        return count * 4 + 4;
    }
}
