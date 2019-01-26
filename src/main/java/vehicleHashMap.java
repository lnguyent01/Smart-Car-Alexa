import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;


//Actual Code
/*
/* This is how to declare HashMap */
//     HashMap<String, String> hmap = new HashMap<String, String>();
//
//     //gets list of vehicles under the client
//     SmartcarResponse<VehicleIds> vehicleIdsResponse = AuthClient.getVehicleIds(auth.getAccessToken());
//     String[] vehicleIds = vehicleIdsResponse.getData().getVehicleIds();
//
//    for (int i = 0; vehicleIds[i]!=null; i++){
//      String vehicleID = vehicleIds[i];
//      //get request https://api.smartcar.com/v1.0/vehicles{id}
//      VehicleInfo response = vehicle.info();
//      String MakeAndModel = response.make + response.model;
//      hmap.put(MakeAndModel, vehicleID);
//    }

//
//        HttpResponse<JsonNode> jsonResponse = Unirest.post("http://httpbin.org/post")
//        .header("accept", "application/json")
//        .queryString("apiKey", "123")
//        .field("parameter", "value")
//        .field("foo", "bar")
//        .asJson();
//
//
////Hardcoded car
//
//HashMap<String, String> hmpa = newHashMap<String, String>();
//hmap.put("TeslaModelX", )
