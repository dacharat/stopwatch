package stopWatch;
/**
 * Append chars to a String.
 * 
 * @author Dacharat Pankong
 *
 */
public class AppendToStringBuilder implements Runnable{
	
		private int count;
		
		private String result;

		/**
		 * 
		 * @param count is length of final String.
		 *            
		 */
		public AppendToStringBuilder(int count) {
			this.count = count;
		}

		/**
		 * Add 'a' to string until it reaches final size.
		 * 
		 */
		@Override
		public void run() {
			final char CHAR = 'a';
			StringBuilder builder = new StringBuilder();
			int k = 0;
			while (k++ < count) {
				builder = builder.append(CHAR);
			}
			// now create a String from the result, to be compatible with task 1.
			result = builder.toString();
			
		}

		/**
		 * @return the task.
		 *         
		 */
		public String toString() {
			return String.format("Append %,d chars to StringBuilder\n", count);
		}

}
