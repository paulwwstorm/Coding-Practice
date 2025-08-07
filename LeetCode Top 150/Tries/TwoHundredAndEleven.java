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

        if (pos == word.length()-1) {
            if (currChar == '.') {
                for (int i = 0; i < 26; i++) {
                    if (currNode.children[i] != null) {
                        if (currNode.children[i].terminalNode) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (currNode.children[currChar - 'a'] != null && currNode.children[currChar - 'a'].terminalNode) {
                return true;
            }
        } else if (currChar == '.') {
            for (int i = 0; i < 26; i++) {
                if (currNode.children[i] != null) {
                    int next = pos+1;
                    Boolean path = checkLevel(currNode.children[i], word, next);
                    if (path) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            if (currNode.children[currChar - 'a'] == null) {
                return false;
            } else {
                pos++;
                return checkLevel(currNode.children[currChar - 'a'], word, pos);
            }
        }

        return false;
    }
    
    public boolean search(String word) {
        TrieNode currNode = root;
        return checkLevel(currNode, word, 0);    
    }
}

