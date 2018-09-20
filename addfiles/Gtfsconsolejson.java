import java.net.Socket;
import java.io.DataOutputStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;
import com.google.transit.realtime.GtfsRealtime.FeedHeader;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.Alert;
import com.google.transit.realtime.GtfsRealtime.TimeRange;
import com.google.transit.realtime.GtfsRealtime.EntitySelector;
import com.google.transit.realtime.GtfsRealtime.TranslatedString;
import com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation;

public class Gtfsconsolejson {
  public static void main(String[] args) throws Exception {
	  
	JSONParser parser = new JSONParser();
	String id = "";
	long tr_start = 0;
	long tr_end = 0;
	String es_routeid = "";
	String es_stopid = "";
	String tlu_url_text = "";
	String tlu_url_lang = "";
	String tlu_header_text = "";
	String tlu_header_lang = "";
	String tlu_description_text = "";
	String tlu_description_lang = "";
	
	try {
		Object obj = parser.parse(new FileReader("jsonstream.json"));
		JSONObject jsonObject = (JSONObject) obj;
		//System.out.println(jsonObject);
		
		id = (String) jsonObject.get("id");
		System.out.println(id);
		
		tr_start = (Long) jsonObject.get("timerange_start");
		System.out.println(tr_start);
		
		tr_end = (Long) jsonObject.get("timerange_end");
		System.out.println(tr_end);
		
		es_routeid = (String) jsonObject.get("entityselector_routeid");
		System.out.println(es_routeid);
		
		es_stopid = (String) jsonObject.get("entityselector_stopid");
		System.out.println(es_stopid);
		
		tlu_url_text = (String) jsonObject.get("translation_url_text");
		System.out.println(tlu_url_text);
		
		tlu_url_lang = (String) jsonObject.get("translation_url_language");
		System.out.println(tlu_url_lang);
		
		tlu_header_text = (String) jsonObject.get("translation_header_text");
		System.out.println(tlu_header_text);
		
		tlu_header_lang = (String) jsonObject.get("translation_header_language");
		System.out.println(tlu_header_lang);
		
		tlu_description_text = (String) jsonObject.get("translation_description_text");
		System.out.println(tlu_description_text);
		
		tlu_description_lang = (String) jsonObject.get("translation_description_language");
		System.out.println(tlu_description_lang);
		
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ParseException e) {
		e.printStackTrace();
	}
  

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
	example_Entity.setId(id);
	
	//Time of the Alert that is going to happen
	TimeRange.Builder example_TimeRange = TimeRange.newBuilder();
	example_TimeRange.setStart(tr_start);
	example_TimeRange.setEnd(tr_end);
	example_Alert.addActivePeriod(example_TimeRange);
	
	//Who should I notify about this alert? 
	//In this case, there is some kind of situation happening at route 219 at stop 16230 and we should alert those people at this stop.
	EntitySelector.Builder example_EntitySelector_route = EntitySelector.newBuilder();
	example_EntitySelector_route.setRouteId(es_routeid);
	example_Alert.addInformedEntity(example_EntitySelector_route);
	EntitySelector.Builder example_EntitySelector_stop = EntitySelector.newBuilder();
	example_EntitySelector_stop.setStopId(es_stopid);
	example_Alert.addInformedEntity(example_EntitySelector_stop);
	
	//What is the cause and effect of the situation?
	//There is constuction happening and vehicles have to take a detour.
	example_Alert.setCause(Alert.Cause.CONSTRUCTION);
	example_Alert.setEffect(Alert.Effect.DETOUR);
	
	//The URL that is providing this alert
	TranslatedString.Builder example_url = TranslatedString.newBuilder();
	Translation.Builder example_translation_url = Translation.newBuilder();
	example_translation_url.setText(tlu_url_text);
	example_translation_url.setLanguage(tlu_url_lang);
	example_url.addTranslation(example_translation_url);
	example_Alert.setUrl(example_url);
	
	//The header for the alert this is required
	TranslatedString.Builder example_header_txt = TranslatedString.newBuilder();
	Translation.Builder example_translation_header_txt = Translation.newBuilder();
	example_translation_header_txt.setText(tlu_header_text);
	example_translation_header_txt.setLanguage(tlu_header_lang);
	example_header_txt.addTranslation(example_translation_header_txt);
	example_Alert.setHeaderText(example_header_txt);
	
	//Describing the situation and why we we made an alert.
	TranslatedString.Builder example_description_text= TranslatedString.newBuilder();
	Translation.Builder example_translation_description_text = Translation.newBuilder();
	example_translation_description_text.setText(tlu_description_text);
	example_translation_description_text.setLanguage(tlu_description_lang);
	example_description_text.addTranslation(example_translation_description_text);
	example_Alert.setDescriptionText(example_description_text);
	
	
	
	//Set the Service Alert to the FeedEntity
	example_Entity.setAlert(example_Alert);
	//Add the FeedEntity to the FeedMessage
	example.addEntity(example_Entity);

	
	//Print the feedMessage out
	System.out.println(example);
	
	//Create socket and DataOutputstream to send feed to server
	Socket con = new Socket("localhost", 8080);
	DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	
	System.out.println("Sending FeedMessage example to server\n");
	example.build().writeTo(wr);

	wr.close();
  }
}

