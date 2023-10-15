public class biggest{
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 1;
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] == max){
                index = i;
                break;
            }
        }
        answer[0] = max;
        answer[1] = index;
        return answer;
    }
}