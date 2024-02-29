package language;

public class Sungbin {
    //접근제어자 생략시  default
    public  void sayFavoriteLanguage(){
        Language favoriteLanguage = new Language();

        favoriteLanguage.setName("js");

        System.out.println("내가 좋아하는 언어는 "
        +favoriteLanguage.getName()+ "야");
    }
}
