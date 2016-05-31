// Given a list_of_ints, find the highest_product you can get from three of the integers.
// The input list_of_ints will always have at least three integers.
public class Highest_Product {
	public static Integer HighestProduct(int arr[]) {
			// write the body of your function here
			if((arr==null)||(arr.length<3)) {
				 return null;
			} else {
				int ans[] =findMaxMin(arr);
				int max1 = ans[0];
				int max2 = ans[1];
				int max3 = ans[2];

				//int min[] = findTwoMin(arr);
				int min1 = ans[3];
				int min2 = ans[4];

				return (max1*max2*max3)>(max1*min1*min2)?(max1*max2*max3):(max1*min1*min2);
			}
	}
	public static int[] findMaxMin(int arr[])
	{
		int max1, max2,max3,min1,min2;
		max1=max2=max3=min1=min2=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			// Max finding
			if(arr[i]>=max1)
			{
				max3 = max2;
				max2 = max1;
				max1 = arr[i];
			}
			else if((arr[i]>=max2)&&(arr[i]<max1))
			{
				max3 = max2;
				max2 = arr[i];
			}
			else if((arr[i]>=max3)&&(arr[i]<max2))
			{
				max3 = max2;
			}
			// Min finding
			if(arr[i]<=min1)
			{
				min2 = min1;
				min1 = arr[i];
			} else if((arr[i]<=min2)&&(arr[i]>min1))
			{
				min2 = arr[i];
			}
		}
		return new int[]{max1,max2,max3,min1,min2};
	 }
	public static void main(String[] args) {
		int arr[] = new int[]{1,-1,0,3,-2,3,0,-2,7};
		int arr1[] = new int[]{1,-1,1,7,-2,3,222,-2,3};
		int arr2[] = new int[]{1,-1,-11,3,-2,13,2,-2,3};
		int arr3[] = new int[]{1,-1,1,0,-2,-33,2,-2,3};
		int arr4[] = new int[]{1,-1};
		System.out.println(HighestProduct(arr));
		System.out.println(HighestProduct(arr1));
		System.out.println(HighestProduct(arr2));
		System.out.println(HighestProduct(arr3));
		System.out.println(HighestProduct(arr4));
	}
}
