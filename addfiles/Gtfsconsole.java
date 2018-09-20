import java.net.Socket;
import java.io.DataOutputStream;

import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;
import com.google.transit.realtime.GtfsRealtime.FeedHeader;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.Alert;
import com.google.transit.realtime.GtfsRealtime.TimeRange;
import com.google.transit.realtime.GtfsRealtime.EntitySelector;
import com.google.transit.realtime.GtfsRealtime.TranslatedString;
import com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation;

public class Gtfsconsole {
  public static void main(String[] args) throws Exception {
  

	//Create a Feedmessage called example
	FeedMessage.Builder example = FeedMessage.newBuilder();
	
	/*Create a FeedHeader called example_Header
		Set the version for your feed
		Set that your dataset is a full dataset
		Set the timestamp to identify when the feed is created 
	*/
	FeedHeader.Builder example_Header = FeedHeader.newBuilder();
	example_Header.setGtfsRealtimeVersion("2.0");
	example_Header.setIncrementality(FeedHeader.Incrementality.FULL_DATASET);
	example_Header.setTimestamp(1284457468);
	
	//Add the Feedheader to Feedmessage 
	example.setHeader(example_Header);
	
	//Create a FeedEntity
	FeedEntity.Builder example_Entity = FeedEntity.newBuilder();
	//Create a Realtime Service Alert for this FeedEntity
	Alert.Builder example_Alert = Alert.newBuilder();
	//Each FeedEntity has a required identifier which is zero
	example_Entity.setId("0");
	
	//Time of the Alert that is going to happen
	TimeRange.Builder example_TimeRange = TimeRange.newBuilder();
	example_TimeRange.setStart(1284457468);
	example_TimeRange.setEnd(1284468072);
	example_Alert.addActivePeriod(example_TimeRange);
	
	//Who should I notify about this alert? 
	//In this case, there is some kind of situation happening at route 219 at stop 16230 and we should alert those people at this stop.
	EntitySelector.Builder example_EntitySelector_route = EntitySelector.newBuilder();
	example_EntitySelector_route.setRouteId("219");
	example_Alert.addInformedEntity(example_EntitySelector_route);
	EntitySelector.Builder example_EntitySelector_stop = EntitySelector.newBuilder();
	example_EntitySelector_stop.setStopId("16230");
	example_Alert.addInformedEntity(example_EntitySelector_stop);
	
	//What is the cause and effect of the situation?
	//There is constuction happening and vehicles have to take a detour.
	example_Alert.setCause(Alert.Cause.CONSTRUCTION);
	example_Alert.setEffect(Alert.Effect.DETOUR);
	
	//The URL that is providing this alert
	TranslatedString.Builder example_url = TranslatedString.newBuilder();
	Translation.Builder example_translation_url = Translation.newBuilder();
	example_translation_url.setText("http://www.sometransitagency/alerts");
	example_translation_url.setLanguage("en");
	example_url.addTranslation(example_translation_url);
	example_Alert.setUrl(example_url);
	
	//The header for the alert this is required
	TranslatedString.Builder example_header_txt = TranslatedString.newBuilder();
	Translation.Builder example_translation_header_txt = Translation.newBuilder();
	example_translation_header_txt.setText("Stop at Elm street is closed, temporary stop at Oak street");
	example_translation_header_txt.setLanguage("en");
	example_header_txt.addTranslation(example_translation_header_txt);
	example_Alert.setHeaderText(example_header_txt);
	
	//Describing the situation and why we we made an alert.
	TranslatedString.Builder example_description_text= TranslatedString.newBuilder();
	Translation.Builder example_translation_description_text = Translation.newBuilder();
	example_translation_description_text.setText("Due to construction at Elm street the stop is closed. The temporary stop can be found 300 meters north at Oak street");
	example_translation_description_text.setLanguage("en");
	example_description_text.addTranslation(example_translation_description_text);
	example_Alert.setDescriptionText(example_description_text);
	
	
	
	//Set the Service Alert to the FeedEntity
	example_Entity.setAlert(example_Alert);
	//Add the FeedEntity to the FeedMessage
	example.addEntity(example_Entity);

	
	//Print the feedMessage out
	//System.out.println(example);
	
	//Create socket and DataOutputstream to send feed to server
	Socket con = new Socket("localhost", 8080);
	DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	
	System.out.println("Sending FeedMessage example to server\n");
	example.build().writeTo(wr);

	wr.close();
  }
}

