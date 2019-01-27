import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Array;

public class URLRequest {

   // String URLBase = https://maps.googleapis.com/maps/api/place/findplacefromtext/json?fields=name&inputtype=textquery&key=AIzaSyCcU99VGRKJIUxf0UD3lYhYQHLlmJpj0lg;


    public String getLandmarkURL(String URLBase, String coordinates){
        URLBase += "&input=landmark&locationbias=point:" + coordinates;
        return URLBase;

    }

    public String getHistoryURL(String URLBase, String coordinates){
        URLBase += "&input=history&locationbias=point:" + coordinates;
        return URLBase;
    }

    public String getMonumentURL(String URLBase, String coordinates){
        URLBase += "&input=monument&locationbias=point:" + coordinates;
        return URLBase;
    }

    public JSONObject requestURL(String URL){
        HttpResponse<JsonNode> jsonResponse = null;
        try {
            jsonResponse = Unirest.get(URL)
                    .header("accept", "application/json")
                    .asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return jsonResponse.getBody().getObject();
    }

    public String getPlaceName(JSONObject jsonObject){
        JSONArray arr = jsonObject.getJSONArray("candidates");
        JSONObject rec = arr.getJSONObject(0);
        return rec.get("name").toString();
    }

}
