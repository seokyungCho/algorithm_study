class capital_small {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if((int)my_string.charAt(i) < 91){
                int n = (int)my_string.charAt(i);
                int m = n + 32;
                answer += (char)m;
            }else{
                int n = (int)my_string.charAt(i);
                int m = n - 32;
                answer += (char)m;
            }
        }
        return answer;
    }
}
