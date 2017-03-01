package stopWatch;
/**
 * Add primitive double in array.
 * 
 * @author Dacharat Pankong
 *
 */
public class SumDoublePrimitive implements Runnable{
	
		private int counter;
		
		private int ARRAY_SIZE = 500000;

		/**
		 * Get number of counter form TaskTimer.
		 * 
		 * @param counter is how many time that add to number.
		 *           
		 */
		public SumDoublePrimitive(int counter) {
			this.counter = counter;
		}

		/**
		 * Add number 1 to ARRAY_SIZE and print sum of input.
		 * 
		 */
		@Override
		public void run() {
			// create array of values to add before we start the timer
			double[] values = new double[ARRAY_SIZE];
			for (int k = 0; k < ARRAY_SIZE; k++)
				values[k] = k + 1;

			double sum = 0.0;
			// count = loop counter, i = array index value
			for (int count = 0, i = 0; count < counter; count++, i++) {
				if (i >= values.length)
					i = 0; // reuse the array when get to last value
				sum = sum + values[i];
			}

		}

		/**
		 * @return the task.
		 *         
		 */
		public String toString() {
			return String.format("Sum array of double primitives with count=%,d\n", counter);
		}

	
}
