class remove_letter {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(String.valueOf(my_string.charAt(i)).equals(letter)){
                continue;
            }else{
                answer += String.valueOf(my_string.charAt(i));
            }
        }
        return answer;
    }
}
