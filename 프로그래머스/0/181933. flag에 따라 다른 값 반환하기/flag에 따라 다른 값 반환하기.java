class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        answer = flag != false ? a + b : a - b ;
        
        return answer;
    }
}