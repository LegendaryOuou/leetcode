class Solution(object):
    def longestCommonPrefix(self, strs):
		# 太妙了
        ans = ""
        for item in zip(*strs):
            if len(set(item))==1:
                ans+=item[0]
            else:
                break
        return ans