Int dcrCount = 0;
		int longestLen = 0;
		int spikeCount = 0;
		boolean flag = false;
		
		for (int i = 0; i < input2 - 1; i++) {			
			if (input1[i] > input1[i + 1]) {
				if (flag == false) {
					flag = true;
					spikeCount++;
				}
				
				dcrCount++;
				//System.out.println(dcrCount);
				longestLen = dcrCount > longestLen ? dcrCount : longestLen; 
			} else {
				if (flag == true) {
					flag = false;
					dcrCount = 0;
				}
			}
		}
		
		if (spikeCount > 0) longestLen++; // fixing fence post error
        
		return new Result(spikeCount, longestLen);
