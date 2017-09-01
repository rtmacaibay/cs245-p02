package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Binary Search (Recursive)";
	}

	@Override
	public int search(int[] arr, int target) {
		return search(arr, target, 0, arr.length - 1);
	}
	
	private int search(int[] arr, int target, int min, int max) {
		if (min >= max)
			return -1;
		
		int mid = (max + min) / 2;
		
		if (arr[mid] == target)
			return mid;
		else if (arr[mid] < target)
			return search(arr, target, mid + 1, max);
		else
			return search(arr, target, min, mid - 1);
	}

}
