package self.weatherMVC;

import self.mvc.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherView {
    public static void main(String[] args) {
        Weather cloudy = new Weather(21, "cloudy");
        Weather sunny = new Weather(26,"sunny");
        Weather rainy = new Weather(17, "rain");
        Controller controller = new Controller();
        Weather addCloudy = controller.registerWeather(cloudy);
        Weather addSunny = controller.registerWeather(sunny);
        Weather addRainy = controller.registerWeather(rainy);
        System.out.println(addCloudy.getState() +"\t"+ addRainy.getState() +"\t"+ addSunny.getState() +"\t"+ " 상태 등록 완료");

        List<Weather> allWeather = controller.allWeather();
        for( Weather w : allWeather){
            System.out.println(w.toString() + "모든 날씨 정보");
        }

        Weather choiceWeather = controller.oneWeather(1);
        System.out.println("선택한 날씨의 온도" + choiceWeather );

        Weather deleteWeather = controller.deleteWeather(2);
        System.out.println(deleteWeather.getState() + " 삭제됨");

        List<Weather> afterDelete = controller.allWeather();
        for( Weather w : afterDelete){
            System.out.println(w.toString() + "삭제 후 모든 날씨 정보");
        }

        Weather updateWeather = controller.UpdateWeather(addRainy);
        System.out.println(updateWeather);
    }
}

class Controller{
    Logic logic = new Logic();
    public Weather registerWeather(Weather weather){
        Weather newWeather = logic.addWeather(weather);
        return newWeather;
    }
    public List<Weather> allWeather(){
        List<Weather> allWeather = logic.findAll();
        return allWeather;
    }
    public Weather oneWeather(int id){
        Weather selectedWeather = logic.findOne(id);
        return selectedWeather;
    }
    public Weather UpdateWeather(Weather weather){
        Weather updateWeather = logic.modifyWeather(weather);
        return updateWeather;
    }
    public Weather deleteWeather ( int id){
        Weather deleteWeather = logic.removeWeather(id);
        return deleteWeather;
    }

}

class Logic{
    Map<Integer, Weather> db = new HashMap<>();
    int id = 0;
    public Weather addWeather(Weather weather){
        db.put(id,weather);
        return db.get(id ++);
    }
    public List<Weather>findAll(){
        return new ArrayList<>(db.values());
    }
    public Weather findOne(int id){
        return db.get(id);
    }
    public Weather modifyWeather(Weather weather){
        db.put(id, weather);
        return db.get(id);
    }
    public Weather removeWeather( int id){
       return  db.remove(id);
    }
}