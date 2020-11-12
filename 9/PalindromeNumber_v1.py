class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = str(x)
        x1 = list(x)
        x2 = ''.join(reversed(x1))
        if x2==x:
            return True
        else:
            return False