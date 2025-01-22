class Solution {
    public int solution(int a, int b) {
        
        StringBuilder sb = new StringBuilder();
        
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        
        String c = a1 + b1;
        String d = b1 + a1;
        
        int answer1 = Integer.parseInt(c);
        int answer2 = Integer.parseInt(d);

        if(answer1 > answer2){
            sb.append(answer1);
        } else if(answer1 < answer2){
            sb.append(answer2);
        } else{
            sb.append(answer1);
        } 

        int answer = Integer.parseInt(sb.toString());
        return answer;
    }
}