package Quick_Sort;

class PartitionApp
{
	public static void main(String[] args)       //main method
	{
		int maxSize = 16;             // array size
		ArrayPar arr;					// ref to array
		arr = new ArrayPar(maxSize);  // create array

		for(int j=0; j<maxSize; j++)  // fill array with
		{                          // random numbers
			long n = (int)(java.lang.Math.random()*199);
			arr.insert(n);
		}
		
//------------------------------------------------------------------------------------
		arr.display();                // display unsorted array
	      long pivot = 99;              // pivot value = 99
	      System.out.print("Pivot is " + pivot);
	      int size = arr.size();
	                                    // partition array
	      
	      int partDex = arr.partitionIt(0, size-1, pivot);

	      System.out.println(", Partition is at index " + partDex);
	 
	      arr.display();                // display partitioned array
	      
	      System.out.println("แสดงผลการเรียง");	
	      
	      arr.quickSort();			// quickSort
	      arr.quickSort();			// quickSort    
	      arr.display();                // display partitioned array
	      
//------------------------------------------------------------------------------------
	}  // end main()
	
}  // end class QuickSort1App
