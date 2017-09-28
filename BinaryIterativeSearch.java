//package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Binary Search (Iterative)";
	}

	@Override
	public int search(int[] arr, int target) {
		int min = 0;
		int max = arr.length - 1;
		/*
		This should be while (min <= max) or you won't compare the the very last element in a list
		causing a failure on an edge case.
		*/
		while (min < max) {
			int mid = (max + min) / 2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] < target)
				min = mid + 1;
			else
				max = mid - 1;
		}
		
		return -1;
	}

}
