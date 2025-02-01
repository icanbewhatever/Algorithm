class Solution {
    public int solution(int a, int b) {
        
    int answer = 0;
    int plus = Integer.parseInt(""+a+b);
    int multiply = 2 * a * b;
    
    answer = plus > multiply ? plus : multiply; 
    
        return answer;
    }
}