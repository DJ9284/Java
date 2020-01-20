package ab;

public class Bubble_Sort 
{
	public void Bubblesort(int array[])
	{
		int temp=0;
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String args[])
	{
		int array[]= {5,4,3,2,1};
		Bubble_Sort s=new Bubble_Sort();
		s.Bubblesort(array);
		
		
		for(int j=0;j<array.length;j++)
		{
			System.out.println(array[j]+" ");
		}
	}

}
