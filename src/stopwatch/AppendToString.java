package stopWatch;

/**
 * Append chars to a StringBuilder
 * 
 * @author Dacharat Pankong
 *
 */
public class AppendToString implements Runnable{

		private int count;
		
		private String result;

		/**
		 * Initialize AppendStringBuilderTask with count.
		 * 
		 * @param count is how many time add the char.
		 *           
		 */
		public AppendToString(int count) {
			this.count = count;
			this.result = "";
		}

		/**
		 * Add 'a' to string until it reaches final size. 
		 * 
		 */
		@Override
		public void run() {
			final char CHAR = 'a';
			String result = "";
			int k = 0;
			while (k++ < count) {
				result = result + CHAR;
			}
		}

		/**
		 * @return the task.
		 *         
		 */
		public String toString() {
			return String.format("Append %,d chars to String\n", count);
		}
}
