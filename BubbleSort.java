import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes = myNums.length-1;
		int comparisons = myNums.length-1;
		int tempNum;

		//Loop once for each pass, where passes is one less than the number of items.
		for(int i = 1; passes > i; i++)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(int comp = 1; comparisons > comp; comp++)
			{
				//If they are out of order, swap the values
				if(myNums[i] > myNums[i+1])
				{
					tempNum = myNums[i];
					myNums[i] = myNums[i+1];
					myNums[i+1] = tempNum;

				}
			//End Loop for comparisons
			}
    
			//The next pass will use one less comparison
			comparisons--;
    
		//End Loop for passes
		passes--;
		}
			

		System.out.println(Arrays.toString(myNums));

  }
}
