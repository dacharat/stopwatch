package stopwatch;

/**
 * TaskTimer will count amount of time.
 * 
 * @author Dacharat Pankong
 *
 */

public class TaskTimer {
	private static Stopwatch timer;
	
	public TaskTimer(){
		this.timer = new Stopwatch();
	}
	
	/**
	 * It will show the time after run and stop it.
	 * @param task is the task will be run.
	 */
	public static void measureAndPrint(Runnable task) {
		System.out.print(task.toString());
		timer.start();
		task.run();
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
