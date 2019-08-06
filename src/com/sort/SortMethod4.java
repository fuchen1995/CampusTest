package com.sort;


public class SortMethod4 {
	
	static int len;
	    /**
	     * 
	     *
	     * @param array
	     * @return
	     */
	    public static int[] HeapSort(int[] array) {
	        len = array.length;
	        if (len < 1) return array;
	        buildMaxHeap(array); //初次通过数据构建一个大顶堆
	        while (len > 0) {
	            swap(array, 0, len - 1);
	            len--;
	            adjustHeap(array, 0);
	        }
	        return array;
	    }
	    /**
	     *
	     * @param array
	     */
	    public static void buildMaxHeap(int[] array) {
	        for (int i = (len/2 - 1); i >= 0; i--) { 
	            adjustHeap(array, i);
	        }
	    }
	    /**
	     *
	     * @param array
	     * @param i
	     */
	public static void adjustHeap(int[] array, int i) {
		if (i * 2 < len) {
			int maxIndex = i;
			int left = i * 2 + 1;
			int right = i * 2 + 2;
			if (left < len && array[left] > array[maxIndex])
				maxIndex = left;
			if (right < len && array[right] > array[maxIndex])
				maxIndex = right;
			if (maxIndex != i) {
				swap(array, maxIndex, i);
				adjustHeap(array, maxIndex);
			}
		}

	}
	    public static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	    
	    public static void main(String[] args) {
	    	int[] array = new int[] {2,1,3,5,6,4,3,8,9}; 
	    	HeapSort(array);
			for (int i : array) {
				System.out.print(i + " ");
			}
		}
}
