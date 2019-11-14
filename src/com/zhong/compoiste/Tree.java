package com.zhong.compoiste;

public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }


    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
