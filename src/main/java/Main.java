import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        String url = "https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input=monument&inputtype=textquery&fields=formatted_address,name&locationbias=point:34.4208305,-119.69819010000003&key=AIzaSyCcU99VGRKJIUxf0UD3lYhYQHLlmJpj0lg";
        URLRequest u = new URLRequest();
        JSONObject ans = u.requestURL(url);
        System.out.println(u.getPlaceName(ans));
    }
}
