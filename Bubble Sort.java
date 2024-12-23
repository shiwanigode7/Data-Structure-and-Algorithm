public class BubbleSort {

	public static void main(String[] args) {

		int temp = 0;
		int[] nums = { 26, 4, 6, 1 };
		int arrayLength = nums.length;

		for (int i = 0; i < arrayLength; i++) {
			for (int j = 1; j < (arrayLength - i); j++) {
				if (nums[j - 1] > nums[j]) {
					temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}

		for (int i = 0; i < arrayLength; i++) {
			System.out.println(nums[i]);
		}
	}

}
