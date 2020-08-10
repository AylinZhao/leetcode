class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	if (nums == null || nums.length == 0) return list;
    	int n = nums.length;
    	qsort(nums, 0, n - 1);
    	int pivot = 1;
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] > pivot) {
    			miss(list, pivot, nums[i]);
    			pivot = nums[i] + 1;
    		} else if (nums[i] == pivot) {
				pivot++;
            } else if (nums[i] < pivot) {
    			continue;
    		}
    	}
        if (pivot <= n) {
    		miss(list, pivot, n + 1);
    	}
    	return (list);
    }
    public void miss(ArrayList<Integer> list, int pivot, int num) {
    	for (int i = pivot; i < num; i++) {
    		list.add(i);
    	}
    }
    public int[] qsort(int arr[], int start, int end) {        
        int pivot = arr[start];        
        int i = start;        
        int j = end;        
        while (i < j) {            
            while ((i < j) && (arr[j] > pivot)) {                
                j--;            
            }            
            while ((i < j) && (arr[i] < pivot)) {                
                i++;            
            }            
            if ((arr[i] == arr[j]) && (i < j)) {                
                i++;            
            } else {                
                int temp = arr[i];                
                arr[i] = arr[j];                
                arr[j] = temp;            
            }        
        }        
        if (i - 1 > start) arr = qsort(arr, start, i - 1);        
        if (j + 1 < end) arr = qsort(arr, j + 1, end);        
        return (arr);    
    }   
}