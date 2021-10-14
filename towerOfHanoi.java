
public class towerOfHanoi 
{
	public static void hanoi(int n, int start, int temp, int end)
	{
		//System.out.println("N int level: " + n + ", Start: " + start + ", Middle: " + temp + ", End: " + end);
		if(n == 1)
		{
			System.out.println("Take disc 1 from rod " + start + " to rod " + end);
			return;
		}
		else {
			hanoi(n-1, start, end, temp);
			//System.out.println("N int level: " + n + ", Start: " + start + ", Middle: " + temp + ", End: " + end);
			System.out.println("Take disk " + n + " from rod " + start + " to rod " + end);
			hanoi(n-1, temp, start, end);
			//System.out.println("N int level: " + n + ", Start: " + start + ", Middle: " + temp + ", End: " + end);

		}
	}
	
	
	public static void main (String [] args)
	{
		hanoi(7, 1, 2, 3);
		System.out.println();
		
		//hanoi(12, 1, 2, 3);
		//System.out.println();
		
		//hanoi(100, 1, 2, 3);
		//System.out.println();
	}
}
