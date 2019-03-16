class Labques {
	public int getSecondSmallest(int[] arr)
	{
		int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		return arr[1];
	}
	public static void main(String[] args) {
		System.out.println("Enter number of elements in array : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Enter elements in array : ");
		int[] a = new int[num]; //a is entered array
		for(int i=0;i<num;i++)
		{
			a[i]=s.nextInt();
		}
		Labques l= new Labques();
		
		System.out.println("Second smallest element in the array is "+l.getSecondSmallest(a));
	}

}