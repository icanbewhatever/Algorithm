class Solution {
    public String solution(String str1, String str2) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i < str1.length(); i++){
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            sb.append(a).append(b);   
          
        }
        
        return sb.toString();
    }
}