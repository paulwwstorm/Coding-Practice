package Tries;

public class TwoHundredAndEight {
    class TrieNode {
        TrieNode children;
        boolean terminalNode;
    
        public Trie() {
            children = new TrieNode[26];
    
            terminalNode = false;
    
        }
    }
    
    class Trie {
        private TrieNode root;
    
        public Trie() {
            root = new TrieNode();
        }
        
        public void insert(String word) {
            TrieNode currNode = root;
    
            for (int i = 0; i < word.length(); i++) {
                char curr = word.charAt(i);
    
                if (current.children[ch - 'a'] == null) {
                    current.children[ch - 'a'] = new TrieNode();
                }
                currNode = currNode.children[ch - 'a'];
            }
    
            currNode.terminalNode = true;
    
        }
        
        public boolean search(String word) {
            Trie currNode = root;
    
            for (int i = 0; i < word.length(); i++) {
                char curr = word.charAt(i);
    
                for (int j = 0; j < 26; j++) {
                    if (currNode.children[j] )
                }
            }
        }
        
        public boolean startsWith(String prefix) {
            
        }
    }
    
    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */
}
