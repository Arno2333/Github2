package example1and2;

public class example2_7 {
	public static void main(String[] args) {
		// Obtain the total miHiseconds since midnight, 3an 1, 1970
		long totalMilliseconds=System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds=totalMilliseconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long currentMinute=totalMinutes % 60;
		
		// Obtain the total hours
	}
}
