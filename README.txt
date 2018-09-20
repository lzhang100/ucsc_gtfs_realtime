Add the "addfiles" files in the examples folder in protobuf-java-3.3.0
The classpath might be different/protobuf .jar version and I ran this in Windows command prompt.

javac Gtfsconsole.java com/google/transit/realtime/GtfsRealtime.java -cp .;protobuf-java-3.4.1.jar
java -cp .;protobuf-java-3.4.1.jar Gtfsconsole

javac Gtfsconsolejson.java com/google/transit/realtime/GtfsRealtime.java -cp .;protobuf-java-3.4.1.jar;json-simple-1.1.jar
java -cp .;protobuf-java-3.4.1.jar;json-simple-1.1.jar Gtfsconsolejson


javac SimpleServer.java com/google/transit/realtime/GtfsRealtime.java -cp .;protobuf-java-3.4.1.jar 
java -cp .;protobuf-java-3.4.1.jar SimpleServer
