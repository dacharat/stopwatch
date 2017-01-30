# Stopwatch tasks by Dacharat Pankong (5910546643)
I ran the tasks on a HP ProBook, and got
these results:

Task | Time
--------------------------------------|-------:
Append 50,000 chars to String | 0.860225 sec
Append 100,000 chars to String | 3.135700 sec
Append 100,000 chars to StringBuilder | 0.002766 sec
Add 1 billion double using array | 1.583643 sec
Add 1 billion Double using array | 5.096993 sec
Add 1 billion BigDecimal using array | 9.406330 sec

## Explanation of Results

Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
 * Because 100,000 chars is more than 50,000 chars that 100,000 chars will take more time than 50,000 chars.

Why is appending to StringBuilder so much different than appending to String? What is happening to the String?
 * Because String will create a new string and replace old String but StringBuilder is add a new string CHAR to a char[]. 

Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?
 * double  is the fastest because double is primitive type
 * Double is middle because when a number added to a class will use more time than double. 
 * BigDecimal is the slowest because BigDecimal have a precision number that will take more time.