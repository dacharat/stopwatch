package stopwatch;
/**
 * 
 * @author Dacharat Pankong
 *
 */
public class Main {
	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();

//		TaskTimer.measureAndPrint(new AppendToString(50000));
//		TaskTimer.measureAndPrint(new AppendToString(100000));
//		TaskTimer.measureAndPrint(new AppendToStringBuilder(100000));
//		TaskTimer.measureAndPrint(new SumDoublePrimitive(1000000000));
//		TaskTimer.measureAndPrint(new SumDouble(1000000000));
//		TaskTimer.measureAndPrint(new SumBigDecimal(1000000000));
		
		
		Runnable[] tasks = new Runnable[] { 
				
				new AppendToString(50000), 
				new AppendToString(100000),
				new AppendToStringBuilder(100000), 
				new SumDoublePrimitive(1000000000), 
				new SumDouble(1000000000),
				new SumBigDecimal(1000000000) 
				
		};

		for (int i = 0; i < tasks.length; i++)
			timer.measureAndPrint(tasks[i]);
	}
}
