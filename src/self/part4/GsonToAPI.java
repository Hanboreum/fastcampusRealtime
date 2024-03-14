package self.part4;

import com.google.gson.Gson;
import self.model.Movie;

public class GsonToAPI {
    public static void main(String[] args) {
        Movie movie =new Movie("TITLE", 234);
        Gson gson = new Gson();
        String json = gson.toJson(movie);
        System.out.println("json = " + json);
    }
}
