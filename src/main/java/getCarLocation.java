//getting VehicleLocation

//gets list of vehicles under the client
SmartcarResponse<VehicleIds> vehicleIdsResponse = AuthClient.getVehicleIds(auth.getAccessToken());
String[] vehicleIds = vehicleIdsResponse.getData().getVehicleIds();

//creates an instance of the vehicle we want
Vehicle vehicle = new Vehicle(vehicleIds[0], auth.getAccessToken());


public getCarCoordinates(vehicle car){
  SmartcarResponse<VehicleLocation> locationResponse = vehicle.location();
  VehicleLocation locationData = locationResponse.getData();
  String latLong = locationData.getLatitude() + ", " + locationData.getLongitude();
  return latlong;
}
