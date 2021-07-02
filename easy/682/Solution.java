class Solution {
	/*
	执行用时：3 ms, 在所有 Java 提交中击败了85.13%的用户
	内存消耗：37.3 MB, 在所有 Java 提交中击败了93.56%的用户
	*/
    public int calPoints(String[] ops) {
        List<Integer> list = new LinkedList<>();
        for(String op:ops){
            //char ch=op.toCharArray()[0];
            int size = list.size();
            if(op.equals("+")) list.add(list.get(size-2)+list.get(size-1));
            else if(op.equals("C")) list.remove(size-1);
            else if(op.equals("D")) list.add(list.get(size-1)*2);
            else list.add(Integer.parseInt(op));
        }
        Iterator<Integer> it = list.iterator();
        int sum=0;
        while(it.hasNext()){
            sum+=it.next();
        }
        return sum;
    }
}