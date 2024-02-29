package language;

public class Language {
    private String name;
    /*필드를 막자
    1.아무나 접근 하는게 싫다
    :그래서 private으로 변경 아무나 접근, 변경 X
    2. setter를 열었더니 1번 의미가 없다
    -> 접근 제한자를 조정하면 정보은닉 의미 있지 않나?
    -> 매개변수 값이 타당한지 필터링 하는 용도
     */

    //private으로 갇힌 필드의 값만 보여주기만 하는 메소드
    //get+필드명()

    //public language.Language(String name){
      //  this.name = name;

    // 생성자 방법}
    public String getName(){
        return name;
    }

    //setter
    public void setName(String n){
        this.name = name;
    }
}
