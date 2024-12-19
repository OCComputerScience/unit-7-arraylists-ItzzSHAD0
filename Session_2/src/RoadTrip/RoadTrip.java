package RoadTrip;

import java.util.ArrayList;

public class RoadTrip
{
    private ArrayList<GeoLocation> roadTrip = new ArrayList<GeoLocation>();

    public RoadTrip(GeoLocation newLocation)
    {
        roadTrip.add(newLocation);
    }

    public void addStop(GeoLocation stop)
    {
        roadTrip.add(stop);
    }

    public int getNumberOfStops()
    {
        return roadTrip.size();
    }

    public double getTripLength()
    {
        double tripLength = 0;
        for (int i = 0; i < roadTrip.size() - 1; i++)
        {
            tripLength += roadTrip.get(i).distanceFrom(roadTrip.get(i+1));
        }

        return tripLength;
    }

    public void toStringPrint()
    {
        for (int i = 0; i < roadTrip.size(); i++)
        {
            System.out.println(i + 1 + ". " + roadTrip.get(i));
        }
    }

}
