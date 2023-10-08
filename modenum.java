import java.util.Arrays;

class modenum {
    public static void main(String[] args) {
        int answer = 0;
        //입력값이 배열로 들어옴
        //배열 정렬 필요
        //최빈값이 존재하면 answer는 그 숫자가 됨
        //최빈값이 여러개인 경우 answer는 -1
        //배열 길이가 1인 경우 answer는 array[0]
        int[] count = new int[1000]; // 각 숫자의 개수를 세는 배열
        int index = 0;

        int[] array = {1, 1, 2, 2};
        
        Arrays.sort(array);//배열 정렬
        
        if(array.length == 1){
            answer = array[0];
        } else {
            for(int i = 0; i < array.length; i++) {
                count[index] = count[index] + 1;
                if(i+1 != array.length && array[i] != array[i+1]) {
                    index ++;
                    if(index > 0 && count[index - 1] < count[index]){
                        answer = array[i];
                    }else{
                        answer = array[i];
                    }
                }
            }
        }

        System.out.print(answer);
    }
}