package self.model;

public class Movie {
   private String title;
   private int time;

   public Movie(){
      super();
   }

   public Movie(String title, int time) {
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
