class TrieNode {
    TrieNode[] children;
    boolean terminalNode;

    public TrieNode() {
        children = new TrieNode[26];

        terminalNode = false;

    }
}

class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
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

            if (currChar == '.') {
                String remainder = word.substring(i+1, word.length());
                for (int j = 0; j < 26; j++) {
                    return search(remainder);
                }
            } else {
                if (currNode.children[currChar - 'a'] == null) {
                    return false;
                }

                currNode = currNode.children[currChar - 'a'];
            }
        }

        return currNode.terminalNode;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */