class TimeMap {
	/*
	内存消耗拉到最低
	
	执行用时：316 ms, 在所有 Java 提交中击败了6.05%的用户
	内存消耗：104.7 MB, 在所有 Java 提交中击败了100.00%的用户
	*/
    Map<Map<String,String>,Integer> map;
    /** Initialize your data structure here. */
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        Map<String,String> vt = new HashMap<>();
        vt.put(key,value);
        map.put(vt,timestamp);
    }

    public String get(String key, int timestamp) {
        int max=-1;
        String res="";
        for(Map<String,String> vt : map.keySet()){
            int ts=map.get(vt);
            if(ts<=timestamp&&ts>max&&vt.get(key)!=null){
                max=ts;
                res=vt.get(key);
            }
        }
        return res;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */