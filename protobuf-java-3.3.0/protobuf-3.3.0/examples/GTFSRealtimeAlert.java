import java.net.URL;

import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;

public class GtfsRealtimeAlert {
  public static void main(String[] args) throws Exception {
	  //System.out.println("Hello");
    URL url = new URL("http://api.bart.gov/gtfsrt/alerts.aspx");
    FeedMessage feed = FeedMessage.parseFrom(url.openStream());
    for (FeedEntity entity : feed.getEntityList()) {
      if (entity.hasAlert()) {
        System.out.println(entity.getAlert());
      }
    }
  }
}