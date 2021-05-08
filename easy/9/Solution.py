class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = str(x)
        x1 = list(x)
        x2 = ''.join(reversed(x1))
        if x2==x:
            return True
        else:
            return False
    '''
    # 方法2
    def isPalindrome(self, x: int) -> bool:
        x = str(x)
        for i in range(int(len(x)/2)):
            if x[i]!=x[len(x)-1-i]:
                return False
        return True
    '''