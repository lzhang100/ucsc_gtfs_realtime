
### What is this repository for? ###

Respository that includes files for the protobuf Google Tutorial, reading BARTS GTFS realtime alert feed, and recreating Google's GTFS realtime service alert example feed at https://developers.google.com/transit/gtfs-realtime/examples/alerts
1. In \protobuf-java-3.3.0\protobuf-3.3.0\examples, there is a GTFSReatlimeAlert that would read BARTS GTFS realtime alerts feed and prints it out onto the console.
2. In addfile folder, the GTFSconsole recreates the Google's service alert example and sending it over to a server implemented in Simpleserver.java and gets printed out.
3. In addfile folder, the GTFSconsole json takes another step where the application parses information in a JSON file that acts as a "realtime data stream" to be set into the setter functions that recreates the service alert feed example. The alert gets sent over to the simple server again and gets printed out. 
