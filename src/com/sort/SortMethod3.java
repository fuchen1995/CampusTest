package com.sort;


public class SortMethod3 {

	/**
     * 快速排序
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int maxIndex = partition(array, start, end);
        if (maxIndex > start)
            QuickSort(array, start, maxIndex - 1);
        if (maxIndex < end)
            QuickSort(array, maxIndex + 1, end);
        return array;
    }
    /**
     * 
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int maxIndex = start - 1;
        for (int i = start; i <= end; i++)
            if (array[i] <= pivot) {
            	maxIndex++;
                if (i > maxIndex)
                    swap(array, i, maxIndex);
            }
        return maxIndex;
    }

    /**
     * 
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
		int[] array = new int[] {2,1,3,5,6,4,3,8,9}; 
		int[] result= QuickSort(array, 0, array.length-1);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}
