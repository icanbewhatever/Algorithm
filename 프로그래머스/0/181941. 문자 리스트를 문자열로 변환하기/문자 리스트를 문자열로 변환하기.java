class Solution {
    public String solution(String[] arr) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++){
            String a = arr[i];
            sb.append(a);
        }
        
        return sb.toString();
    }
}