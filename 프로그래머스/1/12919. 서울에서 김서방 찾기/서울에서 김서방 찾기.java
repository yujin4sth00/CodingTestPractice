class Solution {
    public String solution(String[] seoul) {
        int kim = 0;
        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                kim = i;
            }
        }
        String kims = kim+"";
        String answer = "김서방은 "+kims+"에 있다";
        System.out.println(answer);
        return answer;
    }
}