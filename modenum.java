import java.util.Arrays;

class modenum {
    public int main(int[] array) {
        int answer = 0;
        //입력값이 배열로 들어옴
        //배열 정렬 필요
        //최빈값이 존재하면 answer는 그 숫자가 됨
        //최빈값이 여러개인 경우 answer는 -1
        //배열 길이가 1인 경우 answer는 array[0]
        int[] count = new int[1000]; // 각 숫자의 개수를 세는 배열
        int index = 0;

        
        Arrays.sort(array);//배열 정렬
        

        return answer;
    }
}