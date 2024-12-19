package RoadTrip;

public class Main
{
    public static void main(String[] args)
    {
        GeoLocation stopOne = new GeoLocation(64.200844, -149.493668, "Alaska");
        GeoLocation stopTwo = new GeoLocation(36.778259, -119.417921, "California");
        GeoLocation stopThree = new GeoLocation(19.896767, -155.582779, "Hawaii");

        RoadTrip myTrip = new RoadTrip(stopOne);

        myTrip.addStop(stopTwo);
        myTrip.addStop(stopThree);

        myTrip.toStringPrint();

        System.out.println();

        System.out.println("Stops: " + myTrip.getNumberOfStops());
        System.out.println("Total Miles: " + myTrip.getTripLength());
    }
}
