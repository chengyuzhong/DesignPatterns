package com.zhong.compoiste;

/**
 * 组合模式
 *
 * 组合模式组合多个对象形成树形结构以表示“整体-部分”的结构层次。它定义了如何将容器对象和叶子对象进行递归组合，使得客户在使用的过程中无须进行区分，可以对他们进行一致的处理。
 * 在使用组合模式中需要注意一点也是组合模式最关键的地方：叶子对象和组合对象实现相同的接口。
 * 这就是组合模式能够将叶子节点和对象节点进行一致处理的原因。
 */
public class TestCompoiste {

    public static void main(String[] args) {

        Tree tree = new Tree("a");

        TreeNode treeNode = new TreeNode("B");

        TreeNode treeNode2 = new TreeNode("C");

        treeNode.add(treeNode2);

        tree.root.add(treeNode);

        System.out.println(tree);
        // 运行结果 Tree{root=TreeNode{name='a', parent=null, chirld=[TreeNode{name='B', parent=null, chirld=[TreeNode{name='C', parent=null, chirld=[]}]}]}}

    }


}
