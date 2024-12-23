public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = { 4, 8, -7, 6, 7, 2 };
		int arrayLength = nums.length;

		for (int i = 0; i < arrayLength-1; i++) {
			int minIndex = i;
			
			for (int j = i + 1; j < arrayLength; j++) {  
                if (nums[j] < nums[minIndex]) {  
                    minIndex = j;  
                }  
            }
			
			int temp = nums[minIndex];  
            nums[minIndex] = nums[i];  
            nums[i] = temp; 
		}
		
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
