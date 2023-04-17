package week5CodingAssignment;

public class App {

public static void main(String[] args) {

	Logger asteriskLogger = new AsteriskLogger();
	asteriskLogger.log("I don't know");
	asteriskLogger.error("Uggghhhh");
	
	Logger spacedLogger = new SpacedLogger();
	spacedLogger.log("Connot compute!");
	spacedLogger.error("WHY?!");

}
	
}	


