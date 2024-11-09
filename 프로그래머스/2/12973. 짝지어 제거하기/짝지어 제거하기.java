import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char a : s.toCharArray()){
        //스택이 비어있지 않고, 맨 윗값이 넣으려는 a값과 동일하다면
            if(!stack.isEmpty() && stack.peek() == a){
            //스택 맨 위의 값 제거
                stack.pop();
                //그 이외엔 push
            } else stack.push(a);
        } 
        return stack.isEmpty()? 1 : 0;
    }
}