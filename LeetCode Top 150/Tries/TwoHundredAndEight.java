package Tries;

public class TwoHundredAndEight {
    class TrieNode {
        TrieNode[] children;
        boolean terminalNode;
    
        public void Trie() {
            children = new TrieNode[26];
    
            terminalNode = false;
    
        }
    }
    
    class Trie {
        private TrieNode root;
    
        public void Trie() {
            root = new TrieNode();
        }
        
        public void insert(String word) {
            TrieNode currNode = root;
    
            for (int i = 0; i < word.length(); i++) {
                char currChar = word.charAt(i);
    
                if (currNode.children[currChar - 'a'] == null) {
                    currNode.children[currChar - 'a'] = new TrieNode();
                }
                currNode = currNode.children[currChar - 'a'];
            }
    
            currNode.terminalNode = true;
    
        }
        
        public boolean search(String word) {
            TrieNode currNode = root;
    
            for (int i = 0; i < word.length(); i++) {
                char currChar = word.charAt(i);
    
                if (currNode.children[currChar - 'a'] == null) {
                    return false;
                }
                currNode = currNode.children[currChar - 'a'];
            }
    
            return currNode.terminalNode;
        }
        
        public boolean startsWith(String prefix) {
            TrieNode currNode = root;
    
            for (int i = 0; i < prefix.length(); i++) {
                char currChar = prefix.charAt(i);
    
                if (currNode.children[currChar - 'a'] == null) {
                    return false;
                }
                currNode = currNode.children[currChar - 'a'];
            }
    
            return !currNode.terminalNode;
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
