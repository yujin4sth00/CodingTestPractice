class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcount = 0;
        int ycount = 0;
        for(String sp : s.split("")){
            if(sp.equalsIgnoreCase("p")){
                pcount++;
            } else if(sp.equalsIgnoreCase("y")){
                ycount++;
            }
        }
        if(pcount == 0 && ycount == 0){
            System.out.println(answer);
        } else if (pcount == ycount){
            System.out.println(answer);
        } else {
            answer = false;
            System.out.println(answer);
        }
        return answer;
    }
}