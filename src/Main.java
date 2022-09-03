
public class Main 
{
	public static MyTime[][] split(int hours, int sessions)
	{
		MyTime[][] splits = new MyTime[sessions][2];
		
		double doubleHours = hours;
		double doubleSessions = sessions;
		
		double napLength = doubleHours/doubleSessions;
		MyTime napStart = new MyTime();
		
		for (int i = 0; i < sessions; i++)
		{
			// splits[i][1] =  
		}
		return splits;
	}
	
	public static int[] split(int hours, int sessions, int start)
	{
		
		return null;
	}
	
	public static void main(String[] args) 
	{
		
	}
}