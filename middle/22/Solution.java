class Solution {
	/*
	暴力穷举然后逐个排除。炸了
	
	执行用时：818 ms, 在所有 Java 提交中击败了5.52%的用户
	内存消耗：48.7 MB, 在所有 Java 提交中击败了5.04%的用户
	*/
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 2*n; i++) {
            if(list.size()>0){
                int size = list.size();
                for (int j = 0; j < size; j++) {
                    String remove = list.remove(0);
                    list.add(remove+"(");
                    list.add(remove+")");
                }
            }else{
                list.add("(");
                list.add(")");
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String s = list.get(i);
            if(!fun(s)) {
                list.remove(i);
                i--;
                size--;
            }
        }
        return list;
    }
    private boolean fun(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch:str.toCharArray()){
            if(stack.size()>0&&(ch==')'&&stack.peek()=='(')) stack.pop();
            else stack.push(ch);
        }
        return stack.size()==0;
    }
}

class Solution {
	/*
	小小的改进了一下
	
	执行用时：21 ms, 在所有 Java 提交中击败了5.52%的用户
	内存消耗：39.3 MB, 在所有 Java 提交中击败了5.04%的用户
	*/
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 2*n; i++) {
            if(list.size()>0){
                int size = list.size();
                for (int j = 0; j < size; j++) {
                    String remove = list.remove(0);
                    int left=remove.length()-remove.replace("(","").length();
                    int right=remove.length()-remove.replace(")","").length();
                    if(left<=n&&right<=left){
                        list.add(remove+"(");
                        list.add(remove+")");
                    }
                }
            }else{
                list.add("(");
                list.add(")");
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String s = list.get(i);
            if(!fun(s)) {
                list.remove(i);
                i--;
                size--;
            }
        }
        return list;
    }
    private boolean fun(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch:str.toCharArray()){
            if(stack.size()>0&&(ch==')'&&stack.peek()=='(')) stack.pop();
            else stack.push(ch);
        }
        return stack.size()==0;
    }
}