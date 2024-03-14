package self.part4;

import com.google.gson.Gson;
import self.model.Movie;

public class GsonFromJson {
    public static void main(String[] args) {
        String json = "{\"title\":\"TITLE\",\"time\":234}";
        Gson gson = new Gson();
        Movie movie = gson.fromJson(json,Movie.class);
        System.out.println(movie.toString());
    }
}
