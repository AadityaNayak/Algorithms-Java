package algorithms;

public class A11MaximumProductSubarray {

	public static void main(String args[]) {

		int size = 5;
		int arr[] = { -2, -40, 0, -2, -3};
		int max_pro = 1;
		int current_pro = 1;

		for (int i = 0; i < size; i++) {
			current_pro = 1;
			for (int j = 0; j < size-i; j++) {
				current_pro *= arr[j];
			}
			if(max_pro<current_pro) {
				max_pro = current_pro;
			}
		}
		
		if(arr[size-1]>max_pro) {
			max_pro = arr[size-1];
		}
		
		System.out.println(max_pro);

	}

}
