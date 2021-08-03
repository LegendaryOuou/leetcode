class LRUCache {
	/*
	第21/21个测试样例超时
	
	看了题解，发现要自己实现双向队列，这样能够在O(1)时间内删除指定节点，就不会超时了
	*/
    Map<Integer,Integer> map;
    List<Integer> queue;
    int size=0;
    int capacity=0;
    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Iterator<Integer> iterator = queue.iterator();
            while(iterator.hasNext()){
                if(iterator.next()==key) {
                    iterator.remove();
                    break;
                }
            }
            queue.add(key);
            return map.get(key);
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,value);
            Iterator<Integer> iterator = queue.iterator();
            while(iterator.hasNext()){
                if(iterator.next()==key) {
                    iterator.remove();
                    break;
                }
            }
            queue.add(key);
        }else{
            if(size<capacity){
                map.put(key,value);
                queue.add(key);
                size++;
            }else{
                map.remove(queue.remove(0));
                map.put(key,value);
                queue.add(key);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */