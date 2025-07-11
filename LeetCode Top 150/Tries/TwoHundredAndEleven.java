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

    public boolean checkLevel(TrieNode currNode, String word, int pos) {
        char currChar = word.charAt(pos);

        if (currNode.terminalNode == true) {
            return true;
        }

        if (currChar == '.') {
            Boolean found = false;
            for (int i = 0; i < 26; i++) {
                if (currNode.children[i] != null) {
                    Boolean path = checkLevel(currNode.children[i], word, pos++);
                    if (path) {
                        found = path;
                    }
                }
            }

            return found;
        } else {
            if (currNode.children[currChar - 'a'] == null) {
                return false;
            } else {
                return checkLevel(currNode.children[currChar - 'a'], word, pos++);
            }
        }
    }
    
    public boolean search(String word) {
        TrieNode currNode = root;
        return checkLevel(currNode, word, 0);    
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */