#include <limits>
#include <iostream>
#include <math.h>
class Solution {
public:
    int maxArea(vector<int>& height) {
        int res = INT_MIN;
        for (int i = 0; i < height.size(); i++) {
            res = max(startMax(i, height), res);
        }
        return res;

    }
    int startMax(int& start, vector<int>& height) {
        int p = start;
        int left = height.at(p);
        int small_height = left;
        int max_water = INT_MIN;
        for (int i = p + 1; i < height.size(); i++) {
            if(height.at(i) >= left) {
                max_water = left * (i - p);
            }
            else max_water = max(height.at(i) * (i - p), max_water);
        }
        return max_water;
    }
};