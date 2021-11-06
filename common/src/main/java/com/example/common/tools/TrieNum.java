package com.example.common.tools;

public class TrieNum {
    private TrieNum[] children;
    private boolean isEnd;

    public TrieNum() {
        children = new TrieNum[10];
        isEnd = false;
    }

    public void insert(String word) {
        TrieNum node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNum();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TrieNum node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private TrieNum searchPrefix(String prefix) {
        TrieNum node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
    public static void main(String[] args){
        //好像可以直接数据库筛选啊？？股票代码是定长的吗？
    }
}
