package stopwatch;
/**
 * A Stopwatch that measures elapsed time between a starting time
 * and stopping time, or until the present time.
 * @author Dacharat Pankong
 * @version 1.0
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds.*/
	private long stopTime;
	/** true when stopwatch is running*/
	private boolean running;
	
	/**
	 * Check stopwatch
	 * @return if stopwatch is running return true.
	 */
	public boolean isRunning(){
		return running;
	}
	
	/**
	 * Return the elapsed time if stopwatch is running it will return 
	 * the time when start to now but if it was stop it will return the time
	 * when start to stop.
	 *  
	 * @return elapsed time 
	 */
	public double getElapsed(){
		if(isRunning()){
			return (System.nanoTime() - startTime)* NANOSECONDS;
		} else {
			return (stopTime - startTime)* NANOSECONDS;
		}		
	}
	
	/**
	 * If the stopwatch is stop it will turn to running.
	 */
	public void start(){
		if(!isRunning()){
			this.startTime = System.nanoTime();
			running = true;
		}
	}
	
	/**
	 * If stopwatch is working it will turn to stop.
	 */
	public void stop(){
		if(isRunning()){
			this.stopTime = System.nanoTime();
			running = false;
		}
	}
}
