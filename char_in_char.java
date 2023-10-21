class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int leng = str2.length();
        if(str1.length() >= str2.length()){
            for(int i = 0; i < str1.length()-leng+1; i++){
                if(str1.substring(i,i+leng).equals(str2)){
                    answer = 1;
                    break;
                }else{
                    answer = 2;
                    }
                }
        }else{
            answer = 2;
        }
        return answer;
    }
}