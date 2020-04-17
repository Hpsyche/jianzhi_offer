package com.hpsyche.lru;

import java.util.HashMap;

/**
 * @author hpsyche
 * Create on 2020/2/25
 */
public class LRU {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public Node() {
        }
    }
    private HashMap<Integer,Node> cache=new HashMap<>();
    private int size;
    private int capacity;
    private Node head;
    private Node tail;
    public LRU(int capacity){
        this.size=0;
        this.capacity=capacity;
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
    }
    public void put(int key,int value){
        Node getNode = cache.get(key);
        if(getNode!=null){
            getNode.value=value;
            moveNodeToHead(getNode);
        }else {
            Node newNode = new Node(key, value);
            cache.put(key,newNode);
            addNodeToHead(newNode);
            ++size;
            if(size>capacity){
                removeTailNode();   
                cache.remove(key);
                --size;
            }
        }
    }

    private void removeTailNode() {
        Node getNode=tail.prev;
        removeNode(getNode);
    }

    private void moveNodeToHead(Node node) {
        //1.将node移除
        removeNode(node);
        //2.将node添加至头部
        addNodeToHead(node);
    }

    private void addNodeToHead(Node node) {
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headNext;
        headNext.prev=node;
    }

    private void removeNode(Node node) {
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
    }
}
