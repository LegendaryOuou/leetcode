class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        middle = {}
        for index,num in enumerate(nums):
            if num in middle:
                return [middle[num],index]
            middle[target-num]=index