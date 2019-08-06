package com.wangyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	����һ���������飬����������������0��Ҫ������ҳ�3�����ĳ˻���ʹ�ó˻����Ҫ��ʱ�临�Ӷȣ�O(n)���ռ临�Ӷȣ�O(1)
	��������:
	������������A[n]
	�������:
	�������������˻�
	����
	3 4 1 2
	
	���
	24
 * 
 */
public class Maxproduct {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        	//����һ��
        bf.readLine();
        String[] str = bf.readLine().split(" ");
        int[] nums=new int[str.length];
        for (int i=0;i<str.length;++i){
            nums[i]=Integer.parseInt(str[i]);
        }
        System.out.println(maximumProduct(nums));
    }
    public static long maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }
   
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max((long)max1*max2*max3, (long)max1*min1*min2);
    }
}