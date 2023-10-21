class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(String.valueOf(my_string.charAt(i)).equals("a") || String.valueOf(my_string.charAt(i)).equals("e")||String.valueOf(my_string.charAt(i)).equals("i")||String.valueOf(my_string.charAt(i)).equals("o")||String.valueOf(my_string.charAt(i)).equals("u")){
                continue;
            }else{
                answer += String.valueOf(my_string.charAt(i));
            }
        }
        return answer;
    }
}