package stopWatch;

import java.math.BigDecimal;

/**
 * Add BigDecimal in array.
 * 
 * @author Dacharat Pankong
 *
 */

public class SumBigDecimal implements Runnable {
	
		private int counter;
		
		private int ARRAY_SIZE = 50000;

		/**
		 * Get the number of count form TaskTimer.
		 * 
		 * @param counter is how many time add the number.            
		 */
		public SumBigDecimal(int counter) {
			this.counter = counter;
		}

		/**
		 * Add number of 1 to ARRAY_SIZE with BigDecimal class and print out sum of
		 * amount of count input.
		 */
		@Override
		public void run() {
			BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
			for (int i = 0; i < ARRAY_SIZE; i++)
				values[i] = new BigDecimal(i + 1);

			BigDecimal sum = new BigDecimal(0.0);
			for (int count = 0, i = 0; count < counter; count++, i++) {
				if (i >= values.length)
					i = 0;
				sum = sum.add(values[i]);
			}
		}

		/**
		 * 
		 * @return the task
		 */
		public String toString() {
			return String.format("Sum array of BigDecimal with count=%,d\n", counter);
		}
}
