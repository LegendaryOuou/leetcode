class Solution {
	/*
	第93个测试样例就超时了
	*/
    boolean hasRing;
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int len = graph.length;
        List<Integer> ans = new LinkedList<>();
        List<Integer> stack = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            hasRing = false;
            deepFirst(graph,i,stack);
            if(!hasRing){
                ans.add(i);
            }
        }
        return ans;
    }
    private void deepFirst(int[][] graph, int node, List<Integer> stack){
        if(stack.contains(node)){
            hasRing = true;
            return;
        }
        stack.add(0, node);
        int[] sons = graph[node];
        if(sons.length>0){
            for (int num : sons) {
                deepFirst(graph, num, stack);
                if(hasRing==true) return;
            }
        }
        stack.remove(0);
    }
}

class Solution {
	/*
	继续超时
	*/
    boolean hasRing;
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int len = graph.length;
        List<Integer> ans = new LinkedList<>();
        int[] ringList = new int[len];
        List<Integer> stack = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            hasRing = false;
            if(ringList[i]!=0) continue;
            stack.clear();
            deepFirst(graph,i,stack);
            Iterator<Integer> iterator = stack.iterator();
            while(iterator.hasNext()){
                ringList[iterator.next()]=1;
            }
            if(!hasRing&&ringList[i]==0){
                ans.add(i);

            }
        }

        return ans;
    }
    private void deepFirst(int[][] graph, int node, List<Integer> stack){
        if(stack.contains(node)){
            hasRing = true;
            return;
        }
        stack.add(0, node);
        int[] sons = graph[node];
        if(sons.length>0){
            for (int num : sons) {
                deepFirst(graph, num, stack);
                if(hasRing==true) return;
            }
        }
        stack.remove(0);
    }
}

class Solution {
	/*官方解答*/
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int len = graph.length;
        List<Integer> ans = new LinkedList<>();
        int[] color = new int[len];
        for(int i=0;i<len;i++){
            if(visit(graph,color, i)){
                ans.add(i);
            }
        }
        return ans;
    }
    private boolean visit(int[][] graph,int[] color, int node){
        if(color[node]>0) return color[node]==2;
        color[node]=1;
        for(int num:graph[node]){
            if(!visit(graph, color, num)){
                return false;
            }
        }
        color[node]=2;
        return true;
    }
}