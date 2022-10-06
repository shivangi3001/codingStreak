class TimeMap {
    HashMap<String, TreeMap<Integer, String>> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
            TreeMap<Integer, String> hm2 = new TreeMap<>();
            hm2.put(timestamp, value);
            hm.put(key, hm2);
        }
        else  hm.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(hm.containsKey(key)){
            if(hm.get(key).containsKey(timestamp))  return hm.get(key).get(timestamp);
            else{
                Integer prev = hm.get(key).floorKey(timestamp);
                if(prev != null)   return hm.get(key).get(prev);
            }
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */