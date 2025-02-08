import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // 귤 수확 
        // 수확한 귤 중 k 개 골라 상자 하나에 담아 판매 
        // 귤의 크기가 일정하지 않음 
        // 한 상자에 최대한 비슷한 귤 크기 원함 
        
        Map< Integer , Integer > map = new HashMap<>();
        
        // 맵에 크기별 개수 넣기
        for( int i : tangerine ){
            map.put( i , map.getOrDefault( i , 0 ) + 1 );
        }
        
        // 크기별 리스트 생성
        List<Integer> keyList = new ArrayList<>(map.keySet());
        // map 을 활용하여 크기별 개수로 내림차순 정렬
        keyList.sort( (o1 , o2) -> map.get(o2) - map.get(o1));
        
        // k가 0이하이면 더이상 필요 없음
        for( Integer i : keyList ){
            if( k <= 0 ){
                break;
            }
            answer++;
            k -= map.get(i);
        }
        
        
        
        return answer;
    }
}