class Solution {
    public int dayOfYear(String date) {
    	// 2019-04-19 
    	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    	int year =  Integer.parseInt(date.substring(0, 4));
    	int month = Integer.parseInt(date.substring(5, 7));
    	int day = Integer.parseInt(date.substring(8, 10));
    	int res = 0;
    	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) days[1] = 29; 
    	for (int i = 0; i < (month - 1); i++) {
    		res += days[i];
    	}
    	res += day;
    	return res;
    }
}

// date.length == 10
// date[4] == date[7] == '-'，其他的 date[i] 都是数字。
// date 表示的范围从 1900 年 1 月 1 日至 2019 年 12 月 31 日。
