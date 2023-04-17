package week5CodingAssignment;

public class SpacedLogger implements Logger{
	
	@Override
	public void log(String log) {
	
		
		StringBuilder sb = new StringBuilder(log);
		for (int i = 1; i <sb.length(); i +=2)
		    sb.insert(i, ' ');
		System.out.println(sb.toString()); //prints the character at each index and a space following
	      }
		
	
	@Override
	public void error(String error) {
	
		System.out.print("ERROR: ");
		StringBuilder sb = new StringBuilder(error);
		for (int i=1; i<sb.length(); i +=2)//The value of i is incremented by 2 at each iteration.
		    sb.insert(i, ' ');
		System.out.println(sb.toString());//prints out String with spaces after ERROR
		
	}     
	      

	  }

