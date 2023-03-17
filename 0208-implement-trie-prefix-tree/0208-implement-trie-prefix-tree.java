// daily leetcode challenge - 17th March
// Runtime: 35 ms      Beats: 94.22%

class TrieNode{
    boolean isComplete;
    TrieNode[] children;

    TrieNode(){
        isComplete = false;
        children = new TrieNode[26];
    }
}


class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()){
            int idx = c - 'a';
            if(node.children[idx] == null){
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isComplete = true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()){
            int idx = c-'a';
            if(node.children[idx] == null) return false;
            node = node.children[idx];
        }
        return node.isComplete;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c : prefix.toCharArray()){
            int idx = c-'a';
            if(node.children[idx] == null)  return false;
            node = node.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */