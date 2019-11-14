package com.zhong.compoiste;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class TreeNode {

    private String name;

    private TreeNode parent;

    List<TreeNode> chirld = new ArrayList();

    public TreeNode(String name){
        this.name = name;
    }

    //添加孩子节点
    public void add(TreeNode node){
        chirld.add(node);
    }

    //删除孩子节点
    public void remove(TreeNode node){
        chirld.remove(node);
    }

    //取得孩子节点
    public String getChildren(){
        return chirld.toString();
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public List<TreeNode> getChirld() {
        return chirld;
    }

    public void setChirld(List<TreeNode> chirld) {
        this.chirld = chirld;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "name='" + name + '\'' +
                ", parent=" + parent +
                ", chirld=" + chirld +
                '}';
    }
}
