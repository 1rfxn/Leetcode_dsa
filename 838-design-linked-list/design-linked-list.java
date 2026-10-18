class MyLinkedList {
    class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            next = null;
        }
    }
    Node head;
    int s;
    public MyLinkedList() {
        head = new Node(0);
        s = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= s)
            return -1;
        Node dmy = head.next;
        for(int i = 0 ; i < index ; i++)
        {
            dmy = dmy.next;
        }
        return dmy.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(s,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > s)
            return;
        Node dmy = head;
        for(int i = 0 ; i < index; i++)
        {
            dmy = dmy.next;
        }
        Node d = dmy.next;
        dmy.next = new Node(val);
        dmy = dmy.next;
        dmy.next = d;
        s++;      
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= s)
            return;
        Node dmy = head;
        for(int i = 0 ; i < index ; i++)
        {
            dmy = dmy.next;
        }
        dmy.next = dmy.next.next;
        s--;
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