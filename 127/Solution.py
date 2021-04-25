class Solution:
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        if beginWord in wordList:
            wordList.remove(beginWord)
        if endWord not in wordList:
            return 0
        visited=[]
        word_dict = {}
        for i in range(len(wordList)):
            visited.append(0)
            word_dict[wordList[i]]=i
        queue = [beginWord]
        result = 1
        while len(queue)>0:
            new_queue = []
            for word in queue:
                for i in range(len(word)):
                    originChar = word[i]
                    for ch in [chr(i) for i in range(ord("a"),ord("z")+1)]:
                        if ch == originChar:
                            continue
                        word_=word[:i]+ch+word[i+1:]
                        if word_ in word_dict:
                            if word_==endWord:
                                return result+1
                            if visited[word_dict[word_]]==0:
                                # print(word,word_)
                                new_queue.append(word_)
                                visited[word_dict[word_]]=1
                    word=word[:i]+originChar+word[i+1:]
            result+=1
            if len(new_queue)==0:
                return 0
            queue=new_queue