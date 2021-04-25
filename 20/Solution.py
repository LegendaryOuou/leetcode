class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = [s[0]]
        s = s[1:]
        for item in s:
            if item=='(':
                stack.append('(')
            if item=='[':
                stack.append('[')
            if item=='{':
                stack.append('{')
            if item==')':
                if len(stack)>0 and stack[-1]=='(':
                    stack.pop()
                else:
                    return False
            if item==']':
                if len(stack)>0 and stack[-1]=='[':
                    stack.pop()
                else:
                    return False
            if item=='}':
                if len(stack)>0 and stack[-1]=='{':
                    stack.pop()
                else:
                    return False
        if len(stack)==0:
            return True
        else:
            return False
