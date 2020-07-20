class Solution {
    public String[] to19 = "One Two Three Four Five Six Seven Eight Nine Ten Eleven Twelve Thirteen Fourteen Fifteen Sixteen Seventeen Eighteen Nineteen".split(" ");
    public String[] tens = "Twenty Thirty Forty Fifty Sixty Seventy Eighty Ninety".split(" ");
    public String[] suffix = "Thousand Million Billion".split(" "); 
    public String res = "";
    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        int[] bits = new int[15];
        int p = 0;
        while (num != 0) {
            int bit = num % 10;
            num = num / 10;
            bits[p] = bit;
            p++;
        }
        int start = 0;
        readthree(bits, 0);
        for (int i = 3; i < bits.length; i = i + 3) {
            if (bits[i] == 0 && bits[i + 1] == 0 && bits[i + 2] == 0) continue;
            if ((i / 3) > 3) break;
            if (res.equals("")) res = suffix[(i / 3) - 1] + res;
            else res = suffix[(i / 3) - 1] + " " + res;            
            readthree(bits, i);
            // System.out.println("current res : " + res);
        }
        return res;
    }
    public void readthree(int[] bits, int start) {
        if (bits[start] == 0 &&  bits[start + 1] == 0 && bits[start +  2] == 0) return;
        if (bits[start + 1] < 2) {
            int index = bits[start + 1] * 10 + bits[start];
            if (index != 0) {    
                if (res.equals("")) res = to19[index - 1] + res; 
                else res = to19[index - 1] + " " + res;
            }
        } else if (bits[start + 1] >= 2 && bits[start] == 0) {
            if (res.equals("")) res = tens[bits[start + 1] -  2] + res; 
            else res = tens[bits[start + 1] -  2] + " " + res;
        } else if (bits[start + 1] >= 2 && bits[start] != 0) {
            if (res.equals("")) res = tens[bits[start + 1] -  2] + " " + to19[bits[start] - 1] + res; 
            else res = tens[bits[start + 1] -  2] +  " " + to19[bits[start] - 1] + " " + res;
        }
        if (bits[start + 2] != 0) {
            if (res.equals("")) res = to19[bits[start + 2] - 1] + " " + "Hundred" + res;
            else res = to19[bits[start + 2] - 1] + " " + "Hundred" + " " + res;
        }
    }
}

//1103
//
// 输入: 123
// 输出: "One Hundred Twenty Three"
// 1213
// 
// 输入: 1234567891
// 输出: "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One"

// 输入: 1234567
// 输出: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven

