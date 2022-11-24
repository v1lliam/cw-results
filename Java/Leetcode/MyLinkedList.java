package Java.Leetcode;

import java.util.ArrayList;

class MyLinkedList {
    
    ArrayList<Integer> list;
    
    public MyLinkedList() {
        list = new ArrayList<>();
    }
    
    public int get(int index) {
        if (index >= list.size()) return -1;  
        return list.get(index);
    }
    
    public void addAtHead(int val) {
        list.add(0, val);
    }
    
    public void addAtTail(int val) {
        list.add(list.size(), val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > list.size()) return;
        list.add(index, val);
    }
    
    public void deleteAtIndex(int index) {
        if(index >= list.size()) return;
        list.remove(index);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */