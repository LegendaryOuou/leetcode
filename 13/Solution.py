class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        result = 0
        index = 0
        while True:
            flag=True
            if s[index]=='I':
                if index+1<len(s):
                    if s[index+1]=='V':
                        result+=4
                        flag = False
                    elif s[index+1]=='X':
                        result+=9
                        flag=False
                if flag:
                    result+=1
                    index+=1
                else:
                    index+=2
            elif s[index]=='X':
                if index+1<len(s):
                    if s[index+1]=='L':
                        result+=40
                        flag = False
                    elif s[index+1]=='C':
                        result+=90
                        flag=False
                if flag:
                    result+=10
                    index+=1
                else:
                    index+=2
            elif s[index]=='C':
                if index+1<len(s):
                    if s[index+1]=='D':
                        result+=400
                        flag = False
                    elif s[index+1]=='M':
                        result+=900
                        flag=False
                if flag:
                    result+=100
                    index+=1
                else:
                    index+=2
            elif s[index]=='V':
                result+=5
                index+=1
            elif s[index]=='L':
                result+=50
                index+=1
            elif s[index]=='D':
                result+=500
                index+=1
            elif s[index]=='M':
                result+=1000
                index+=1
            if index>=len(s):
                break
        return result


