package self.model;

public class Movie {
   private String title;
   private int time;

   public Movie(){
      super();
   }

   public Movie(String title, int time) { //오버로드 인수의 타입 혹은 갯수를 다르게
      this.title = title;
      this.time = time;
   }


   @Override
   public String toString() {
      return "MovieVO{" +
              "title='" + title + '\'' +
              ", time=" + time +
              '}';
   }
}
