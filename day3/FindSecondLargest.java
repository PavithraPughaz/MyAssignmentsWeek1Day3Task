package week1.day3;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		int temp;
		int length = data.length;
		Arrays.sort(data);
		System.out.println("Second Largest number");
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<data.length;j++)
			{
				if(data[i]>data[j])
				{
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
			
		}
		System.out.println(data[length-2]);
	}


	}


