#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> hash_map;
        decltype(nums.size()) i;
        for (i = 0; i < nums.size();i++) {
            auto iter = hash_map.find(nums[i]);
            if (iter) {
                return { iter->second,i };
            }
            hash_map.insert(pair<int, int>(target - nums[i], i));
        }
        return {};
    }
};
