package com.baidu;

public class Test01 {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public int minGasStation(int numOfGS, int[] distOfGS, int[] allowedGasoline, int distance, int initialGasoline) {
		// WRITE YOUR CODE HERE
		if (distOfGS == null || distOfGS.length == 0) {
			return -1;
		}
		int jump = 0;
		int cur = initialGasoline;
		int next = 0;

		for (int i = 0; i < distOfGS.length; i++) {
			if (cur > distance) {
				break;
			} else {
				if (cur < distOfGS[i]) {
					jump++;
					cur = next;
				}
				next = Math.max(next, cur + allowedGasoline[i]);

			}
		}
		if (cur >= distance) {
			return jump;
		}
		return -1;
	}

	// METHOD SIGNATURE ENDS
}
