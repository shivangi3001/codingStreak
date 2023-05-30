// leetcode daily challenge - 30th May

class MyHashSet {

    List<Integer> l1;

    public MyHashSet() {
        l1 = new ArrayList<>();    
    }
    
    public void add(int key) {
        if(!l1.contains(key))  l1.add(key);
    }
    
    public void remove(int key) {
        if(l1.contains(key)){
            int a = l1.indexOf(key);
            l1.remove(a);
        }
    }
    
    public boolean contains(int key) {
        if(l1.contains(key))  return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */