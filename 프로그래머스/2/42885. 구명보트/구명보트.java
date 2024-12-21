import java.util.Arrays;
class Solution {
public int solution(int[] people, int limit) {
int answer = 0;
Arrays.sort(people); // 무게 순으로 정렬

int lt = 0, rt = people.length - 1;

while (lt <= rt) {
    // 가장 가벼운 사람과 가장 무거운 사람을 선택
    int lightest = people[lt];
    int heaviest = people[rt];

    if (lightest + heaviest <= limit) {
        // 가장 가벼운 사람과 가장 무거운 사람을 함께 태울 수 있는 경우
        lt++;
        rt --;
        } else {
            // 가장 무거운 사람만 태울 수 있는 경우
            rt --;
            }
            answer++;
        }
    return answer;
    }
}