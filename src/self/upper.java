package self;

public class upper {
    public static void main(String[] args) {
        int offset ='A' -'a';//대 - 소 변환시 사용
        char[] lower = {'d','a'};
        char[] upper =new char[lower.length];

        // lower배열과 같은 길이의 char 배열 생성. 대문자 저장할 upper 생성
        for(int i=0; i< lower.length; i++){
            upper[i] = (char) (lower[i] + offset);
            //lower배열 각 요소에 offest을 더해 대문자로 변환한 값을 upper에 저장.
            //(char)는 형변환
        }
        System.out.println(upper);

    }
}
