package stopWatch;

/**
 * Add Double in array. 
 * 
 * @author Dacharat Pankong
 *
 */

public class SumDouble implements Runnable{

		private int counter;

		private int ARRAY_SIZE = 50000;

		/**
		 * Get the number of count form TaskTimer.
		 * 
		 * @param counter is how many time add the number.
		 *            
		 */
		public SumDouble(int counter) {
			this.counter = counter;
		}	
		
		@Override
		public void run() {
			// create array of values to add, before we start the timer
			Double[] values = new Double[ARRAY_SIZE];
			for (int i = 0; i < ARRAY_SIZE; i++)
				values[i] = new Double(i + 1);

			Double sum = new Double(0.0);
			// count = loop counter, i = array index
			for (int count = 0, i = 0; count < counter; count++, i++) {
				if (i >= values.length)
					i = 0;
				sum = sum + values[i];
			}
		}

		/**
		 * @return the task
		 *         
		 */
		public String toString() {
			return String.format("Sum array of Double objects with count=%,d\n", counter);
		}
	
}
