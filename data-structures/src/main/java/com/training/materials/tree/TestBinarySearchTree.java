package com.training.materials.tree;

public class TestBinarySearchTree {

    public static void main(String args[]){
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.addElement(2);
        binarySearchTree.addElement(1);
        binarySearchTree.addElement(3);
        binarySearchTree.addElement(4);
        binarySearchTree.traverse();
    }
}
