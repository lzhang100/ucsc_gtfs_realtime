import java.io.IOException;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;
import com.google.transit.realtime.GtfsRealtime.FeedHeader;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.Alert;
import com.google.transit.realtime.GtfsRealtime.TimeRange;
import com.google.transit.realtime.GtfsRealtime.EntitySelector;
import com.google.transit.realtime.GtfsRealtime.TranslatedString;
import com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation;

public class SimpleServer {
	public static void main(String args[] ) throws IOException { 
		
		ServerSocket server = new ServerSocket(8080); 
		System.out.println("Listening for connection on port 8080 ...."); 
		while (true) { 
			try (Socket socket = server.accept()) {
				DataInputStream isr = new DataInputStream(socket.getInputStream());
				FeedMessage server_feed = FeedMessage.parseFrom(isr);		
				System.out.println("Print the FeedMessage sent by client\n");
				System.out.println(server_feed);
			} 
		}
	
	} 
}