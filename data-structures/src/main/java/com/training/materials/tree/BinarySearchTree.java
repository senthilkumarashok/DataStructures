package com.training.materials.tree;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> rootNode;

    public void addElement(T value){
        addNode(this.rootNode, value);
    }

    public void traverse() {
        this.rootNode.traverse();
    }

    private Node<T> addNode(Node<T> node, T value) {
        if(node == null) {
            this.rootNode = new Node<>(value);
            return this.rootNode;
        }
        if(node.leftChild != null && value.compareTo(node.leftChild.value) < 0) {
            node.leftChild = addNode(node.leftChild, value);
        }
        if(node.rightChild != null && value.compareTo(node.rightChild.value) > 0) {
            node.rightChild = addNode(node.rightChild, value);
        }
        return node;
    }

    class Node<T extends Comparable<T>> {

        T value;

        Node<T> leftChild;
        Node<T> rightChild;

        public Node(T value) {
            this.value = value;
            this.leftChild =  null;
            this.rightChild = null;
        }

        public void traverse() {
            if(this.leftChild != null) { this.leftChild.traverse();}
            System.out.println(this.value);
            if(this.rightChild != null) { this.rightChild.traverse();}
        }
    }
}
