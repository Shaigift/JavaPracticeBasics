package Exercise98;

public class ConvertSecondsToHourMinuteAndSeconds {
	public static void main(String[] args) {
		int seconds = 86399;
		
		int p1 = seconds/3600;
		int p2 = seconds % 60;
		int p3 = p2%60;
		
		System.out.print(p1 + ": " + p3 + ": " + p2);
	}

}
